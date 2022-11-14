@file:Suppress("unused")

package edu.uwaterloo.cs.todo.lib

import kotlinx.serialization.decodeFromString
import kotlinx.serialization.encodeToString
import kotlinx.serialization.json.Json
import java.io.File
import java.security.MessageDigest
import kotlin.text.Charsets.UTF_8


actual fun readConfigFile(configFilePath: String): Pair<Boolean, CloudServiceConfig?> {
    val configFile = File(configFilePath)

    return if (configFile.exists()) {
        try {
            val content = configFile.readText()
            val output = Json.decodeFromString<CloudServiceConfig>(content)
            Pair(true, output)
        } catch (_: Exception) {
            Pair(false, null)
        }
    } else Pair(true, null)
}

actual fun writeConfigFile(config: CloudServiceConfig, configFilePath: String): Boolean {
    val configFile = File(configFilePath)

    return try {
        val configContent = Json.encodeToString(config)
        configFile.writeText(configContent)
        true
    } catch (_: Exception) {
        false
    }
}

actual fun getHashedPassword(userName: String, password: String): ByteArray =
    MessageDigest.getInstance("MD5").digest("$userName:$realm:$password".toByteArray(UTF_8))


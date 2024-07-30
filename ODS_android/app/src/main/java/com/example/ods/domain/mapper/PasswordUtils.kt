package com.example.ods.domain.mapper

import android.util.Base64
import java.security.MessageDigest
import java.security.SecureRandom

fun generateSalt(): String {
    val random = SecureRandom()
    val salt = ByteArray(16)
    random.nextBytes(salt)
    return Base64.encodeToString(salt, Base64.DEFAULT)
}

fun hashPassword(password: String, salt: String): String {
    val md = MessageDigest.getInstance("SHA-256")
    val saltedPassword = password + salt
    val hashedBytes = md.digest(saltedPassword.toByteArray())
    return Base64.encodeToString(hashedBytes, Base64.DEFAULT)
}

fun verifyPassword(inputPassword: String, storedPassword: String, storedSalt: String): Boolean {
    val hashedInputPassword = hashPassword(inputPassword, storedSalt)
    return hashedInputPassword == storedPassword
}
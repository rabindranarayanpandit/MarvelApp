package com.marvelapp.utils

import com.marvelapp.BuildConfig
import java.math.BigInteger
import java.security.MessageDigest
import java.util.*


class Constants {

    companion object {
        val ts = Calendar.getInstance().time.time.toString()
        private const val MARVEL_PUBLIC_KEY = "6a34f25883c7b9daaf263723e4ee36fa"
        private const val MARVEL_PRIVATE_KEY = "add7244e69efe69fc06ef79fe107c0c67244d2d9"
        const val BASE_URL = "https://gateway.marvel.com/"
        const val  API_KEY = MARVEL_PUBLIC_KEY
        private const val  PRIVATE_KEY = MARVEL_PRIVATE_KEY

        fun hash() : String{
            val input = "$ts$PRIVATE_KEY$API_KEY"
            val md = MessageDigest.getInstance("MD5")
            return BigInteger(1, md.digest(input.toByteArray())).toString(16).padStart(32, '0')
        }

    }

}
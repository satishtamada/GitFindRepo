package com.msr.satish_git_sdk.network.model

import androidx.room.TypeConverter
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import java.lang.reflect.Type

class Converters {
    @TypeConverter
    fun fromOwner(countryLang: Owner): String? {
        val gson = Gson()
        val type: Type = object : TypeToken<Owner?>() {}.type
        return gson.toJson(countryLang, type)
    }

    @TypeConverter
    fun toOwner(countryLangString: String?): Owner?{
        if (countryLangString == null) {
            return null
        }
        val gson = Gson()
        val type: Type = object : TypeToken<Owner?>() {}.type
        return gson.fromJson<Owner>(countryLangString, type)
    }
}
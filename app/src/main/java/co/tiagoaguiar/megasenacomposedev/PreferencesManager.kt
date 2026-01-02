package co.tiagoaguiar.megasenacomposedev

import android.content.Context
import android.content.SharedPreferences

class PreferencesManager(context: Context) {

    private val prefers = context.getSharedPreferences("megasena", Context.MODE_PRIVATE)

    fun saveData(key: String, value: String) {

        prefers.edit().apply {
            putString(key, value)
            apply()
        }


    }

    fun getData(key: String): String {
        return prefers.getString(
            PREFERS_KEY, ""
        ) ?: ""
    }

}
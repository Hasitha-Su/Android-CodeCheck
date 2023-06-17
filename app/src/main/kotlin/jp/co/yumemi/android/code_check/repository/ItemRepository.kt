package jp.co.yumemi.android.code_check.repository

import android.content.Context
import jp.co.yumemi.android.code_check.model.Item

class ItemRepository(val context: Context) {

    suspend fun searchResults(inputText: String): List<Item> {
        // Networking code
    }
}
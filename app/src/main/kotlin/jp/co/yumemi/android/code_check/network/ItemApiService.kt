package jp.co.yumemi.android.code_check.network

class ItemApiService {
    @GET(END_POINT)
    suspend fun getItems(): Response<ItemResponse>
}
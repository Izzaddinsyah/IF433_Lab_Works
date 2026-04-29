package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week10

data class ApiResponse<T>(
    val status: String,
    val data: T
)
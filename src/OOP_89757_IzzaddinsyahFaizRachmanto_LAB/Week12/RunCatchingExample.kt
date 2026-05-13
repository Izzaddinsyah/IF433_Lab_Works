package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week12

fun main() {
    println("=== TEST RUNCATCHING ===")

    val result: Result<Int> = runCatching {
        "42X".toInt()
    }
}
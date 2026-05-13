package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week12

fun divide(a: Int, b: Int): Int {
    return try {
        a / b
    } catch (e: ArithmeticException) {
        println("Error: ${e.message}")
        -1
    } finally {
        println("Division attempt finished")
    }
}


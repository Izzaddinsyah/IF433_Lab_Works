package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week10

class MathBox<T : Number>(val value1: T, val value2: T) {
    fun sum(): Double {
        return value1.toDouble() + value2.toDouble()
    }
}
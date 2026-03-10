package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week5

abstract class PaymentMethod(val accountName: String) {

    abstract fun processPayment(amount: Double)
}
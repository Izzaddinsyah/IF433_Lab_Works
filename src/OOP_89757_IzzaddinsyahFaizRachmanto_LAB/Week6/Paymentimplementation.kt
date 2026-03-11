package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week6

class Gopay: Paymentmethod {
    override fun pay(amount: Double) {
        println("Processing Rp$amount via Gopay Server")
    }
    class CreditCard: Paymentmethod {
        override fun pay(amount: Double) {println("Contacting Bank for Rp$amount")}
    }
}
package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week5

class CreditCard(accountName: String, val limit: Double) : PaymentMethod(accountName) {

    var usedAmount: Double = 0.0

    override fun processPayment(amount: Double) {

        if (usedAmount + amount <= limit) {
            usedAmount += amount
            println("$accountName berhasil membayar Rp$amount menggunakan Credit Card")
        } else {
            println("$accountName: Transaksi ditolak, melebihi limit kartu")
        }

    }
}

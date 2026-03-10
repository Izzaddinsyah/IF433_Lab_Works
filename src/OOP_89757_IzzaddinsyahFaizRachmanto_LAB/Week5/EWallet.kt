package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week5

class EWallet(accountName: String, var balance: Double) : PaymentMethod(accountName) {

    override fun processPayment(amount: Double) {

        if (balance >= amount) {
            balance -= amount
            println("$accountName berhasil membayar Rp$amount. Sisa saldo: Rp$balance")
        } else {
            println("$accountName: Saldo tidak cukup untuk pembayaran Rp$amount")
        }

    }

    fun topUp(amount: Double) {
        balance += amount
        println("$accountName melakukan top up Rp$amount. Saldo sekarang: Rp$balance")
    }

}
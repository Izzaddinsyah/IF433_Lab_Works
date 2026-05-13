package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week12

class InsufficientFundsException(
    val amount: Double,
    val balance: Double
) : Exception("Attempted $amount, balance: $balance")

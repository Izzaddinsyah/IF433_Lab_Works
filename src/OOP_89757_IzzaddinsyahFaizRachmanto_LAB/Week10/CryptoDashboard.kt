package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.25))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))

    val response = ApiResponse("200 OK", coinRepo.getAll())

    println("=== CRYPTO WALLET DASHBOARD ===")
    println("Status: ${response.status}")
    println()

    println("Coin List:")
    response.data.forEach { coin ->
        println("Coin: ${coin.name}")
        println("Balance: ${coin.balance}")
        println("---------------------")
    }

    val txRepo = WalletRepository<Transaction>()

    txRepo.add(Transaction("TX001", 500.0))
    txRepo.add(Transaction("TX002", 1200.0))
    txRepo.add(Transaction("TX003", 750.0))

    println()
    println("Transaction List:")
    txRepo.getAll().forEach { tx ->
        println("Transaction ID: ${tx.id}")
        println("Amount: ${tx.amount}")
        println("---------------------")
    }

    println()
    println("Search Result:")
    coinRepo.search("BTC").forEach {
        println(it)
    }
}

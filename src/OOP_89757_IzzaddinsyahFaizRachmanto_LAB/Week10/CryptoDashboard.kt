package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week10

fun main() {
    val coinRepo = WalletRepository<Coin>()

    coinRepo.add(Coin("BTC", 0.25))
    coinRepo.add(Coin("ETH", 2.5))
    coinRepo.add(Coin("USDT", 1500.0))
}

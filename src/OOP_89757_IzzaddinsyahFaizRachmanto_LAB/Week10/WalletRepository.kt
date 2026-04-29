package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week10

class WalletRepository<T : Any> {

    private val items = mutableListOf<T>()

    fun add(item: T) {
        items.add(item)
    }

    fun getAll(): List<T> {
        return items
    }

    fun search(keyword: String): List<T> {
        return items.filter {
            it.toString().contains(keyword, ignoreCase = true)
        }
    }
}
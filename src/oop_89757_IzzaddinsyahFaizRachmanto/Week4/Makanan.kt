package oop_89757_IzzaddinsyahFaizRachmanto.Week4

open class Makanan {
    private var namaResto: String = ""
    protected var harga: Int = 0
    protected var stock: Int = 10

    init {
        namaResto = "Steak 12"
        println("Resto Saya $namaResto")  }
   open public fun jual_makanan() {
        println("Saya Jual Makanan")
    }
}
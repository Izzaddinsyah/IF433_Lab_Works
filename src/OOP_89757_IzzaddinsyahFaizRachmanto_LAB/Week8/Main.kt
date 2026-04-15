package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week8

fun Main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?. name?: "Kota Tidak Diketahui"
    println("Tujuan Pengiriman: $destination")

    println("\n=== TEST LET BLOCK ===")
    val validOrder = Order(null, 250000)

    val receipt = validOrder.totalPrice?.let { price->
        val tax = price * 0.11
        "Transkasi Valid, Harga: Rp$price, Pajak: $tax"
    } ?: "Transkasi Invalid: Harga belum di-set!"
    println(receipt)

    println("\n=== TEST SAFE CASTING ===")
    val mixedData: List<Any> = listOf(
        "Smartphone",
        1500000,
        UserProfile("Andi", null),
        "Laptop",
        4500000.0
    )

    for (item in mixedData) {
        val text = item as? String

        text?.let {
            println("Ditemukan teks: ${it.uppercase()}")
        }
    }

    val someObject: Any = 100
    // Coba cast ke String. Jika gagal (null), ganti dengan "Unknown String"
    val safeString = someObject as? String?: "Unknown String"
    println("Hasil cast + fallback: $safeString")

    println("\n=== TEST THE RED BUTTON (!!)===")
    val toxicData: String? =  null
    try {
        val length = toxicData!!.length
    } catch (e: NullPointerException) {
        println("CRASH (NPE)! Jangan gunakan !! secara sembanrangan.")
    }

    val apiRsponse: Map<String, String?> = mapOf("status" to "200", "token" to null)
    try{
        val token = requireNotNull(apiRsponse["token"]){
            "CRITICAL EXCEPTION: Token otentifikasi tidak ditemukan dari server!"
        }
    } catch (e: IllegalArgumenException) {
        println(e.message)
    }
}
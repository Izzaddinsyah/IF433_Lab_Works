package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week8

fun Main() {
    println("=== TEST SAFE CALLS & ELVIS ===")
    val emptyOrder = Order(null, null)

    val destination = emptyOrder.deliveryDetails?.address?.city?. name?: "Kota Tidak Diketahui"
    println("Tujuan Pengiriman: $destination")
}
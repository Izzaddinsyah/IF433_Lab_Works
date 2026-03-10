package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week5

fun Main() {
    val dosen1 = Dosen( nama = "Pak Alex", nidn = "0123456")
    val admin1 = Admin(nama = "Bu Siti")

    val daftarPegawai: List<Pegawai> = listOf(dosen1, admin1)

    println("=== Aktivitas Pegawai ===")
    for (Pegawai in daftarPegawai) {
        for (Pegawai in daftarPegawai) {
            Pegawai.bekerja()
            when (Pegawai) {
                is Dosen -> {
                    println("=> Terdeteksi Sebagai Dosen (NIDN: ${Pegawai.nidn}")
                    Pegawai.mengajar()
                }
                is Admin -> {
                    println("=> Terdeteksi Sebagai Admin")
                    Pegawai.doaAdminWork()
                }
            }
            println(" ----------")
        }
    }

}

fun main() {

    val mathHelper = MathHelper()

    println("=== TEST OVERLOADING ===")

    val luasPersegi = mathHelper.hitungLuas(4)
    println("Luas Persegi: $luasPersegi")

    val luasPersegiPanjang = mathHelper.hitungLuas(5, 3)
    println("Luas Persegi Panjang: $luasPersegiPanjang")

    val luasLingkaran = mathHelper.hitungLuas(7.0)
    println("Luas Lingkaran: $luasLingkaran")

    fun main() {

        println("=== SISTEM PEMBAYARAN ===")

        val ewallet = EWallet("Faiz", 50000.0)
        val creditCard = CreditCard("Faiz", 100000.0)

        val metodePembayaran: List<PaymentMethod> = listOf(ewallet, creditCard)

        for (payment in metodePembayaran) {

            payment.processPayment(75000.0)

            // Smart Casting
            if (payment is EWallet) {

                println("Top up otomatis karena saldo kurang")

                payment.topUp(50000.0)

                payment.processPayment(75000.0)

            }

            println("----------------------")
        }
    }
}
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
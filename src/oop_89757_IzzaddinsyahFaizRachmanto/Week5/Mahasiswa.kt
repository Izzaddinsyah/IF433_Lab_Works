package oop_89757_IzzaddinsyahFaizRachmanto.Week5

class Mahasiswa(
    override val namaOrg:String,
    override val budgetRapat: Int,
    override val jmlOrg:Int,
    override val namaMK: String,
    override val nilaiMK: Int
) : Organisasi, KelasMK {
    override fun rapat() {
        println("Sedang Rapat di $namaOrg");
        println("Biaya Konsum Rapat: ${super.biayaKonsumsi}")
    }
    override fun penilaian() {
        println("Nilai $namaMK adalah $nilaiMK")
    }
    override fun Keaktifan() {
        super<KelasMK>.Keaktifan();
        super<Organisasi>.Keaktifan();
    }
}
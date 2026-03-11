package oop_89757_IzzaddinsyahFaizRachmanto.Week5

interface Organisasi {
    val namaOrg: String
    val budgetRapat: Int
    val jmlOrg: Int
    val biayaKonsumsi: Int
        get() = budgetRapat * jmlOrg

    fun rapat()
    fun Keaktifan(){
        println("Ih Kamu Aktif");
    }
}
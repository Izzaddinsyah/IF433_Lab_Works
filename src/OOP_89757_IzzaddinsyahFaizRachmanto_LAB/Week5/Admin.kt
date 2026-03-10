package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week5

class Admin(nama : String) : Pegawai(nama) {
    override fun bekerja() {
        println("[$nama]")
    }
    fun doaAdminWork() {
        println("[$nama]")
    }
}
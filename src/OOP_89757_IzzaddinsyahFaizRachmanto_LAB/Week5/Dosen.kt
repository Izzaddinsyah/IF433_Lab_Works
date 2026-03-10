package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week5

class Dosen(nama: String, val nidn: String) : Pegawai(nama){
    override fun bekerja() {
        println("[$nama]")
    }
    fun mengajar(){
        println("[$nama]")
    }
}
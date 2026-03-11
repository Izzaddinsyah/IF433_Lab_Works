package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week6

class Button(override val nama: String) : Clickable {
    override fun click() {
        println("Tombol '$nama' Berhasil diklik")
    }
}
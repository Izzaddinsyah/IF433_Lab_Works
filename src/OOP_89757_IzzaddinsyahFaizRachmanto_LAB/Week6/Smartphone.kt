package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week6

class Smartphone: camera, Phone  {
    override fun turnOn() {
            super<camera>.turnOn()
        super<Phone>.turnOn()
        println("Sistem Operasi Smartphone Berhasil Booting.")
    }
}
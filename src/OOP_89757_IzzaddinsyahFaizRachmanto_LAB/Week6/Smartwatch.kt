package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week6

class Smartwatch : Watch(), BluetoothConnectable, Rechargeable {
    override fun showTime(){
        println("Layar Oled menyala: 14:00 WIB")
    }

    override fun connectToBluetooth() {
        println("Mencari perangkat HP di Sekitar Untuk Pairing...")
    }

    override fun chargeBattery() {
        println("Mengisi Daya Menggunakan Charger Magnetik 15W")
    }
}
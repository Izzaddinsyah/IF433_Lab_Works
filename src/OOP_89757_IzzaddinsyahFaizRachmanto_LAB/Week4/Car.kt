package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week4

open class Car(brand: String, val numberOfDoors: Int) : Vehicle(brand) {

    fun opentrunk () {
        println("Bagasi mobil $brand dengan $numberOfDoors pintu dibuka")
    }
    override fun honk() {
        println("TIN TIN! Mobil $brand lewat!")
    }
}
package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week4

fun Main () {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Ontel")
    generalVehicle,honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car (brand = "Toyota", numberOfDoors = 4)
            myCar.opentrunk()
            myCar.honk()
            myCar.accelerate()

}
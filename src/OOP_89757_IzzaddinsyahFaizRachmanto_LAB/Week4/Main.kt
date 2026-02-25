package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week4

fun Main () {
    println("--- Testing Vehicle ---")
    val generalVehicle = Vehicle(brand = "Sepeda Ontel")
    generalVehicle.honk()
    generalVehicle.accelerate()

    println("\n--- Testing Car ---")
    val myCar = Car(brand = "Toyota", numberOfDoors = 4)
    myCar.opentrunk()
    myCar.honk()
    myCar.accelerate()
}

fun main() {

    val tesla = ElectricCar("Tesla", 4, 85)

    tesla.accelerate()
    tesla.honk()
    tesla.opentrunk()

    println("\n=== Employee Hierarchy Test ===")

    val manager = Manager("Andi", 10_000_000)
    val developer = Developer("Budi", 8_000_000, "Kotlin")

    manager.work()
    println("Bonus Manager: Rp ${manager.calculateBonus()}")

    developer.work()
    println("Bonus Developer: Rp ${developer.calculateBonus()}")
}
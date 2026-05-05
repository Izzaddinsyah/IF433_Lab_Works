package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week11

fun main() {
    println("=== TEST EXTENSION FUNCTIONS ===")
    println("Alex".addGreeting())
    println("Hi".repeatTimes(3))

    val text: String? = null
    println("Apakah null/empty? ${text.isNullOrEmptyCustom()}")

    println("\n=== TEST RUN FUNCTIONS ===")
    val result = "Kotlin".run{
        println("Memproses kata: ${this}")
        length * 2
    }
    println("Hasil kalkulasi run: $result")

    println("=== TEST APPLY ===")
    val user = User().apply {
        name = "Alex"
        age = 25
    }
    println(user)

    println("\n=== TEST ALSO ===")
    val numbers = mutableListOf(1, 2, 3)
    numbers.also {
        println("Log Sebelum ditambah: $it")
    }.add(4)
    println("Setelah ditambah:$numbers")

    println("\n=== TEST WITH ===")
    with(user){
        println("User Detail -> Nama: $name, Umur: $age")
    }
    val newUser = User("Budi", 20).apply {
        age = 21
    }.also {
        println("User baru berhasil dibuat: $it")
    }
    val homeDevices = mutableListOf<SmartDevice>()

    val acDevice = run {
        SmartDevice(
            "Daikin Inverter (Kabel 3x2.5)",
            "HVAC",
            false,
            800
        )
    }

    homeDevices.add(acDevice)

    homeDevices.add(
        SmartDevice(
            "Picolo's Auto Feeder",
            "Pet Care",
            true,
            10
        )
    )
    println("\n=== HASIL PENCARIAN PERANGKAT CAMERA ===")
    val searchResult = homeDevices.find {
        it.category == "Camera"
    }

    searchResult?.let {
        println(it.diagnose())
    }
    println("\n=== DASHBOARD SUMMARY ===")
    with(homeDevices) {
        println("Total perangkat terdaftar: ${this.size}")
    }

    // CHECKPOINT 19: Kalkulasi daya menggunakan run
    val totalPower = homeDevices.run {
        sumOf { it.powerLoad }
    }

    println("Total penggunaan daya: $totalPower Watt")
}

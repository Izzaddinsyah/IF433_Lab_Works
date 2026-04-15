package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week8

object DatabaseMock {
    fun findUser(id: Int): UserProfile? {
        return if (id == 1) UserProfile("TestUser", "test@test.com") else null
    }
}

fun runMockUnitTest() {
    println("\n=== RUNNING UNIT TEST ===")

    val testUser = DatabaseMock.findUser(1)

    // Di Unit Testing, kalau null kita MAU program crash
    val initial = testUser!!.name.substring(0, 1)

    // check() = assertion bawaan Kotlin
    check(initial == "T") { "Test Failed! Initial is wrong." }

    println("Test Passed: Initial is T")
}
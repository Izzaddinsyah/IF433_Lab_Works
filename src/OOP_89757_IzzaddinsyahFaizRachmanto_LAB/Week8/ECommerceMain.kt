package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week8

fun main() {
    val rawApiData: List<Map<String, Any?>> = listOf(
        mapOf("id" to "E01", "name" to "Laptop", "type" to "ELECTRONIC", "warranty" to 24),
        mapOf("id" to "C01", "name" to "T-Shirt", "type" to "CLOTHING", "size" to "XL"),
        mapOf("id" to "E02", "name" to "Mouse", "type" to "ELECTRONIC", "warranty" to "Not An Integer"),
        mapOf("name" to "Ghost Item", "type" to "CLOTHING"),
        mapOf("id" to "X01", "name" to "Unknown", "type" to "FOOD")
    )

    val parser = ApiParser()

    for (raw in rawApiData) {
        try {
            val product = parser.parseProduct(raw)

            product?.let {
                when (it) {
                    is Electronic -> {
                        println("Electronic -> ID: ${it.id}, Name: ${it.name}, Warranty: ${it.warrantyMonths}")
                    }

                    is Clothing -> {
                        println("Clothing -> ID: ${it.id}, Name: ${it.name}, Size: ${it.size}")
                    }
                }

                parser.checkout(it)
                println("-----")
            }
        } catch (e: IllegalArgumentException) {
            println("Warning: ${e.message}")
            println("-----")
        }
    }
}
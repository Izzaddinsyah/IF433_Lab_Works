package OOP_89757_IzzaddinsyahFaizRachmanto_LAB.Week11

import java.awt.SystemColor.text

fun main() {
    println("=== TEST LET FUNCTION ===")
    val name: String? = "Alexander"

    val length = name?.let{
        println("Nama terdeteksi: $it")
        it.length
    }
    println("Panjang nama: $length")
}
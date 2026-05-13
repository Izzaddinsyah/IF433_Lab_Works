package oop_89757_IzzaddinsyahFaizRachmanto.Week12

//basic Exception - TryCatch
fun pembagian(pembilang:Int, penyebut: Int) {
    try {
        val hasilBagi = pembilang / penyebut;
        println("Hasil bagi: $hasilBagi");
    } catch (e: Exception) {
        println("Error di pembagian: ${e.message}");
    } finally {
        println("Selesai pembagian");
    }
}

//Exception - Expression - Tipe Data
fun cek_tipe_data(){
    var angka: Int = try {
        Integer.parseInt("123");
    } catch (e: Exception){
        println("ada error di cekTipeData: ${e.message}");
        111
    }
    println("Angka kamu adalah ${angka}");
}

//Throw
fun cek_saldo(saldoSaya: Int){
    if(saldoSaya < 1000){
        throw IllegalArgumentException("Saldo ${saldoSaya} tidak perlu bayar pajak")
    } else {
        println("Selamat kamu orang kaya");
    }
}

fun main() {
    //coba Throw
    try {
        cek_saldo(900);
    } catch (e: Exception){
        println("Error diThrow: ${e.message}");
    }

    //Exception - Expression
    cek_tipe_data();

    //Exception - Basic
    pembagian(10, 0);
}

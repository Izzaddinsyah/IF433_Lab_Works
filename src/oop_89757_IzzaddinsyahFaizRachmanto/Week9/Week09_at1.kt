package oop_89757_IzzaddinsyahFaizRachmanto.Week9

fun main() {
    println("======= List Of =======");
    val arSiswa = listOf("Budi", "Danu", "Susi", "Cica")

    //viem
    println(arSiswa);

    //panjang array
    println("Banyak Siswa:" + arSiswa.size);

    //for each
    println("Siswa bernama ${arSiswa[1]}");

    //munculin semua siswa
    for(a in arSiswa) {
        print(a)
    };
    println("======= LIST OF MUTABLES =======");
    val arMatkul = mutableListOf("OOP", "Pomweb", "Matdis", "Kalkulus");
arMatkul.add("Algo");
    arMatkul[2] = "Aljabar Linear"
    arMatkul.remove("Pemweb");
    println(arMatkul);

    println("========== SET OF IMUT ==========");
    val arNilai = setOf(80, 90, 75, 85, 88, 30, 50, 85);
    println("banyak nilai: ${arNilai.size}");
    println("ada angka 90 gak? ${arNilai.contains(90)}");
    println(arNilai);

    println("========== SET OF MUTABLE =========");
    val arMahasiswa = mutableSetOf("Andi", "Yanto", "Udin", "Yuda");
    arMahasiswa.add("Yanti");
    arMahasiswa.remove("Udin");
    arMahasiswa.add("Udin");
    println(arMahasiswa);
    println("========== MAP IMUT =========");
    val arResto = mapOf(
        "Ayam" to 5000,
        "Bakpao" to 3000,
        "Sayur asem" to 2500
    );
    println("Banyak menu: ${arResto.size}");
    println("Harga ayam ${arResto["Ayam"]}");
    println("List makanan: ${arResto.keys}");
    println("List Harga: ${arResto.values}");
    println(arResto);

    println("========== MAP MUTABLE =========");
    val arKHS = mutableMapOf(
        "Toni" to 80,
        "Nika" to 85,
        "Ara" to 87,
        "Davin" to 90
    );
    arKHS.remove("Ara");
    arKHS["Nika"] = 92
    arKHS["Cinta"] = 99
    println(arKHS);
}


package oop_89757_IzzaddinsyahFaizRachmanto.Week8

class Alamat(val nomor:Int, val kota:String);
class Mahasiswa(val nim:String, val addr: Alamat?)

fun main (){
    val almt = Alamat(nomor=47, kota = "Tangerang");
    val mhs = Mahasiswa("89757", almt);

    val defaultAlamat = mhs.addr?.let {
        alamatAsli->"sini nihh... ${mhs.addr.kota} nomornya $(mhs.addr.nomor}";
    }?:"Gak Jelas, gatau dimana"

    println("Nim-nya $ {mhs.nim} tinggalnya di ${mhs.addr?.kota}");
}
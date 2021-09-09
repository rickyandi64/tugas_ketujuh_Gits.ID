class Data_Mahasiswa(_nama_mahasiswa: String, _Jurusan: String = "Sistem Informasi"){
    val nama_mahasiswa = _nama_mahasiswa
    var Jurusan = _Jurusan


    fun Hasil(): String{
        val hasil = "--- Data Mahasiswa ---\nNama Mahasiswa: " + nama_mahasiswa +
                "\nJurusan: " + Jurusan
        return hasil
    }
}

fun main() {
    val Data_Mahasiswa = Data_Mahasiswa("Ricky Andi Kurniawan")
    var hasil = Data_Mahasiswa.Hasil()
    println(hasil)
}
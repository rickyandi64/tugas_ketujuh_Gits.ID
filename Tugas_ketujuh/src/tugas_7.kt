class Data_Mahasiswa(_nama_mahasiswa: String, _Jurusan: String = "Sistem Informasi", _Universitas: String = "Universitas Internasional Batam"){
    val nama_mahasiswa = _nama_mahasiswa
    var Jurusan = _Jurusan
    var Universitas = _Universitas


    fun Hasil(): String{
        val hasil = "--- Data Mahasiswa ---\nNama Mahasiswa: " + nama_mahasiswa +
                "\nJurusan: " + Jurusan +
                "\n Dari Universitas: " + Universitas
        return hasil
    }
}

fun main() {
    val Data_Mahasiswa = Data_Mahasiswa("Ricky Andi Kurniawan")
    var hasil = Data_Mahasiswa.Hasil()
    println(hasil)
}

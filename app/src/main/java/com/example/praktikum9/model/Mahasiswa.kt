package com.example.praktikum9.model

data class Mahasiswa(
    val nim: String,
    val nama: String,
    val alamat: String,
    val jenis_kelamin: String,
    val kelas: String,
    val angkatan: String,
    val judulskripsi: String,
    val dospemsatu: String,
    val dospemdua: String
)

{
    constructor(

    ):this("","","","","","","","","")
}

package com.example.praktikum9.repository

import com.example.praktikum9.model.Mahasiswa
import kotlinx.coroutines.flow.Flow

interface MahasiswaRepository {
    suspend fun getAllMahasiswa(): Flow<List<Mahasiswa>>

    suspend fun insertMahasiswa(mahasiswa: Mahasiswa)

    suspend fun updateMahasiswa(nim : String,mahasiswa: Mahasiswa)

    suspend fun deletedMahasiswa(nim: String)

    suspend fun getMahasiswaByNim(nim: String): Flow<Mahasiswa>
}
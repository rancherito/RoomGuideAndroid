package com.plcoding.roomguideandroid.dao_taxi

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.plcoding.roomguideandroid.models.Cliente

@Dao
interface ClienteDao {
    @Query("SELECT * FROM Cliente")
    fun getAll(): List<Cliente>

    @Insert
    fun insert(cliente: Cliente)

    @Update
    fun update(cliente: Cliente)

    @Delete
    fun delete(cliente: Cliente)
}
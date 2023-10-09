package com.plcoding.roomguideandroid.dao_taxi

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update
import com.plcoding.roomguideandroid.models.Chofer

@Dao
interface ChoferDao {
    @Query("SELECT * FROM Chofer")
    fun getAll(): List<Chofer>

    @Insert
    fun insert(chofer: Chofer)

    @Update
    fun update(chofer: Chofer)

    @Delete
    fun delete(chofer: Chofer)
}
package com.example.jobsheetcrud.data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.jobsheetcrud.model.Barang;

@Dao
public interface BarangDAO {

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    long insertBarang(Barang barang);

    @Query("SELECT * FROM tbarang")
    Barang[] selectAllBarangs();

    @Update
    int updateBarang(Barang barang);

    @Delete
    int deleteBarang(Barang barang);


}

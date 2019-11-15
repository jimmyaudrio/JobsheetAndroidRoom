package com.example.jobsheetcrud.data;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.jobsheetcrud.model.Barang;

@Database(entities = {Barang.class}, version = 1)

public abstract class AppDatabase extends RoomDatabase {
    public abstract BarangDAO barangDAO();
}

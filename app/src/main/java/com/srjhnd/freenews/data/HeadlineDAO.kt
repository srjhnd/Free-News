package com.srjhnd.freenews.data

import androidx.lifecycle.LiveData
import androidx.room.*

@Dao
interface HeadlineDAO {


    @Insert(onConflict = OnConflictStrategy.IGNORE)
    suspend fun insert(headline: Headline)

    @Insert
    suspend fun insertAll(headlines: List<Headline>)

    @Delete
    suspend fun delete(headline: Headline)

    @Update
    suspend fun update(headline: Headline)

    @Query("DELETE FROM headlines_table WHERE publishedAt < date('now', '-1 day')")
    suspend fun removeOldHeadlines()

    @Query("SELECT * FROM headlines_table ORDER BY timestamp DESC")
    fun getHeadlines(): LiveData<List<Headline>>

    @Query("SELECT * FROM headlines_table WHERE title = :qtitle")
    fun getHeadline(qtitle: String) : LiveData<Headline>

    @Query("SELECT COUNT(*) FROM headlines_table")
    fun getCount(): Int
}
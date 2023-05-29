package com.example.myfrindapp

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface MyFriendDao {
    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun tambahTeman(friend: myFriend)
    @Query("SELECT * FROM MyFriend")
    fun ambilSemuaTeman(): LiveData<List<myFriend>>
}
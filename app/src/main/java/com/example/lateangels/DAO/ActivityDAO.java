package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.ActivityEntity;

import java.util.List;

@Dao
public interface ActivityDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(ActivityEntity activity);

    @Update
    void update(ActivityEntity activity);

    @Delete
    void delete(ActivityEntity activity);

    @Query("DELETE FROM activity_table")
    void deleteAllActivity();

    @Query("SELECT * FROM activity_table ORDER BY activityID ASC")
    List<ActivityEntity> getAllActivity();
    //LiveData<List<ActivityEntity>> getAllActivity();

    //@Query("SELECT * FROM course_table WHERE courseID= :assessmentID")
    //List<CourseEntity> getAssociatedCourse(int assessmentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

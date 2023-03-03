package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.MarEntity;

import java.util.List;

@Dao
public interface MarDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(MarEntity mar);

    @Update
    void update(MarEntity mar);

    @Delete
    void delete(MarEntity mar);

    @Query("DELETE FROM mar_table")
    void deleteAllMar();

    @Query("SELECT * FROM mar_table ORDER BY marID ASC")
    List<MarEntity> getAllMar();
    //LiveData<List<AssessmentEntity>> getAllAssessments();

    //@Query("SELECT * FROM course_table WHERE courseID= :assessmentID")
    //List<CourseEntity> getAssociatedCourse(int assessmentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

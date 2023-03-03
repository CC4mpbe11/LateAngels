package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.ResidentEntity;

import java.util.List;

@Dao
public interface ResidentDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(ResidentEntity resident);

    @Update
    void update(ResidentEntity resident);

    @Delete
    void delete(ResidentEntity resident);

    @Query("DELETE FROM resident_table")
    void deleteAllResident();

    @Query("SELECT * FROM resident_table ORDER BY residentID ASC")
    List<ResidentEntity> getAllResident();
    //LiveData<List<AssessmentEntity>> getAllAssessments();

    //@Query("SELECT * FROM course_table WHERE courseID= :assessmentID")
    //List<CourseEntity> getAssociatedCourse(int assessmentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

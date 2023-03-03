package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.MedicationEntity;

import java.util.List;

@Dao
public interface MedicationDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(MedicationEntity medication);

    @Update
    void update(MedicationEntity medication);

    @Delete
    void delete(MedicationEntity medication);

    @Query("DELETE FROM medication_table")
    void deleteAllMedication();

    @Query("SELECT * FROM medication_table ORDER BY medicationID ASC")
    List<MedicationEntity> getAllMedication();
    //LiveData<List<MedicationEntity>> getAllMedication();

    //@Query("SELECT * FROM course_table WHERE courseID= :assessmentID")
    //List<CourseEntity> getAssociatedCourse(int assessmentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

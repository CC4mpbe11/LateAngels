package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.InsuranceEntity;
import com.example.lateangels.Entities.ResidentEntity;

import java.util.List;

@Dao
public interface InsuranceDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(InsuranceEntity insurance);

    @Update
    void update(InsuranceEntity insurance);

    @Delete
    void delete(InsuranceEntity insurance);

    @Query("DELETE FROM insurance_table")
    void deleteAllInsurance();

    @Query("SELECT * FROM insurance_table ORDER BY insuranceID ASC")
    List<InsuranceEntity> getAllInsurance();
    //LiveData<List<AssessmentEntity>> getAllAssessments();

    @Query("SELECT * FROM resident_table WHERE residentID= :associatedResidentID")
    ResidentEntity getAssociatedResident(int associatedResidentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

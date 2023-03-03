package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.AppointmentEntity;

import java.util.List;

@Dao
public interface AppointmentDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(AppointmentEntity appointment);

    @Update
    void update(AppointmentEntity appointment);

    @Delete
    void delete(AppointmentEntity appointment);

    @Query("DELETE FROM appointment_table")
    void deleteAllAppointment();

    @Query("SELECT * FROM appointment_table ORDER BY appointmentID ASC")
    List<AppointmentEntity> getAllAppointment();
    //LiveData<List<AssessmentEntity>> getAllAssessments();

    @Query("SELECT * FROM MarEntity WHERE courseID= :assessmentID")
    List<AppointmentEntity> getAppointmentCourse(int appointmentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

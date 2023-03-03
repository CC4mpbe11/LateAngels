package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.EmployeeEntity;

import java.util.List;

@Dao
public interface EmployeeDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(EmployeeEntity employee);

    @Update
    void update(EmployeeEntity employee);

    @Delete
    void delete(EmployeeEntity employee);

    @Query("DELETE FROM employee_table")
    void deleteAllEmployee();

    @Query("SELECT * FROM employee_table ORDER BY employeeID ASC")
    List<EmployeeEntity> getAllEmployee();
    //LiveData<List<AssessmentEntity>> getAllAssessments();

    //@Query("SELECT * FROM course_table WHERE courseID= :assessmentID")
    //List<CourseEntity> getAssociatedCourse(int assessmentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

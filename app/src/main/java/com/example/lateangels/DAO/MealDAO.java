package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.MealEntity;

import java.util.List;

@Dao
public interface MealDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(MealEntity meal);

    @Update
    void update(MealEntity meal);

    @Delete
    void delete(MealEntity meal);

    @Query("DELETE FROM meal_table")
    void deleteAllActivity();

    @Query("SELECT * FROM meal_table ORDER BY mealID ASC")
    List<MealEntity> getAllMeal();
    //LiveData<List<ActivityEntity>> getAllActivity();

    //@Query("SELECT * FROM course_table WHERE courseID= :assessmentID")
    //List<CourseEntity> getAssociatedCourse(int assessmentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

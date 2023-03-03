package com.example.lateangels.DAO;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;
import androidx.room.Update;

import com.example.lateangels.Entities.MenuEntity;

import java.util.List;

@Dao
public interface MenuDAO {
    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insert(MenuEntity menu);

    @Update
    void update(MenuEntity menu);

    @Delete
    void delete(MenuEntity menu);

    @Query("DELETE FROM menu_table")
    void deleteAllMenu();

    @Query("SELECT * FROM menu_table ORDER BY menuID ASC")
    List<MenuEntity> getAllMenu();
    //LiveData<List<ActivityEntity>> getAllActivity();

    //@Query("SELECT * FROM course_table WHERE courseID= :assessmentID")
    //List<CourseEntity> getAssociatedCourse(int assessmentID);
    //LiveData<List<CourseEntity>> getAssociatedCourse(int assessmentID);
}

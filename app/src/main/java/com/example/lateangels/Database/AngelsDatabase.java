package com.example.lateangels.Database;

import android.content.Context;

import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.lateangels.DAO.ActivityDAO;
import com.example.lateangels.DAO.AppointmentDAO;
import com.example.lateangels.DAO.EmployeeDAO;
import com.example.lateangels.DAO.InsuranceDAO;
import com.example.lateangels.DAO.MarDAO;
import com.example.lateangels.DAO.ResidentDAO;
import com.example.lateangels.DAO.MealDAO;
import com.example.lateangels.DAO.MedicationDAO;
import com.example.lateangels.DAO.MenuDAO;

import com.example.lateangels.Entities.ActivityEntity;
import com.example.lateangels.Entities.AppointmentEntity;
import com.example.lateangels.Entities.EmployeeEntity;
import com.example.lateangels.Entities.InsuranceEntity;
import com.example.lateangels.Entities.MarEntity;
import com.example.lateangels.Entities.ResidentEntity;
import com.example.lateangels.Entities.MealEntity;
import com.example.lateangels.Entities.MedicationEntity;
import com.example.lateangels.Entities.MenuEntity;


@androidx.room.Database(entities = {ActivityEntity.class,
        AppointmentEntity.class,
        EmployeeEntity.class,
        InsuranceEntity.class,
        MarEntity.class,
        MealEntity.class,
        MedicationEntity.class,
        MenuEntity.class,
        ResidentEntity.class}, version = 1)

public abstract class AngelsDatabase extends RoomDatabase{
    public abstract ActivityDAO activityDAO();
    public abstract AppointmentDAO appointmentDAO();
    public abstract EmployeeDAO employeeDAO();
    public abstract InsuranceDAO insuranceDAO();
    public abstract MarDAO marDAO();
    public abstract MealDAO mealDAO();
    public abstract MedicationDAO medicationDAO();
    public abstract MenuDAO menuDAO();
    public abstract ResidentDAO residentDAO();


    private static volatile AngelsDatabase INSTANCE;

    static AngelsDatabase getDatabase(final Context context) {
        if(INSTANCE == null) {
            synchronized (AngelsDatabase.class) {
                if(INSTANCE == null) {
                    INSTANCE = Room.databaseBuilder(context.getApplicationContext(), AngelsDatabase.class, "angels_database")
                            .fallbackToDestructiveMigration()
                            //.addCallback(sRoomDatabaseCallback)
                            .allowMainThreadQueries()
                            .build();
                }
            }
        }
        return INSTANCE;
    }

    /*private static RoomDatabase.Callback sRoomDatabaseCallback = new RoomDatabase.Callback(){
        @Override
        public void onOpen(@NonNull SupportSQLiteDatabase db) {
            super.onOpen(db);
        }
    };*/
/*
    private static class PopulateDbAsync extends AsyncTask<Void, Void, Void> {

        private final TermDAO lTermDAO;
        private final AssessmentDAO lAssessmentDAO;
        private final CourseDAO lCourseDAO;

        PopulateDbAsync(SchoolDatabase db) {
            lAssessmentDAO = db.assessmentDAO();
            lTermDAO = db.termDAO();
            lCourseDAO = db.courseDAO();
        }

        @RequiresApi(api = Build.VERSION_CODES.O)
        @Override
        protected Void doInBackground(final Void... params) {
            return null;
        }
    }*/
}

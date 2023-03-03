package com.example.lateangels.Database;

import android.app.Application;

import com.example.lateangels.DAO.ActivityDAO;
import com.example.lateangels.DAO.AppointmentDAO;
import com.example.lateangels.DAO.EmployeeDAO;
import com.example.lateangels.DAO.InsuranceDAO;
import com.example.lateangels.DAO.MarDAO;
import com.example.lateangels.DAO.MealDAO;
import com.example.lateangels.DAO.MedicationDAO;
import com.example.lateangels.DAO.MenuDAO;
import com.example.lateangels.DAO.ResidentDAO;
import com.example.lateangels.Entities.ActivityEntity;
import com.example.lateangels.Entities.AppointmentEntity;
import com.example.lateangels.Entities.EmployeeEntity;
import com.example.lateangels.Entities.InsuranceEntity;
import com.example.lateangels.Entities.MarEntity;
import com.example.lateangels.Entities.MealEntity;
import com.example.lateangels.Entities.MedicationEntity;
import com.example.lateangels.Entities.MenuEntity;
import com.example.lateangels.Entities.ResidentEntity;

import java.util.List;

public class AngelsRepository {

    private final ActivityDAO mActivityDAO;
    private final AppointmentDAO mAppointmentDAO;
    private final EmployeeDAO mEmployeeDAO;
    private final InsuranceDAO mInsuranceDAO;
    private final MarDAO mMarDAO;
    private final MealDAO mMealDAO;
    private final MedicationDAO mMedicationDAO;
    private final MenuDAO mMenuDAO;
    private final ResidentDAO mResidentDAO;

    //private LiveData<List<CourseEntity>> mAssociatedCourses;
    //private LiveData<List<CourseEntity>> mAssociatedCourse;
    //private LiveData<List<CourseEntity>> mAllCourses;

    public AngelsRepository(Application application) {
        AngelsDatabase db = AngelsDatabase.getDatabase(application);
        mActivityDAO = db.activityDAO();
        mAppointmentDAO = db.appointmentDAO();
        mEmployeeDAO = db.employeeDAO();
        mInsuranceDAO = db.insuranceDAO();
        mMarDAO = db.marDAO();
        mMealDAO = db.mealDAO();
        mMedicationDAO = db.medicationDAO();
        mMenuDAO = db.menuDAO();
        mResidentDAO = db.residentDAO();
        //mAllAssessments = mAssessmentDAO.getAllAssessments();
        //mAllTerms = mTermDAO.getAllTerms();
        //mAllCourses = mCourseDAO.getAllCourses();
        //mAssociatedCourses = mCourseDAO.getAssociatedCourses(termID);
        //mUnassociatedCourses = mCourseDAO.getUnassociatedCourses(termID);
        //mAssociatedCourse = mAssessmentDAO.getAssociatedCourse(assessmentID);
    }

    //public LiveData<List<AssessmentEntity>> getAllAssessments () {return mAllAssessments;}
    //public LiveData<List<TermEntity>> getAllTerms () {return mAllTerms;}

    public int getNewActivityID(){
        int newIDtoBeat = 0;
        for(ActivityEntity activity : getAllActivity()) {
            if (activity.getActivityID() > newIDtoBeat) {
                newIDtoBeat = activity.getActivityID();
                System.out.println("The new Id to beat is: " + newIDtoBeat);
            }
        }
        return newIDtoBeat + 1;
    }

    public int getNewAppointmentID(){
        int newIDtoBeat = 0;
        for(AppointmentEntity appointment : getAllAppointment()) {
            if (appointment.getAppointmentID() > newIDtoBeat) {
                newIDtoBeat = appointment.getAppointmentID();
                System.out.println("The new Id to beat is: " + newIDtoBeat);
            }
        }
        return newIDtoBeat + 1;
    }

    public int getNewEmployeeID(){
        int newIDtoBeat = 0;
        for(EmployeeEntity employee : getAllEmployee()) {
            if (employee.getEmployeeID() > newIDtoBeat) {
                newIDtoBeat = employee.getEmployeeID();
                System.out.println("The new Id to beat is: " + newIDtoBeat);
            }
        }
        return newIDtoBeat + 1;
    }

    public int getNewInsuranceID(){
        int newIDtoBeat = 0;
        for(InsuranceEntity insurance : getAllInsurance()) {
            if (insurance.getInsuranceID() > newIDtoBeat) {
                newIDtoBeat = insurance.getInsuranceID();
                System.out.println("The new Id to beat is: " + newIDtoBeat);
            }
        }
        return newIDtoBeat + 1;
    }

    public int getNewMarID(){
        int newIDtoBeat = 0;
        for(MarEntity mar : getAllMar()) {
            if (mar.getMarID() > newIDtoBeat) {
                newIDtoBeat = mar.getMarID();
                System.out.println("The new Id to beat is: " + newIDtoBeat);
            }
        }
        return newIDtoBeat + 1;
    }

    public int getNewMealID(){
        int newIDtoBeat = 0;
        for(MealEntity meal : getAllMeal()) {
            if (meal.getMealID() > newIDtoBeat) {
                newIDtoBeat = meal.getMealID();
                System.out.println("The new Id to beat is: " + newIDtoBeat);
            }
        }
        return newIDtoBeat + 1;
    }

    public int getNewMedicationID(){
        int newIDtoBeat = 0;
        for(MedicationEntity medication : getAllMedication()) {
            if (medication.getMedicationID() > newIDtoBeat) {
                newIDtoBeat = medication.getMedicationID();
                System.out.println("The new Id to beat is: " + newIDtoBeat);
            }
        }
        return newIDtoBeat + 1;
    }

    public int getNewMenuTermID(){
        int newIDtoBeat = 0;
        for(MenuEntity menu: getAllMenu()) {
            if (menu.getMenuID() > newIDtoBeat) {
                newIDtoBeat = menu.getMenuID();
            }
        }
        return newIDtoBeat + 1;
    }

    public int getNewResidentID(){
        int newIDtoBeat = 0;
        for(ResidentEntity resident : getAllResident()) {
            if (resident.getResidentID() > newIDtoBeat) {
                newIDtoBeat = resident.getResidentID();
            }
        }
        return newIDtoBeat + 1;
    }

    public List<ActivityEntity> getAllActivity () { return mActivityDAO.getAllActivity();}

    public List<AppointmentEntity> getAllAppointment () { return mAppointmentDAO.getAllAppointment();}

    public List<EmployeeEntity> getAllEmployee () { return mEmployeeDAO.getAllEmployee();}

    public List<InsuranceEntity> getAllInsurance () { return mInsuranceDAO.getAllInsurance();}

    public List<MarEntity> getAllMar () { return mMarDAO.getAllMar();}

    public List<MealEntity> getAllMeal () { return mMealDAO.getAllMeal();}

    public List<MedicationEntity> getAllMedication () { return mMedicationDAO.getAllMedication();}

    public List<MenuEntity> getAllMenu () { return mMenuDAO.getAllMenu();}

    public List<ResidentEntity> getAllResident () { return mResidentDAO.getAllResident();}


    //public LiveData<List<CourseEntity>> getAllCourses() {return mAllCourses;}
    //public LiveData<List<CourseEntity>> getAssociatedCourses (int termID) {return mAssociatedCourses;}
    //public LiveData<List<CourseEntity>> getAssociatedCourse (int assessmentID) {return mAssociatedCourse;}

    //associate a dinner with a menu, a breakfast, and a lunch

    public ResidentEntity getAssociatedResident (int residentID) {
        //private LiveData<List<AssessmentEntity>> mAllAssessments;
        //private LiveData<List<TermEntity>> mAllTerms;
        return mInsuranceDAO.getAssociatedResident(residentID);}

    //////////////////////////////////////////////////////////////////////////////////////////////////
    //do more associations


    /*public List<CourseEntity> getAssociatedCourses (int termID) {
        //private LiveData<List<AssessmentEntity>> mAllAssessments;
        //private LiveData<List<TermEntity>> mAllTerms;
        return mCourseDAO.getAssociatedCourses(termID);}

    public List<CourseEntity> getUnassociatedCourses (int termID) {
        return mCourseDAO.getUnassociatedCourses(termID);}

    public List<CourseEntity> getAssociatedCourse (int assessmentID) {
        return mAssessmentDAO.getAssociatedCourse(assessmentID);}*/

    ///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////


    public void insert (ActivityEntity activityEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mActivityDAO.insert(activityEntity);
    }

    public void insert (AppointmentEntity appointmentEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mAppointmentDAO.insert(appointmentEntity);
    }

    public void insert (EmployeeEntity employeeEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mEmployeeDAO.insert(employeeEntity);
    }
    public void insert (InsuranceEntity insuranceEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mInsuranceDAO.insert(insuranceEntity);
    }

    public void insert (MarEntity marEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mMarDAO.insert(marEntity);
    }

    public void insert (MealEntity mealEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mMealDAO.insert(mealEntity);
    }
    public void insert (MedicationEntity medicationEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mMedicationDAO.insert(medicationEntity);
    }

    public void insert (MenuEntity menuEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mMenuDAO.insert(menuEntity);
    }

    public void insert (ResidentEntity residentEntity) {
        //new insertAsyncTask1(mCourseDAO).execute(courseEntity);
        mResidentDAO.insert(residentEntity);
    }

    /*
    public void insert (AssessmentEntity assessmentEntity) {
        new insertAsyncTask2(mAssessmentDAO).execute(assessmentEntity);
    }

    public void insert (TermEntity termEntity) {
        new insertAsyncTask(mTermDAO).execute(termEntity);
    }*/

    public void update (ActivityEntity activityEntity) { mActivityDAO.update(activityEntity); }

    public void update (AppointmentEntity appointmentEntity) { mAppointmentDAO.update(appointmentEntity); }

    public void update (EmployeeEntity employeeEntity) { mEmployeeDAO.update(employeeEntity); }

    public void update (InsuranceEntity insuranceEntity) {
        mInsuranceDAO.update(insuranceEntity);
    }

    public void update (MarEntity marEntity) {
        mMarDAO.update(marEntity);
    }

    public void update (MealEntity mealEntity) { mMealDAO.update(mealEntity); }

    public void update (MedicationEntity medicationEntity) { mMedicationDAO.update(medicationEntity); }

    public void update (MenuEntity menuEntity) { mMenuDAO.update(menuEntity); }

    public void update (ResidentEntity residentEntity) { mResidentDAO.update(residentEntity); }


    public void delete (ActivityEntity activityEntity) {
        mActivityDAO.delete(activityEntity);
        //new deleteAsyncTask(mTermDAO).execute(termEntity);
    }
    public void delete (AppointmentEntity appointmentEntity) {
        //new deleteAsyncTask1(mCourseDAO).execute(courseEntity);
        mAppointmentDAO.delete(appointmentEntity);
    }
    public void delete (EmployeeEntity employeeEntity) {
        mEmployeeDAO.delete(employeeEntity);
        //new deleteAsyncTask2(mAssessmentDAO).execute(assessmentEntity);
    }
    public void delete (InsuranceEntity insuranceEntity) {
        mInsuranceDAO.delete(insuranceEntity);
        //new deleteAsyncTask(mTermDAO).execute(termEntity);
    }
    public void delete (MarEntity marEntity) {
        //new deleteAsyncTask1(mCourseDAO).execute(courseEntity);
        mMarDAO.delete(marEntity);
    }
    public void delete (MealEntity mealEntity) {
        mMealDAO.delete(mealEntity);
        //new deleteAsyncTask2(mAssessmentDAO).execute(assessmentEntity);
    }
    public void delete (MedicationEntity medicationEntity) {
        mMedicationDAO.delete(medicationEntity);
        //new deleteAsyncTask(mTermDAO).execute(termEntity);
    }
    public void delete (MenuEntity menuEntity) {
        //new deleteAsyncTask1(mCourseDAO).execute(courseEntity);
        mMenuDAO.delete(menuEntity);
    }
    public void delete (ResidentEntity residentEntity) {
        mResidentDAO.delete(residentEntity);
        //new deleteAsyncTask2(mAssessmentDAO).execute(assessmentEntity);
    }

  /*  private static class insertAsyncTask extends AsyncTask<TermEntity, Void, Void> {
        private TermDAO mAsyncTaskDao;
        insertAsyncTask(TermDAO dao) {
            mAsyncTaskDao = dao;
        }
        @Override
        protected Void doInBackground(final TermEntity... params) {
            mAsyncTaskDao.insert(params[0]);
            return null;
        }
    }

    private static class insertAsyncTask1 extends  AsyncTask<CourseEntity, Void, Void> {
        private CourseDAO mAsyncTaskDAO;
        insertAsyncTask1(CourseDAO dao) {mAsyncTaskDAO = dao;}
        @Override
        protected Void doInBackground(final CourseEntity... params) {
            mAsyncTaskDAO.insert(params[0]);
            return null;
        }
    }

    private static class insertAsyncTask2 extends  AsyncTask<AssessmentEntity, Void, Void> {
        private AssessmentDAO mAsyncTaskDAO;
        insertAsyncTask2(AssessmentDAO dao) {mAsyncTaskDAO = dao;}
        @Override
        protected Void doInBackground(final AssessmentEntity... params) {
            mAsyncTaskDAO.insert(params[0]);
            return null;
        }
    }

    private static class deleteAsyncTask extends AsyncTask<TermEntity, Void, Void> {
        private TermDAO mAsyncTaskDAO;
        deleteAsyncTask(TermDAO dao) {mAsyncTaskDAO = dao;}
        @Override
        protected Void doInBackground(final TermEntity... params) {
            mAsyncTaskDAO.delete(params[0]);
            return null;
        }
    }

    private static class deleteAsyncTask1 extends AsyncTask<CourseEntity, Void, Void> {
        private CourseDAO mAsyncTaskDAO;
        deleteAsyncTask1(CourseDAO dao) {mAsyncTaskDAO = dao;}
        @Override
        protected Void doInBackground(final CourseEntity... params) {
            mAsyncTaskDAO.delete(params[0]);
            return null;
        }
    }

    private static class deleteAsyncTask2 extends AsyncTask<AssessmentEntity, Void, Void> {
        private AssessmentDAO mAsyncTaskDAO;
        deleteAsyncTask2(AssessmentDAO dao) {mAsyncTaskDAO = dao;}
        @Override
        protected Void doInBackground(final AssessmentEntity... params) {
            mAsyncTaskDAO.delete(params[0]);
            return null;
        }
    }*/
}

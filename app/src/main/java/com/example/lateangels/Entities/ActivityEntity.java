package com.example.lateangels.Entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName="activity_table")
public class ActivityEntity {
    @PrimaryKey
    private int activityID;
    private final String activityCode;
    private final String activityName;
    private final String activityType;
    private final Long activityStart;
    private final Long activityEnd;

    @NonNull
    @Override
    public String toString(){
        return "ActivityEntity{" +
                "activityID=" + activityID +
                ", activityCode=" + activityCode +
                ", activityName=" + activityName +
                ", activityType=" + activityType +
                ", activityStart=" + activityStart +
                ", activityEnd=" + activityEnd +
                "}";
    }

    public ActivityEntity(int activityID,
                          String activityCode,
                          String activityName,
                          String activityType,
                          Long activityStart,
                          Long activityEnd)
    {
        this.activityID = activityID;
        this.activityCode = activityCode;
        this.activityName = activityName;
        this.activityType = activityType;
        this.activityStart = activityStart;
        this.activityEnd = activityEnd;
    }

    public int getActivityID() {
        return activityID;
    }

    public void setActivityID(int assessmentID) {
        this.activityID = assessmentID;
    }

    public String getActivityCode() {
        return activityCode;
    }

    public String getActivityName() {
        return activityName;
    }

    public String getActivityType() {
        return activityType;
    }

    public Long getActivityStart() { return activityStart; }

    public Long getActivityEnd() { return activityEnd; }

    public Calendar getActivityStartObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(activityStart);
        return calendar;
    }

    public Calendar getActivityEndObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(activityEnd);
        return calendar;
    }

    public String getActivityStartMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(activityStart);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getActivityEndMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(activityEnd);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getActivityStartHhMm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(activityStart);
        String hH = addLeadingZero(calendar.get(Calendar.HOUR));
        String mM = addLeadingZero(calendar.get(Calendar.MINUTE));
        return hH + ":" + mM;
    }

    public String getActivityEndHhMm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(activityEnd);
        String hH = addLeadingZero(calendar.get(Calendar.HOUR));
        String mM = addLeadingZero(calendar.get(Calendar.MINUTE));
        return hH + ":" + mM;
    }

    /*public String getActivityStartyyyymmddggghhmmaaa() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(assessmentCalendar);
        String yyyy = addLeadingZero(calendar.get(Calendar.YEAR));
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        String hH = addLeadingZero(calendar.get(Calendar.HOUR));
        String mM = addLeadingZero(calendar.get(Calendar.MINUTE));
        String aMpM = "";
        int amPm = calendar.get(Calendar.AM_PM);
        if (amPm == 1){
            aMpM = "PM";
        }
        else{
            aMpM = "AM";
        }
        String yyyymmddggghhmmaaa = yyyy + "." + mm + "." + dd + " AD " + hH + ":" + mM + " " + aMpM;
        System.out.println(yyyymmddggghhmmaaa);
        return yyyymmddggghhmmaaa;
    }*/

    private String addLeadingZero(int num) {
        String result = String.valueOf(num);
        if(num < 10){
            result = "0" + result;
        }
        return result;
    }
}

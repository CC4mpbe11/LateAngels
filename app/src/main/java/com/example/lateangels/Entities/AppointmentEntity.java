package com.example.lateangels.Entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName="appointment_table")
public class AppointmentEntity {
    @PrimaryKey
    private int appointmentID;
    private final String appointmentCode;
    private final String appointmentName;
    private final String appointmentType;
    private final Long appointmentStart;
    private final Long appointmentEnd;

    @NonNull
    @Override
    public String toString(){
        return "AppointmentEntity{" +
                "appointmentID=" + appointmentID +
                ", appointmentCode=" + appointmentCode +
                ", appointmentName=" + appointmentName +
                ", appointmentType=" + appointmentType +
                ", appointmentStart=" + appointmentStart +
                ", appointmentEnd=" + appointmentEnd +
                "}";
    }

    public AppointmentEntity(int appointmentID,
                             String appointmentCode,
                             String appointmentName,
                             String appointmentType,
                             Long appointmentStart,
                             Long appointmentEnd)
    {
        this.appointmentID = appointmentID;
        this.appointmentCode = appointmentCode;
        this.appointmentName = appointmentName;
        this.appointmentType = appointmentType;
        this.appointmentStart = appointmentStart;
        this.appointmentEnd = appointmentEnd;
    }

    public int getAppointmentID() {
        return appointmentID;
    }

    public void setAppointmentID(int appointmentID) {
        this.appointmentID = appointmentID;
    }

    public String getAppointmentCode() {
        return appointmentCode;
    }

    public String getAppointmentName() {
        return appointmentName;
    }

    public String getAppointmentType() {
        return appointmentType;
    }

    public Long getAppointmentStart() { return appointmentStart; }

    public Long getAppointmentEnd() { return appointmentEnd; }

    public Calendar getAppointmentStartObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(appointmentStart);
        return calendar;
    }

    public Calendar getAppointmentEndObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(appointmentEnd);
        return calendar;
    }

    public String getAppointmentStartMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(appointmentStart);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getAppointmentEndMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(appointmentEnd);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getAppointmentStartHhMm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(appointmentStart);
        String hH = addLeadingZero(calendar.get(Calendar.HOUR));
        String mM = addLeadingZero(calendar.get(Calendar.MINUTE));
        return hH + ":" + mM;
    }

    public String getAppointmentEndHhMm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(appointmentEnd);
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

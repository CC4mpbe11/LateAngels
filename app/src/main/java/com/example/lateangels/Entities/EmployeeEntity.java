package com.example.lateangels.Entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName="employee_table")
public class EmployeeEntity {
    @PrimaryKey
    private int employeeID;
    private final String employeeCode;
    private final String employeeName;
    private final String employeeType;
    private final Long employeeStart;
    private final Long employeeEnd;

    @NonNull
    @Override
    public String toString(){
        return "EmployeeEntity{" +
                "employeeID=" + employeeID +
                ", employeeCode=" + employeeCode +
                ", employeeName=" + employeeName +
                ", employeeType=" + employeeType +
                ", employeeStart=" + employeeStart +
                ", employeeEnd=" + employeeEnd +
                "}";
    }

    public EmployeeEntity(int employeeID,
                          String employeeCode,
                          String employeeName,
                          String employeeType,
                          Long employeeStart,
                          Long employeeEnd)
    {
        this.employeeID = employeeID;
        this.employeeCode = employeeCode;
        this.employeeName = employeeName;
        this.employeeType = employeeType;
        this.employeeStart = employeeStart;
        this.employeeEnd = employeeEnd;
    }

    public int getEmployeeID() {
        return employeeID;
    }

    public void setEmployeeID(int employeeID) {
        this.employeeID = employeeID;
    }

    public String getEmployeeCode() {
        return employeeCode;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public String getEmployeeType() {
        return employeeType;
    }

    public Long getEmployeeStart() { return employeeStart; }

    public Long getEmployeeEnd() { return employeeEnd; }

    public Calendar getEmployeeStartObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(employeeStart);
        return calendar;
    }

    public Calendar getEmployeeEndObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(employeeEnd);
        return calendar;
    }

    public String getEmployeeStartMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(employeeStart);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getEmployeeEndMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(employeeEnd);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getEmployeeStartHhMm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(employeeStart);
        String hH = addLeadingZero(calendar.get(Calendar.HOUR));
        String mM = addLeadingZero(calendar.get(Calendar.MINUTE));
        return hH + ":" + mM;
    }

    public String getEmployeeEndHhMm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(employeeEnd);
        String hH = addLeadingZero(calendar.get(Calendar.HOUR));
        String mM = addLeadingZero(calendar.get(Calendar.MINUTE));
        return hH + ":" + mM;
    }

    /*public String getEmployeeStartyyyymmddggghhmmaaa() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(employeeCalendar);
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

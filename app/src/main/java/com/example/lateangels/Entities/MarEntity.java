package com.example.lateangels.Entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName="mar_table")
public class MarEntity {
    @PrimaryKey
    private int marID;
    private String patientName;
    private Long marStart;
    private Long marEnd;
    private String marNotes;

    @NonNull
    @Override
    public String toString() {
        return "MarEntity{" +
                "marID=" + marID +
                ", patientName=" + patientName +
                ", marStart=" + marStart +
                ", marEnd=" + marEnd +
                ", marNotes=" + marNotes +
                "}";
    }

    public MarEntity(int marID,
                     String patientName,
                     Long marStart,
                     Long marEnd,
                     String marNotes)
    {
        this.marID = marID;
        this.patientName = patientName;
        this.marStart = marStart;
        this.marEnd = marEnd;
        this.marNotes = marNotes;
    }

    public int getMarID() {
        return marID;
    }

    public void setMarID(int courseID) {
        this.marID = marID;
    }

    public String getPatientName() {
        return patientName;
    }

    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }

    public String getMarNotes() { return marNotes; }

    public void setMarNotes(String marNotes) { this.marNotes = marNotes; }

    public Long getMarStart() { return marStart; }

    public void setMarStart(Long marStart) { this.marStart = marStart; }

    public Long getMarEnd() { return marEnd; }

    public void setMarEnd(Long marEnd) { this.marEnd = marEnd; }

    public String getMarStartMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(marStart);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getMarEndMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(marEnd);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    private String addLeadingZero(int num) {
        String result = String.valueOf(num);
        if(num < 10){
            result = "0" + result;
        }
        return result;
    }
}

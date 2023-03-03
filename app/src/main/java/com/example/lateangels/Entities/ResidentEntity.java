package com.example.lateangels.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName="resident_table")

public class ResidentEntity {

    @PrimaryKey
    private int residentID;
    private String firstName;
    private String lastName;
    private String middleName;
    private Long residentDOB;
    private String sex;
    private String maritalStatus;
    private int roomNumber;
    private int homePhone;
    private int cellPhone;
    private String emergencyContact;
    private String emergencyPhone;
    private String psPhysician;
    private String pspNpiNumber;

    public ResidentEntity(int residentID,
                          String firstName,
                          String lastName,
                          String middleName,
                          Long residentDOB,
                          String sex,
                          String maritalStatus,
                          int roomNumber,
                          int homePhone,
                          int cellPhone,
                          String emergencyContact,
                          String emergencyPhone,
                          String psPhysician,
                          String pspNpiNumber)
    {
        this.residentID = residentID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.middleName = middleName;
        this.residentDOB = residentDOB;
        this.sex = sex;
        this.maritalStatus = maritalStatus;
        this.roomNumber = roomNumber;
        this.homePhone = homePhone;
        this.cellPhone = cellPhone;
        this.emergencyContact = emergencyContact;
        this.emergencyPhone = emergencyPhone;
        this.psPhysician = psPhysician;
        this.pspNpiNumber = pspNpiNumber;
    }

    public int getResidentID() {
        return residentID;
    }

    public void setResidentID(int residentID) { this.residentID = residentID; }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public Long getResidentDOB() {
        return residentDOB;
    }

    public void setResidentDOB(Long residentDOB) {
        this.residentDOB = residentDOB;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getMaritalStatus() {
        return maritalStatus;
    }

    public void setMaritalStatus(String maritalStatus) { this.maritalStatus = maritalStatus; }

    public int getRoomNumber() {
        return roomNumber;
    }

    public void setRoomNumber(int roomNumber) {
        this.roomNumber = roomNumber;
    }

    public int getHomePhone() {
        return homePhone;
    }

    public void setHomePhone(int homePhone) {
        this.homePhone = homePhone;
    }

    public int getCellPhone() {
        return cellPhone;
    }

    public void setCellPhone(int cellPhone) {
        this.cellPhone = cellPhone;
    }

    public String getEmergencyContact() {
        return emergencyContact;
    }

    public void setEmergencyContact(String emergencyContact) { this.emergencyContact = emergencyContact; }

    public String getEmergencyPhone() {
        return emergencyPhone;
    }

    public void setEmergencyPhone(String emergencyPhone) {
        this.emergencyPhone = emergencyPhone;
    }

    public String getPsPhysician() {
        return psPhysician;
    }

    public void setPsPhysician(String psPhysician) {
        this.psPhysician = psPhysician;
    }

    public String getPspNpiNumber() {
        return pspNpiNumber;
    }

    public void setPspNpiNumber(String pspNpiNumber) {
        this.pspNpiNumber = pspNpiNumber;
    }

    public String getResidentDOBMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(residentDOB);
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

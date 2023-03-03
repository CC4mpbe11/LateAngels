package com.example.lateangels.Entities;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName="insurance_table")

public class InsuranceEntity {

    @PrimaryKey
    private int insuranceID;
    private int associatedResidentID;
    private String phFirstName;
    private String phLastName;
    private String phMiddleName;
    private Long phDOB;
    private String sex;
    private String phStreet;
    private String phCity;
    private String phState;
    private int phZip;
    private Boolean sameAsPatient;
    private String insuranceName;
    private int policyID;
    private int groupNumber;
    private int phCellPhone;
    private Long effectiveDate;
    private Boolean coPay;
    private Double coPayAmount;
    private Boolean referralRequired;
    private Boolean primaryOrSecondary;


    public InsuranceEntity(int insuranceID,
                           int associatedResidentID,
                           String phFirstName,
                           String phLastName,
                           String phMiddleName,
                           Long phDOB,
                           String sex,
                           String phStreet,
                           String phCity,
                           String phState,
                           int phZip,
                           Boolean sameAsPatient,
                           String insuranceName,
                           int policyID,
                           int groupNumber,
                           int phCellPhone,
                           Long effectiveDate,
                           Boolean coPay,
                           Double coPayAmount,
                           Boolean referralRequired,
                           Boolean primaryOrSecondary)
    {
        this.insuranceID = insuranceID;
        this.associatedResidentID = associatedResidentID;
        this.phFirstName = phFirstName;
        this.phLastName = phLastName;
        this.phMiddleName = phMiddleName;
        this.phDOB = phDOB;
        this.sex = sex;
        this.phStreet = phStreet;
        this.phCity = phCity;
        this.phState = phState;
        this.phZip = phZip;
        this.sameAsPatient = sameAsPatient;
        this.insuranceName = insuranceName;
        this.policyID = policyID;
        this.groupNumber = groupNumber;
        this.phCellPhone = phCellPhone;
        this.effectiveDate = effectiveDate;
        this.coPay = coPay;
        this.coPayAmount = coPayAmount;
        this.referralRequired = referralRequired;
        this.primaryOrSecondary = primaryOrSecondary;
    }

    public int getInsuranceID() { return insuranceID; }

    public void setInsuranceID(int insuranceID) { this.insuranceID = insuranceID; }

    public int getAssociatedResidentID() { return associatedResidentID; }

    public void setAssociatedResidentID(int associatedResidentID) { this.associatedResidentID = associatedResidentID; }

    public String getPhFirstName() { return phFirstName; }

    public void setPhFirstName(String phFirstName) { this.phFirstName = phFirstName; }

    public String getPhLastName() { return phLastName; }

    public void setPhLastName(String phLastName) { this.phLastName = phLastName; }

    public String getPhMiddleName() { return phMiddleName; }

    public void setPhMiddleName(String phMiddleName) { this.phMiddleName = phMiddleName; }

    public Long getPhDOB() { return phDOB; }

    public void setPhDOB(Long phDOB) { this.phDOB = phDOB; }

    public String getSex() { return sex; }

    public void setSex(String sex) { this.sex = sex; }

    public String getPhStreet() { return phStreet; }

    public void setPhStreet(String phStreet) { this.phStreet = phStreet; }

    public String getPhCity() { return phCity; }

    public void setPhCity(String phCity) { this.phCity = phCity; }

    public String getPhState() { return phState; }

    public void setPhState(String phState) { this.phState = phState; }

    public int getPhZip() { return phZip; }

    public void setPhZip(int phZip) { this.phZip = phZip; }

    public Boolean getSameAsPatient() { return sameAsPatient; }

    public void setSameAsPatient(Boolean sameAsPatient) { this.sameAsPatient = sameAsPatient; }

    public String getInsuranceName() { return insuranceName; }

    public void setInsuranceName(String insuranceName) { this.insuranceName = insuranceName; }

    public int getPolicyID() { return policyID; }

    public void setPolicyID(int policyID) { this.policyID = policyID; }

    public int getGroupNumber() { return groupNumber; }

    public void setGroupNumber(int groupNumber) { this.groupNumber = groupNumber; }

    public int getPhCellPhone() { return phCellPhone; }

    public void setPhCellPhone(int phCellPhone) { this.phCellPhone = phCellPhone; }

    public Long getEffectiveDate() { return effectiveDate; }

    public void setEffectiveDate(Long effectiveDate) { this.effectiveDate = effectiveDate; }

    public Boolean getCoPay() { return coPay; }

    public void setCoPay(Boolean coPay) { this.coPay = coPay; }

    public Double getCoPayAmount() { return coPayAmount; }

    public void setCoPayAmount(Double coPayAmount) { this.coPayAmount = coPayAmount; }

    public Boolean getReferralRequired() { return referralRequired; }

    public void setReferralRequired(Boolean referralRequired) { this.referralRequired = referralRequired; }

    public Boolean getPrimaryOrSecondary() { return primaryOrSecondary; }

    public void setPrimaryOrSecondary(Boolean primaryOrSecondary) { this.primaryOrSecondary = primaryOrSecondary; }

    public String getPhDOBMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(phDOB);
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

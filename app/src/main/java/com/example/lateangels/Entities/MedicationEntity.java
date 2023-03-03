package com.example.lateangels.Entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName="medication_table")
public class MedicationEntity {
    @PrimaryKey
    private int medicationID;
    private double dosage;
    private String drugName;
    private String genericName;
    private String purpose;
    private String instructions;
    private String amount;
    private Long scriptStart;
    private Long scriptEnd;

    @NonNull
    @Override
    public String toString(){
        return "MedicationEntity{" +
                "medicationID=" + medicationID +
                ", dosage=" + dosage +
                ", drugName=" + drugName +
                ", genericName=" + genericName +
                ", purpose=" + purpose +
                ", instructions=" + instructions +
                ", amount=" + amount +
                ", scriptStart=" + scriptStart +
                ", scriptEnd=" + scriptEnd +
                "}";
    }

    public MedicationEntity(int medicationID,
                            Double dosage,
                            String drugName,
                            String genericName,
                            String purpose,
                            String instructions,
                            String amount,
                            Long scriptStart,
                            Long scriptEnd)
    {
        this.medicationID = medicationID;
        this.dosage = dosage;
        this.drugName = drugName;
        this.genericName = genericName;
        this.purpose = purpose;
        this.instructions = instructions;
        this.amount = amount;
        this.scriptStart = scriptStart;
        this.scriptEnd = scriptEnd;
    }

    public int getMedicationID() { return medicationID; }

    public void setMedicationID(int medicationID) { this.medicationID = medicationID; }

    public double getDosage() { return dosage; }

    public void setDosage(double dosage) { this.dosage = dosage; }

    public String getDrugName() { return drugName; }

    public void setDrugName(String drugName) { this.drugName = drugName; }

    public String getGenericName() { return genericName; }

    public void setGenericName(String genericName) { this.genericName = genericName; }

    public String getPurpose() { return purpose; }

    public void setPurpose(String purpose) { this.purpose = purpose; }

    public String getInstructions() { return instructions; }

    public void setInstructions(String instructions) { this.instructions = instructions; }

    public String getAmount() { return amount; }

    public void setAmount(String amount) { this.amount = amount; }

    public Long getScriptStart() { return scriptStart; }

    public void setScriptStart(Long scriptStart) { this.scriptStart = scriptStart; }

    public Long getScriptEnd() { return scriptEnd; }

    public void setScriptEnd(Long scriptEnd) { this.scriptEnd = scriptEnd; }

    public Calendar getScriptStartObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(scriptStart);
        return calendar;
    }

    public Calendar getScriptEndObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(scriptEnd);
        return calendar;
    }

    public String getScriptStartMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(scriptStart);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getScriptEndMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(scriptEnd);
        String yy = addLeadingZero(calendar.get(Calendar.YEAR) % 100);
        String mm = addLeadingZero(calendar.get(Calendar.MONTH) + 1);
        String dd = addLeadingZero(calendar.get(Calendar.DAY_OF_MONTH));
        return mm + "/" + dd + "/" + yy;
    }

    public String getScriptStartHhMm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(scriptStart);
        String hH = addLeadingZero(calendar.get(Calendar.HOUR));
        String mM = addLeadingZero(calendar.get(Calendar.MINUTE));
        return hH + ":" + mM;
    }

    public String getScriptEndHhMm() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(scriptEnd);
        String hH = addLeadingZero(calendar.get(Calendar.HOUR));
        String mM = addLeadingZero(calendar.get(Calendar.MINUTE));
        return hH + ":" + mM;
    }

    private String addLeadingZero(int num) {
        String result = String.valueOf(num);
        if(num < 10){
            result = "0" + result;
        }
        return result;
    }
}

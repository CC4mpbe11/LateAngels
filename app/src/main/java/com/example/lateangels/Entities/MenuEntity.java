package com.example.lateangels.Entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

import java.util.Calendar;

@Entity(tableName="menu_table")
public class MenuEntity {
    @PrimaryKey
    private int menuID;
    private int breakfastID;
    private int lunchID;
    private int dinnerID;
    private Long menuDate;

    @NonNull
    @Override
    public String toString(){
        return "MenuEntity{" +
                "menuID=" + menuID +
                ", breakfastID=" + breakfastID +
                ", lunchID=" + lunchID +
                ", dinnerID=" + dinnerID +
                ", menuDate=" + menuDate +
                "}";
    }

    public MenuEntity(int menuID,
                      int breakfastID,
                      int lunchID,
                      int dinnerID,
                      Long menuDate)
    {
        this.menuID = menuID;
        this.breakfastID = breakfastID;
        this.lunchID = lunchID;
        this.dinnerID = dinnerID;
        this.menuDate = menuDate;
    }

    public int getMenuID() { return menuID; }

    public void setMenuID(int menuID) { this.menuID = menuID; }

    public int getBreakfastID() { return breakfastID; }

    public void setBreakfastID(int breakfastID) { this.breakfastID = breakfastID; }

    public int getLunchID() { return lunchID; }

    public void setLunchID(int lunchID) { this.lunchID = lunchID; }

    public int getDinnerID() { return dinnerID; }

    public void setDinnerID(int dinnerID) { this.dinnerID = dinnerID; }

    public Long getMenuDate() { return menuDate; }

    public void setMenuDate(Long menuDate) { this.menuDate = menuDate; }

    public Calendar getMenuDateObj() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(menuDate);
        return calendar;
    }


    public String getMenuDateMmDdYy() {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(menuDate);
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

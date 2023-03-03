package com.example.lateangels.Entities;

import androidx.annotation.NonNull;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName="meal_table")
public class MealEntity {
    @PrimaryKey
    private int mealID;
    private String name;
    private String type; //breakfast, lunch, or dinner
    private String entree;
    private String firstSide;
    private String secondSide;
    private String dessert;
    private String description;

    @NonNull
    @Override
    public String toString(){
        return "MealEntity{" +
                "mealID=" + mealID +
                ", name=" + name +
                ", type=" + type +
                ", entree=" + entree +
                ", firstSide=" + firstSide +
                ", secondSide=" + secondSide +
                ", dessert=" + dessert +
                ", description=" + description +
                "}";
    }

    public MealEntity(int mealID,
                      String name,
                      String type,
                      String entree,
                      String firstSide,
                      String secondSide,
                      String dessert,
                      String description)
    {
        this.mealID = mealID;
        this.name = name;
        this.type = type;
        this.entree = entree;
        this.firstSide = firstSide;
        this.secondSide = secondSide;
        this.dessert = dessert;
        this.description = description;
    }

    public int getMealID() { return mealID; }

    public void setMealID(int mealID) { this.mealID = mealID; }

    public String getType() { return type; }

    public void setType(String type) { this.type = type; }

    public String getName() { return name; }

    public void setName(String name) { this.name = name; }

    public String getEntree() { return entree; }

    public void setEntree(String entree) { this.entree = entree; }

    public String getFirstSide() { return firstSide; }

    public void setFirstSide(String firstSide) { this.firstSide = firstSide; }

    public String getSecondSide() { return secondSide; }

    public void setSecondSide(String secondSide) { this.secondSide = secondSide; }

    public String getDessert() { return dessert; }

    public void setDessert(String dessert) { this.dessert = dessert; }

    public String getDescription() { return description; }

    public void setDescription(String description) { this.description = description; }
}

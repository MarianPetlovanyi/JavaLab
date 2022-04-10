package com.ua.lviv.iot.lab2.hierarchy;
enum hardness{
    EASY,MEDIUM,HARD
}
public abstract class Machine {
    private int cashPerMinute;
    private int caloriesPerMinute;
    private int exerciseTime;
    public int getExerciseTime() {
        return exerciseTime;
    }

    public void setExerciseTime(int exerciseTime) {
        this.exerciseTime = exerciseTime;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    private String name;

    public int getCashPerMinute() {
        return cashPerMinute;
    }

    public void setCashPerMinute(int cashPerMinute) {
        this.cashPerMinute = cashPerMinute;
    }

    public int getCaloriesPerMinute() {
        return caloriesPerMinute;
    }

    public void setCaloriesPerMinute(int caloriesPerMinute) {
        this.caloriesPerMinute = caloriesPerMinute;
    }


    protected Machine(int cashPerMinute, int caloriesPerMinute, int exerciseTime,String name){
        this.setCashPerMinute(cashPerMinute);
        this.setCaloriesPerMinute(caloriesPerMinute);
        this.setName(name);
        this.setExerciseTime(exerciseTime);
    }
    public abstract String doExercise();
}
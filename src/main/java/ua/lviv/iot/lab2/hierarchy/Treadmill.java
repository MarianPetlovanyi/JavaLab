package ua.lviv.iot.lab2.hierarchy;


public class Treadmill extends Machine {
    private int maxSpeed;

    public Treadmill(int cashPerMinute, int caloriesPerMinute, int exerciseTime,int maxSpeed, String name) {
        super(cashPerMinute, caloriesPerMinute, exerciseTime,  name);
        this.maxSpeed=maxSpeed;
    }
    @Override
    public String doExercise() {
        return "You have to do this exercise ("+this.getName()+") for "+ this.getExerciseTime()+ " minutes and you will lose "+
                this.getCaloriesPerMinute()*this.getExerciseTime()+" calories.";
    }
}

package ua.lviv.iot.lab2.hierarchy;

public class StationaryBike extends Machine {
    private int maxRPM;
    public StationaryBike(int cashPerMinute, int caloriesPerMinute, int exericeseTime, int maxRPM, String name) {
        super(cashPerMinute, caloriesPerMinute,exericeseTime, name);
        this.maxRPM=maxRPM;
    }

    @Override
    public String doExercise() {
        return "You have to do this exercise ("+this.getName()+") for "+ this.getExerciseTime()+ " minutes and you will lose "+
                this.getCaloriesPerMinute()*this.getExerciseTime()+" calories.";
    }
}

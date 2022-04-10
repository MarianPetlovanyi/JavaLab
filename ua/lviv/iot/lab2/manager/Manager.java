package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.hierarchy.Machine;

import java.util.ArrayList;
import java.util.List;

public class Manager {
    private Machine[] arrOfMachines;
    ArrayList<String> toDoList = new ArrayList<String>();
    public Manager(Machine[] arrOfMachines){
        this.arrOfMachines=arrOfMachines;
        createExercisePlan();
        printToDoList();
    }
    public void createExercisePlan(){
        for (int i=0;i<arrOfMachines.length;i++) {
            toDoList.add(arrOfMachines[i].doExercise());
        }
    }
    public void printToDoList(){
        System.out.println("To do list:");
        for (int i=0; i<toDoList.size();i++) {
            System.out.println(toDoList.get(i));
        }
        System.out.println("End.");
    }

}

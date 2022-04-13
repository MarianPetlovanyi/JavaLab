package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.hierarchy.Machine;

import java.lang.reflect.Array;
import java.util.*;

public class Manager {
    private Machine[] arrOfMachines;
    private ArrayList<String> toDoList = new ArrayList<String>();
    public Manager(Machine[] arrOfMachines){
        this.arrOfMachines=arrOfMachines;
        sortArrayByCash();
        sortArrayByCashR();
        sortArrayByCalories();
        sortArrayByCaloriesR();
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
    Comparator cashPerMinuteComparator= Comparator.comparing(Machine::getCashPerMinute);
    Comparator caloriesPerMinuteComparator = Comparator.comparing(Machine::getCaloriesPerMinute);
    public void sortArrayByCash(){
        Arrays.sort(arrOfMachines, cashPerMinuteComparator);
        System.out.println("Sorted by cash per minute: ");
        for (int i = 0; i < arrOfMachines.length; i++)
        {
            System.out.println(arrOfMachines[i].toString());
        }
        System.out.println();

    }
    public void sortArrayByCashR(){
        Arrays.sort(arrOfMachines, cashPerMinuteComparator.reversed());
        System.out.println("Sorted(R) by cash per minute: ");
        for (int i = 0; i < arrOfMachines.length; i++)
        {
            System.out.println(arrOfMachines[i].toString());
        }
        System.out.println();

    }
    public void sortArrayByCalories(){
        Arrays.sort(arrOfMachines, caloriesPerMinuteComparator);
        System.out.println("Sorted by calories per minute: ");
        for (int i = 0; i < arrOfMachines.length; i++)
        {
            System.out.println(arrOfMachines[i].toString());
        }
        System.out.println();

    }
    public void sortArrayByCaloriesR(){
        Arrays.sort(arrOfMachines, caloriesPerMinuteComparator.reversed());
        System.out.println("Sorted(R) by calories per minute: ");
        for (int i = 0; i < arrOfMachines.length; i++)
        {
            System.out.println(arrOfMachines[i].toString());
        }
        System.out.println();
    }
}

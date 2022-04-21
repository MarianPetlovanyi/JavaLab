package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.hierarchy.Machine;

import java.lang.reflect.Array;
import java.util.*;

public class Manager {
    private Machine[] arrOfMachines;
    public ArrayList<String> getToDoList() {
		return toDoList;
	}

	private ArrayList<String> toDoList = new ArrayList<String>();
    public Manager(Machine[] arrOfMachines){
        this.setArrOfMachines(arrOfMachines);
    }
    public void createExercisePlan(){
        for (int i=0;i<getArrOfMachines().length;i++) {
            toDoList.add(getArrOfMachines()[i].doExercise());
        }
        System.out.println("To do list:");
        for (int i=0; i<toDoList.size();i++) {
            System.out.println(toDoList.get(i));
        }
        System.out.println("End.");
    }
    Comparator cashPerMinuteComparator= Comparator.comparing(Machine::getCashPerMinute);
    Comparator caloriesPerMinuteComparator = Comparator.comparing(Machine::getCaloriesPerMinute);
    public void sortArrayByCash(){
        Arrays.sort(getArrOfMachines(), cashPerMinuteComparator);
        System.out.println("Sorted by cash per minute: ");
        for (int i = 0; i < getArrOfMachines().length; i++)
        {
            System.out.println(getArrOfMachines()[i].toString());
        }
        System.out.println();

    }
    public void sortArrayByCashR(){
        Arrays.sort(getArrOfMachines(), cashPerMinuteComparator.reversed());
        System.out.println("Sorted(R) by cash per minute: ");
        for (int i = 0; i < getArrOfMachines().length; i++)
        {
            System.out.println(getArrOfMachines()[i].toString());
        }
        System.out.println();

    }
    public void sortArrayByCalories(){
        Arrays.sort(getArrOfMachines(), caloriesPerMinuteComparator);
        System.out.println("Sorted by calories per minute: ");
        for (int i = 0; i < getArrOfMachines().length; i++)
        {
            System.out.println(getArrOfMachines()[i].toString());
        }
        System.out.println();

    }
    public void sortArrayByCaloriesR(){
        Arrays.sort(getArrOfMachines(), caloriesPerMinuteComparator.reversed());
        System.out.println("Sorted(R) by calories per minute: ");
        for (int i = 0; i < getArrOfMachines().length; i++)
        {
            System.out.println(getArrOfMachines()[i].toString());
        }
        System.out.println();
    }
	public Machine[] getArrOfMachines() {
		return arrOfMachines;
	}
	public void setArrOfMachines(Machine[] arrOfMachines) {
		this.arrOfMachines = arrOfMachines;
	}
}

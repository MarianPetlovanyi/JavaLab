package ua.lviv.iot.lab2.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.Assert.*;

import ua.lviv.iot.lab2.hierarchy.Machine;
import ua.lviv.iot.lab2.hierarchy.SkippingRope;
import ua.lviv.iot.lab2.hierarchy.StationaryBike;
import ua.lviv.iot.lab2.hierarchy.Treadmill;

class ManagerTest {
	private Manager manager;
	private Treadmill treadmill1;
	private StationaryBike stationaryBike1;
	private SkippingRope skippingRope1;
	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
		treadmill1=new Treadmill(10, 5, 5, 10,"treadmill");
	    stationaryBike1=new StationaryBike(20, 10, 10, 1000, "starionarybike");
	    skippingRope1=new SkippingRope(0,10, 15, "skakalka", 120);
		Machine[] machines={treadmill1, stationaryBike1, skippingRope1};
		manager = new Manager(machines);
		
	}

	@AfterEach
	void tearDown() throws Exception {
	}
	@Test
	void testManagerConstructor() {
		
		Assertions.assertNotNull(manager);
		Assertions.assertEquals(3, manager.getArrOfMachines().length);
		Assertions.assertEquals(treadmill1, manager.getArrOfMachines()[0]);
		Assertions.assertEquals(stationaryBike1, manager.getArrOfMachines()[1]);
		Assertions.assertEquals(skippingRope1, manager.getArrOfMachines()[2]);
	}
	@Test
	void testCreateExercisePlan() {
		manager.createExercisePlan();
		Assertions.assertNotNull(manager.getToDoList());	
	}
	@Test
	void testSortArrayByCash() {
		manager.sortArrayByCash();
		var arr=manager.getArrOfMachines();
		for (int i = 0; i < manager.getArrOfMachines().length - 1; i++) {
	        int j = i + 1;
	        boolean res;
	        res=(arr[i].getCashPerMinute() - arr[j].getCashPerMinute()<=0) ? (true):(false);
	        Assertions.assertTrue(res);
	 } 
	}
	@Test
	void testSortArrayByCashR() {
		manager.sortArrayByCashR();
		var arr=manager.getArrOfMachines();
		for (int i = 0; i < manager.getArrOfMachines().length - 1; i++) {
	        int j = i + 1;
	        boolean res;
	        res=(arr[j].getCashPerMinute() - arr[i].getCashPerMinute()<=0) ? (true):(false);
	        Assertions.assertTrue(res);
	 } 
	}
	@Test
	void testSortArrayByCalories() {
		manager.sortArrayByCalories();
		var arr=manager.getArrOfMachines();
		for (int i = 0; i < manager.getArrOfMachines().length - 1; i++) {
	        int j = i + 1;
	        boolean res;
	        res=(arr[i].getCaloriesPerMinute() - arr[j].getCaloriesPerMinute()<=0) ? (true):(false);
	        Assertions.assertTrue(res);
	 } 
	}
	@Test
	void testSortArrayByCaloriesR() {
		manager.sortArrayByCaloriesR();
		var arr=manager.getArrOfMachines();
		for (int i = 0; i < manager.getArrOfMachines().length - 1; i++) {
	        int j = i + 1;
	        boolean res;
	        res=(arr[j].getCaloriesPerMinute() - arr[i].getCaloriesPerMinute()<=0) ? (true):(false);
	        Assertions.assertTrue(res);
	 } 
	}
}

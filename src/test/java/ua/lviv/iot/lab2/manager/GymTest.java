package ua.lviv.iot.lab2.manager;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ua.lviv.iot.lab2.hierarchy.Machine;
import ua.lviv.iot.lab2.hierarchy.SkippingRope;
import ua.lviv.iot.lab2.hierarchy.StationaryBike;
import ua.lviv.iot.lab2.hierarchy.Treadmill;

class GymTest {
	private Manager manager;
	private Treadmill treadmill1;
	private StationaryBike stationaryBike1;
	private SkippingRope skippingRope1;
	private Gym gym;
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
	void testGymConstructor() {
		gym=new Gym(manager);
		Assertions.assertNotNull(gym);
		Assertions.assertEquals(manager,gym.getManager());

	}
	

}

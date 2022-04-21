package ua.lviv.iot.lab2.manager;

import ua.lviv.iot.lab2.hierarchy.Machine;
import ua.lviv.iot.lab2.hierarchy.SkippingRope;
import ua.lviv.iot.lab2.hierarchy.StationaryBike;
import ua.lviv.iot.lab2.hierarchy.Treadmill;

import java.util.*;

public class Gym {
	public Manager getManager() {
		return manager;
	}
	Manager manager;
	public Gym(Manager manager) {
		this.manager=manager;
	}
    }

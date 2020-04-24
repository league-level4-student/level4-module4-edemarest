package _04_hospital;

import java.util.ArrayList;

public class Surgeon extends Doctor {
	
	boolean performsSurgery;
	boolean performsSurgery() {
		return true;
	}
	boolean makesHouseCalls() {
		return false;
	}
	void AssignPatient(Patient patient) {
		p.add(patient);
	}
}

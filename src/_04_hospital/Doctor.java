package _04_hospital;

import java.util.ArrayList;

public class Doctor extends Hospital{
	ArrayList<Patient> p = new ArrayList<Patient>();
	boolean performsSurgery;
	ArrayList<Patient> patients = new ArrayList<Patient>();
	boolean performsSurgery() {
		return performsSurgery;
	}
	boolean makesHouseCalls() {
		return false;
	}
	public void assignPatient(Patient patient) throws DoctorFullException{
		if(p.size() == 3) {
			throw new DoctorFullException();
		}
		else {
		p.add(patient);
		}
	}
	public ArrayList getPatients() {
		return p;
		
	}
	public void doMedicine() {
		// TODO Auto-generated method stub
		for(int i = 0; i < p.size(); i++) {
			p.get(i).feelsCaredFor = true;
		}
	}

}

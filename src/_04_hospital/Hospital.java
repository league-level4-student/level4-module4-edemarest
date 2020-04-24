package _04_hospital;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.util.ArrayList;

public class Hospital {
	ArrayList<Doctor> ds = new ArrayList<Doctor>();
	
	void addDoctor(Doctor doctor) {
		ds.add(doctor);
	}
	ArrayList getDoctors() {
		return ds;
	}
	
	ArrayList<Patient> ps = new ArrayList<Patient>();
	
	void addPatient(Patient patient) {
		ps.add(patient);
	}
	ArrayList getPatients() {
		return ps;
	}
	public void assignPatientsToDoctors() {
		// TODO Auto-generated method stub
		for(int i = 0; i < ds.size(); i++) {
			for(int j = 0; j < ps.size(); j++) {
				try {
					ds.get(i).assignPatient(ps.get(j));
					System.out.println("Assigning doctor "+i+" to patient" + j );
				} catch (DoctorFullException e) {
					i++;
					j--;
					System.out.println("Assigning doctor "+i+" to patient" + j );
				}
			}
		}
	}
	 
}

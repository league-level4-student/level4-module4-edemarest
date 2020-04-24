package _04_hospital;

public class GeneralPractitioner extends Doctor{
	boolean performsSurgery;
	boolean performsSurgery(Doctor doctor) {
		return false;
	}
	public boolean makesHouseCalls() {
		// TODO Auto-generated method stub
		return true;
	}
	void AssignPatient(Patient patient) {
		p.add(patient);
	}
}

package InterfaceConcept;

public class FortisHospital extends Medical implements USMedical, UKMedical, IndianMedical{
	int Min_Fee=50;

	@Override
	public void physioServices() {
		System.out.println("FH---PhysioServices");
		
	}

	@Override
	public void oncologyServices() {
		System.out.println("FH---oncologyServices");
		
	}

	@Override
	public void dentalServices() {
		System.out.println("FH---dentalServices");
	}

	@Override
	public void entServices() {
		System.out.println("FH---entServices");
		
	}

	@Override
	public void urologyServices() {
		System.out.println("FH---urologyServices");
		
	}

	@Override
	public void pharmaServices() {
		System.out.println("FH---pharmaServices");
		
	}

	@Override
	public void cardioServices() {
		System.out.println("FH---cardioServices");
	}

	@Override
	public void orthoServices() {
		System.out.println("FH---orthoServices");
	}

	@Override
	public void nuroServices() {
		System.out.println("FH---nuroServices");
		
	}
	//individual
	public void medicalTraining() {
		System.out.println("FH-----medicaltraining");
	}

	@Override
	public void emergencyServices() {
		System.out.println("FH---EmergencyServices");
	}
	//method hiding
	public static void billing() {
		System.out.println("FH---Billing");
	}
	public void medicalInsurance() {
		System.out.println("FH----Insuranceservice");
	}

	@Override
	public void covidVaccination() {
		System.out.println("FH---Covid Vaccination");
		
	}
	
	
	
	

}

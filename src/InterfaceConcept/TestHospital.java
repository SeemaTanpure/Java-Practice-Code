package InterfaceConcept;

public class TestHospital {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		FortisHospital fh=new FortisHospital();
		fh.cardioServices();
		fh.dentalServices();
		fh.entServices();
		fh.nuroServices();
		fh.pharmaServices();
		fh.emergencyServices();
		fh.covidVaccination();
		System.out.println(fh.MIN_FEE);
		
		//static method called by interface name 
		USMedical.billing();
		FortisHospital.billing();
		System.out.println(USMedical.MIN_FEE);
		//top casting : child class object can be referred by parent interface ref variable
		USMedical us=new FortisHospital();
		us.dentalServices();
		us.emergencyServices();
		us.oncologyServices();
		us.physioServices();
		
		
		

	}

}

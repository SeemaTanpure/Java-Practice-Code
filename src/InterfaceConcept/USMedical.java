package InterfaceConcept;

public interface USMedical extends WHO {
	int MIN_FEE=100;
	//abstract methods: method without body (only for non static methods)
	//cannot create object of interfaces
	public void physioServices();
	public void oncologyServices();
	public void dentalServices();
	public void emergencyServices();
	
	public static void billing() {
		System.out.println("US Medical---Billing");
	}
	default void medicalInsurance()
	{
		System.out.println("US---MedicalInsurance");
		}
}

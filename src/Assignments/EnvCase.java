package Assignments;

public class EnvCase {

	public static void main(String[] args) {
		// Switch case to environment variable settings
		String env="UAT";
		switch(env) {
		case "QA":
			System.out.println("Run test case on QA env");
			break;
		case "Dev":
			System.out.println("Run test case on Dev env");
			break;
		case "UAT":
			System.out.println("Run test case on UAT env");
			break;
		case "Prod":
			System.out.println("Run test case on Prod env");
			break;
		default:
			System.out.println("Please select the right env for testing: "+env);
			break;
			
			
			
		}

	}

}

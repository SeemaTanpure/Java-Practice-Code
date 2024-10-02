package ExceptionHandling;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class TestException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int i= 9/0;//Rut time exception
		
		try {
			
			FileInputStream ip=new FileInputStream("text.xls");
		} 
		catch (FileNotFoundException e) {
		e.printStackTrace();
		}
		try {
			Thread.sleep(2000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		

	}

}

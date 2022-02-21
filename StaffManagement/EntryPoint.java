import java.util.Scanner;
import java.util.Random;

public class EntryPoint {

	public static void main(String[] args) {
		
		Random random = new Random();
		Employee employee = new Employee();
		
		int inserts = random.nextInt(10) +1;

		System.out.println("You have "+inserts+" insertions left");
		
		for(int i=inserts; i>0; i--) {
			Scanner scan = new Scanner(System.in);
			
			System.out.println("Please input the employee's first name: ");
			String firstName = scan.nextLine();
			employee.getFirstName();
			System.out.println("Please input the employee's last name: ");
			String lastName = scan.nextLine();
			employee.getLastName();
			System.out.println("Please input the employee's age: ");
			int age = scan.nextInt();
			employee.getAge();
			System.out.println("Please input the employee's monthly salary: ");
			double monthlySalary = scan.nextDouble();
			employee.getMonthlySalary();
	
			System.out.println("Employee information: "+firstName+" "+lastName+", "+age+", "+monthlySalary);
			System.out.println("You have "+(i-1)+" insertions left");
			
			
		
		}

		
	}

}

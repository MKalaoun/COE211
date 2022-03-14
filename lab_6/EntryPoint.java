import java.util.Scanner;

public class EntryPoint {
    public static void main (String[] args) {
        /**
         * Enjoy <3
         */
    	Scanner scan = new Scanner(System.in);
    	boolean iff = false;
    	
    	do {
    	System.out.println("Which service would you like to use?");
		System.out.println("[1]: Basic week visualizer");
		System.out.println("[2]: Advanced week visualizer");
		System.out.println("[3]: Basic calculator");
		System.out.println("[4]: Employee repertoire");
		int use = scan.nextInt();
		
		switch(use) {
			case 1:
				BasicWeek basic = new BasicWeek();
				basic.printDays();
				break;
			
			case 2:
				AdvancedWeek advanced = new AdvancedWeek();
				advanced.printDays();
				break;
				
			case 3:
				Calculator calc = new Calculator();
				break;
			
			case 4:
				Employee employee = new Employee();
				System.out.println(employee);
				break;
				
			default:
				System.out.println("Please make sure you pick a number between 1 and 4");
				iff = true;
				}
		
		System.out.println("Would you like to perform another operation? (y/n)");
		String request = scan.nextLine();
		if(request.equals('y')) {
			iff = true;
		} else {
			iff = false;
		}
		
    	} while(iff = true);
    	
    }
}
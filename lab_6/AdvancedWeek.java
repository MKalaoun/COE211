public class AdvancedWeek {
    // Initializing variables
    private String day_1 = "Monday";
    private int index = 1;
    /**
     * Continue filling variables
     */
    private	String  day_2 = "Tuesday";
	private	String  day_3 = "Wednesday";
	private	String  day_4 = "Thursday";
	private	String  day_5 = "Friday";
	private	String  day_6 = "Saturday";
	private	String  day_7 = "Sunday";
    

    // printing out the days
    public void printDays() {
        System.out.println("The advanced days of the week are:"+",\n"+
                            index++ + ": "+day_1 +",\n"+
                            index++ + ": "+day_2 +",\n"+
                            index++ + ": "+day_3 +",\n"+
                            index++ + ": "+day_4 +",\n"+
                            index++ + ": "+day_5 +",\n"+
                            index++ + ": "+day_6 +",\n"+
                            index++ + ": "+day_7 );
    }
}
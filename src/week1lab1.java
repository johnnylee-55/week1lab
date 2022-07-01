
public class week1lab1 {

	public static void main(String[] args) {
		
		// create a variable to hold the quantity of available place seats left on a flight
		int availableSeats = 200;
		
		// create a variable to hold the cost of groceries at checkout
		double groceryTotalCost = 90.00;
		
		// create a variable to hold a person's middle name
		char personsMiddleInitial = 'W';
		
		// create a variable to hold true if it's hot outside and false if it's cold outside
		boolean hotOutside = true;
		
		// create a variable to hold a customer's first name
		String customerFirstName = "Kanye";
		
		// create a variable to hold a street address
		String streetAddress = "123 Boulevard Way";
		
		// print all variables to the console
		System.out.println("There are " + availableSeats + " left on the flight.");
		System.out.println("The toal cost of groceries is: $" + groceryTotalCost);
		System.out.println("The person's middle initial is " + personsMiddleInitial + ".");
		System.out.println("It is hot outside: " + hotOutside);
		System.out.println(customerFirstName + " is the customer's first name.");
		System.out.println("The person lives at " + streetAddress);
		
		// a customer booked 2 plane seats, remove 2 seats from the available seats variable
		availableSeats -= 2;
		System.out.println("There are now " + availableSeats + " left on the flight.");
		
		// impulse candy bar purchase, add 2.15 to the grocery total
		groceryTotalCost += 2.15;
		System.out.println("The toal cost of groceries is now: $" + groceryTotalCost);
		
		// birth certificate was printed incorrectly, change the middle initial to something else
		personsMiddleInitial = 'W';
		System.out.println("The person's middle initial is now " + personsMiddleInitial + ".");
		
		// the season has changed, update the hot outside variable to the opposite of what it was
		hotOutside = !hotOutside;
		System.out.println("It is hot outside: " + hotOutside);
		
		// print a line to the console that introduces the customer and says that they live at the address variable
		System.out.println("This is " + customerFirstName + " " + personsMiddleInitial + "., and they live at " + streetAddress + ".");
	}

}


public class CarPurchase { //TODO: Private instances of variables that should not be manipulated by the user of the code
	
	private double carCost;
	private double downPayment;
	private double lengthOfLoan;
	private double interestRate;
	
	
	
		
	public CarPurchase(double carC, double downPAY, double lengthloan, double interestR) { //TODO: Constructor to initialize the needed instances from the passed in values.
		
		
		carCost = carC;
		downPayment = downPAY;
		lengthOfLoan = lengthloan;
		interestRate = interestR;
}
	
	public double principalCalculator() {//TODO: method that returns the calculated value of the car's principal
		
		double returnPrincipal;
		
		returnPrincipal = carCost - downPayment;
		
		return returnPrincipal;
		
	}
	
	public double monthlyCarPayment() {//TODO: Method to calculate the monthly payment on the car and return the value
		
		double monthlyCarPayment;
		double numerator;
		double denominator;
		
		numerator = (interestRate/(12)) * (principalCalculator()); //TODO: Simplified formula to numerator for readability;
		denominator= (1-(Math.pow(1+(interestRate/12), (-1*lengthOfLoan))));//TODO: Simplified formula to denominator for readability;
		
		monthlyCarPayment = numerator/denominator;
		
		
		return monthlyCarPayment;
	}

	
	public double totalSpentInterest() {//TODO: Method implemented to return the total interest spent
		
		double totalSpentInterest;
		
		totalSpentInterest = (monthlyCarPayment() * lengthOfLoan) - principalCalculator();
		
		
		return totalSpentInterest;
	}
}

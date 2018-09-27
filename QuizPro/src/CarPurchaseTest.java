import static org.junit.jupiter.api.Assertions.*;

import java.text.DecimalFormat;

import org.junit.jupiter.api.Test;

class CarPurchaseTest {

	
	@Test
	public void totalSpentInterest_Test(){//TODO: method implemented to test for the total spent interest
		

		DecimalFormat former = new DecimalFormat("##.0000");
		
		double test1;
		
		CarPurchase interestSpent = new CarPurchase(35000,0,60,0.10);//Values passed to the constructor in the CarPurchase class.
		
		test1 = interestSpent.totalSpentInterest();
		
		System.out.println("Your total interest will be:  "+"$"+former.format(test1));
		
	}
	
	
	@Test
	public void monthlyCarPayment_Test() {//TODO: method implemented to test for the monthly payment on the car.
		
		DecimalFormat form = new DecimalFormat("##.0000");
		
		double test2;
		
		CarPurchase monthlyPayment = new CarPurchase(35000,0,60,0.10);
		
		test2 = monthlyPayment.monthlyCarPayment();
		
		System.out.println("Your monthly payment will be:  "+"$"+form.format(test2));
		
		
	}
}

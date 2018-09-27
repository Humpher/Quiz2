import java.text.DecimalFormat;
import java.util.Scanner;

public class PlayerStat {
	
	private double theHits;     //Private instances to prevent any form of manipulation after user input values
	private double theBats;
	private double baseBalls;
	private double TimesHitByPitch;
	private double SacrificeFlies;
	
	private double Singles, Doubles, Triples, HomeRuns;
	
	// double NumReg;
	
	
	
	public double BattingAverage(double Hits, double Bats) { //Method implemented to calculate the BattingAverage
		
		theHits = Hits;
		theBats = Bats;
		
		double battingAverage;
		
		battingAverage = theHits/theBats;
		
	return battingAverage;		
	}
	
	
	public double OnBasePercentage(double BB, double HBP, double SF) {//Method implemented to calculate ON Base Percentage
		
		double onBasePercentage;
		
		baseBalls = BB;
		TimesHitByPitch = HBP;
		SacrificeFlies = SF;
		
		onBasePercentage = (theHits + baseBalls + TimesHitByPitch)/(theBats + baseBalls + TimesHitByPitch + SacrificeFlies);
		
		return onBasePercentage;
	}
	
	public double TotalBases(double singL, double doubL, double TripL, double HomeR) {//Method implemented to calculate the TotalBases 
		
		double totalBases;
		
		Singles = singL;
		Doubles = doubL;
		Triples = TripL;
		HomeRuns = HomeR;
		
		totalBases = Singles + (2*Doubles) + (3*Triples) + (4*HomeRuns);
		
		//NumReg = totalBases;
		
		return totalBases;
		
			
	}
	
	

	
	
	
	
	
	
	
	//TODO: Below is the main method implemented  to receive the input values and pass them onto the required methods in 
	// in the PlayerStat class to perform the necessary calculations.

	
	public static void main(String[] args) {
		
		double finBA;
		
		String name;
		double hits;
		double atBats;
		double BaseB;
		double HBPs, SacF;
		double ones,twos,threes, Hr;
		
		double sluggingPercentage, OPS;
		
		System.out.println("Please enter the name of the baseball player:       ");
		
		Scanner input = new Scanner(System.in);
		name = input.next();
		
		DecimalFormat form = new DecimalFormat("##.00");
		
		
		//System.out.println("The name you enetered is  " + name);
		
		
		System.out.print("Please Enter " + name + "'s Hits value:   ");
		hits = input.nextDouble();
		
		System.out.print("Please Enter " + name + "'s At Bats value:   ");
		atBats = input.nextDouble();
		
		System.out.print("Please Enter " + name + "'s BasesonBalls value:   ");
		BaseB = input.nextDouble();
		
		System.out.print("Please Enter " + name + "'s HBP value:   ");
		HBPs = input.nextDouble();
		
		System.out.print("Please Enter " + name + "'s Sacrificial flies value:   ");
		SacF = input.nextDouble();
		
		System.out.print("Please Enter " + name + "'s Singles value:   ");
		ones = input.nextDouble();
		
		System.out.print("Please Enter " + name + "'s  Doubles  value:   ");
		twos = input.nextDouble();
		
		System.out.print("Please Enter " + name + "'s Triples value:   ");
		threes = input.nextDouble();
		
		System.out.print("Please Enter " + name + "'s HomeRuns value:   ");
		Hr= input.nextDouble();
		
		System.out.print("\n");
		
		
		
		
		
		PlayerStat passon = new PlayerStat();
		
		finBA = passon.BattingAverage(hits, atBats);
		
		System.out.println("The Batting Average of " + name + " is " + (form.format(finBA)));
		
		System.out.print("\n");
		
		
		PlayerStat passer = new PlayerStat();
		
		finBA = passer.OnBasePercentage(BaseB,HBPs, SacF);
		
		System.out.println("The On Base Percentage of " + name + " is " + (form.format(finBA))); 
		
		System.out.print("\n");
		
		
		PlayerStat passerer = new PlayerStat();
		
		finBA = passerer.TotalBases(ones,twos,threes,Hr);
		
		System.out.println("The total bases of " + name + " is " + (form.format(finBA)));
		
		System.out.print("\n");
		
		
		
	sluggingPercentage = (passerer.TotalBases(ones, twos, threes, Hr))/ (atBats);//Hard coding the calculation of slugging percentage
	
	OPS = (passer.OnBasePercentage(BaseB,HBPs, SacF)) + sluggingPercentage;//Hard coding the calculation of OPS
		
		
		
		System.out.println("The Slugging percentage of " + name + "'s is " + (form.format(sluggingPercentage)));
		
		System.out.print("\n");
		
		
		System.out.println("The OPS of " + name + "'s is " +(form.format(OPS)));
		
		
		
		
		
	}
}

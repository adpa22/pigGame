package pigGame;
import java.util.*;
public class Pig1 {
	public static void main (String []args){
		Scanner scn = new Scanner (System.in);
		PairOfDice1 d1 = new PairOfDice1();
		//0 is true, 1 is false
		int pr = 0, pt = 0, cr = 0, ct = 0;
		int proll=0;
		int croll = 0;
		int poption;
		
		System.out.println("Welcome to the pig game! \"0\" to keep rolling and \"1\" to hold your turn!");
		
		while (ct < 100 && pt <100){
			while (proll == 0){
				d1.roll();
				if (d1.isHalfSnakeEyes()){
					System.out.println("Sorry you rolled a 1");
					pr = 0;
					proll = 1;
					croll = 0;
				} else if (d1.isSnakeEyes()){
					System.out.println("Sorry you rolled two 1's!");
					pr = 0;
					pt =0;
					proll = 1;
					croll = 0;
				} else {
					pr += d1.rollTotal();
					pt+=pr;
					System.out.println("You rolled a " + d1.getA() + " and a " + d1.getB());
					System.out.println("Your round total is " + d1.rollTotal());
					System.out.println("Your total is " + pr);
					System.out.println("Do you want to hold? (0/1)");
					poption = scn.nextInt();
					if (poption == 1){
						pt += pr;
						pr = 0;
						proll = 1;
						croll = 0;
						System.out.println("Your total points so far are : " + pr);
					}	
				}
			}
			while (croll == 0 ){
				d1.roll();
				if (d1.isHalfSnakeEyes()){
					System.out.println("Computer rolled a 1!");
					cr = 0;
					croll = 1;
					proll = 0;
				} else if (d1.isSnakeEyes()){
					System.out.println("Computer rolled two 1's!");
					cr = 0;
					ct = 0;
					croll  = 1;
					proll = 0;
				} else {
					cr += d1.rollTotal();
					ct += cr;
					System.out.println("Computer rolled a " + d1.getA() + " and a " + d1.getB());
					System.out.println("Computer total is "  + ct);
					
				}
			}
		}
		if (ct> pt){
			System.out.println("Sorry computer wins!");
		} else if (pt>ct){
			System.out.println("You win!");
		} else {
			System.out.println("You tied!");
		}
	}

}

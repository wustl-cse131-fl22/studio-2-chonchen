package studio2;

import java.util.Scanner;

public class Ruin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Enter starting amount: ");
		int startAmount = in.nextInt();
		System.out.print("Enter chance of winning: ");
		double winChance = in.nextDouble();
		System.out.print("Enter win limit: ");
		int winLimit = in.nextInt();
		System.out.print("Enter number of simulations: ");
		int totalSim = in.nextInt();
		int currentSim = 1;
		int currentAmount = startAmount;
		String outcome = null;
		for(int i = 0; i < totalSim; i++) {
			int plays = 0;
			while (currentAmount < winLimit && currentAmount > 0) {
				double a = Math.random();
				if( a <= winChance) {
					currentAmount += 1;
				}	
				else {
					currentAmount -= 1;
				}
				plays += 1;
			}
			//check current amount, win/loss,
			if(currentAmount == winLimit) {
				outcome = "Win";
			}
			else {
				outcome = "Loss";
			}
			
			System.out.println("Simulation " + currentSim + ": " + plays + " " + outcome);
			currentSim += 1;
			currentAmount = startAmount;
			}
			
			
			}	
			
		}
		
			
			
		
		
		




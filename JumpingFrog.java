import java.util.Scanner;

public class JumpingFrog{

	public static void main(String[] args){
        
		Scanner input = new Scanner(System.in);
		System.out.print("Enter the Distance :  ");
		int distance = input.nextInt();		
		findTime(distance);

	}

	public static void findTime(int distance){

		int travelledDistance = distance;
		int[] distances = {5,3,2};
		int[] times = {2,3,5};

		int i = 0;
        	int totalTime = 0;
       	 	int hopCount =0;

		while(distance>0){
		    	distance-=distances[i%3];
		    	if(distance>0){
			totalTime+=times[i%3];
		    	}i++;
		    	hopCount++;
		}
       	 	System.out.println("Distance Travelled By Frog  : " + travelledDistance + " Meters");
        	System.out.println("No. of Hops Made By Frog    : " + hopCount);
		System.out.println("Total Time Taken By Frog    : " + totalTime + " Seconds");
	}
}

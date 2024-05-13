import java.util.Scanner;

	public class MenstrationApp {

	public static void main(String [] args){

	Scanner input = new Scanner(System.in);

	System.out.println("welcome to the month of your menstration");

	int menstrationLength = 0;

	int periodLength = 0;

	System.out.println("please enter the details we need to know about your menstration circe");

	System.out.println(enter the menstration length of your menstration in days);

	cycleLength = input.nextInt();

	System.out.println(enter the duration cycle length of your menstration in days);

	periodLength = input.nextInt();

		int cycleTime = cycleLength - periodLength;

	int fertileStart = cycleTime / 14 ;

	System.out.println(" the fertile start 14 days before the next period");

	int fertileEnd = cycleTime - 10;

System.out.println("the fertile end 10 days before the next period occour");

System.out.println("=========================================/n");

System.out.println("the menstration cycle length:\t" + cycleLength + "\t days");

System.out.println("the duration cycle length:\t" + periodLength + "\t days");

System.out.println("the cycle time is :\t" + cycleTime + "\t days");

System.out.println("the fertile is: (ovaluation period) starts on day \t" fertileStart + fertileEnd);
}
}
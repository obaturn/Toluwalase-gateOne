import java.util.Scanner;

	public class Menstration App {

	public static void main(String [] args){

Scanner input = new Scanner(System.in);

	int cycleLength;

	int menstrationLength;

	int currentDay;

System.out.println("welcome to the  month of your menstration cycle");

System.out.println("enter the last day you saw your mensration cycle last in days ");

cylcleLength = input.nextInt();

System.out.println("Enter the average cylcle of your menstration");

menstrationLength = input.nextInt();

System.out.println("Enter the current day of your menstration");

currentDay = input.nextInt();

int nextMenstrationCycle = (currentDay + cycleLength -1) % cyclelength +1;
  
int flow date = nextMenstrationCycle - (cycleLength / 2) 
public class TaskFour {
	public static void main(String [] args){
	int [] result = {1,2,3,4,5,6,7,8,9,10}
	System.out.println(evenIndex(result));


public static int evenIndex(int [] numbers){
counter = 0
for(int count = 0 ; count <  numbers.length ; count++) {
	 if(numbers % 2 == 0){
	counter ++;
	}
	}
	return counter;
     }


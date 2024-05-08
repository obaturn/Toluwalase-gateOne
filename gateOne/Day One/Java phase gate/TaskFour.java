import java.util.Scanner;
public class TaskFour {
public static void main(String [] args){
Scanner input = new Scanner(System.in);
int count = 0;
int sum = 0;
for(int i = 0 ; i < 10 ; i ++){
System.out.println("Enter tthe scores you wish to enter");
int userInput = input.nextInt();
if(userInput % sum == 0){
count ++;
}
sum += count;
}
System.out.println("The sum of the even indexes is" + sum);
}
}

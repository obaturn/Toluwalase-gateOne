import java.util.Scanner;

	public class TaskOne {

		public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("what is your name");
		String name = input.nextLine();

		String [] []  ticToe = new String [3][3];

		String user;
		for(int row = 0 ; row <= 3; row ++){
		
			for(int column = 0 ; column <= 3 ; column++){

		System.out.println("enter the alphabet between x and 0");
		user = input.nextLine().trim().toLowerCase();
		

	if(user.equals(("x")) || user.equals(("o"))){
	ticToe[row][column] = user;
	}
      
    

else {

System.out.println("invalid input pls put in the right own");
ticToe[row][column] = user;
 
   }
  
  }
}

for(int row = 0 ; row <= 3 ; row ++){
	for(int column = 0 ; column <= 3 ; column++){

 	System.out.println(ticToe[row][column]);
        }
      }
    }
   }

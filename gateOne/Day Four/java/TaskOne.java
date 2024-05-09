import java.util.Scanner;

	publi class TaskOne {

		public static void main(String [] args){
		Scanner input = new Scanner(System.in);

		System.out.println("what is your name");
		String name = input.nextInt();

		String [] []  ticToe = new String [3][3];

		for(int row = 0 , row < 3; row ++){
		
			for(int column = 0 , column <3 ; column++){

		System.out.println("enter the alphabet between x and 0");
		String user = input.nextLine();

	if(user.equalsignoreCase(("x")) || user.equalsignoreCase(("o")){
	}

else {

System.out.println("invalid input pls put in the right own");
ticToe[row][column] = userInput;
 
   }
  }
}

for(int row = 0 ; row < 3 ; row ++){
	for(int column = 0 ; column < 3 ; column++){

 	System.out.println(ticToe[row][column]);
   }
}

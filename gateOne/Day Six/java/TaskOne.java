import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateOfBirth{
    public static void main(String[] args){
	Scanner scanner = new Scanner(System.in);

	System.out.print("Enter dateOfBirth: ");
	String dateOfBirth = scanner.nextLine();
        collectDate(dateOfBirth);        
}


public static void collectDate(String date){

	String yearOfBirth =" ";

	LocalDateTime localDateTime = LocalDateTime.now();
	DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
	
	String currentDate = localDateTime.format(formatter);
	
	System.out.println(currentDate);
	 
	String presentYear = " ";

	for(char letter = 6 ; letter < currentDate.length(); letter++){

		presentYear += currentDate.charAt(letter);
	
	}

	int age = Integer.parseInt(presentYear) - Integer.parseInt(yearOfBirth);
	
	System.out.println(age);

	
	
    }
}
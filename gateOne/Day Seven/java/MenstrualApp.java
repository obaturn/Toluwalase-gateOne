 import java.util.Scanner; 
import java.time.LocalDate; 
import java.time.Period; 
import java.time.format.DateTimeFormatter; 

public class MenstrualApp { 

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 

        System.out.println("WELCOME TO OUR MENSTRUAL APP"); 

        System.out.println("Enter the day your period starts (dd/mm/yyyy):"); 
        String periodStart = input.nextLine(); 

        System.out.println("Enter the last day your period ends (dd/mm/yyyy):"); 
        String periodEnd = input.nextLine(); 

        System.out.println("How many days does your menstrual cycle length take?"); 
        int cycleLength = input.nextInt(); 

        LocalDate start = LocalDate.parse(periodStart, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
        LocalDate end = LocalDate.parse(periodEnd, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 

        Period cyclePeriod = Period.between(start, end);

   	int ovulationDay = cycleLength / 2;
	int safeDays = (ovulationDay/2) ;

        LocalDate nextMenstrualCycleStart = end.plusDays(cycleLength);
        LocalDate nextMenstrualCycleEnd = nextMenstrualCycleStart.plus(cyclePeriod); 
        int cycleDuration = Period.between(nextMenstrualCycleStart, nextMenstrualCycleEnd).getDays(); 
	
	LocalDate nextOvulationDate = nextMenstrualCycleEnd.plusDays(ovulationDay);
	LocalDate nextOvulationEndDate = nextOvulationDate.plusDays(safeDays);
	LocalDate nextSafePeriodStartDate = nextOvulationDate.plusDays(1);

	LocalDate safePeriodBeforeNextMenstruationDate = nextMenstrualCycleStart.minusDays(safeDays);

	System.out.println("Safe period before next Mestruation Date : -"safePeriodBeforeNextMenstruationDate +" till next menstruation starts.");
        System.out.println("Start of next cycle: " + nextMenstrualCycleStart); 
        System.out.println("End of next cycle: " + nextMenstrualCycleEnd);

	System.out.println("First Safe Period after your next period: "+nextMenstrualCycleEnd +  " - " + nextMenstrualCycleEnd.plusDays(safeDays));

        System.out.println("Next Ovulation date : " + nextOvulationDate);

	System.out.println("Last safe Period after your next period: " + nextSafePeriodStartDate + " - " +  nextOvulationEndDate);
    }
}
 
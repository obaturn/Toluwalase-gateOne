import java.util.Scanner; 
import java.time.LocalDate; 
import java.time.Period; 
import java.time.format.DateTimeFormatter; 

public class MenstrualApp { 

    public static void main(String[] args) { 
        Scanner input = new Scanner(System.in); 

        System.out.println("WELCOME TO OUR MENSTRUAL APP"); 

        System.out.println("Enter the day your period normally starts (dd/mm/yyyy):"); 
        String periodStart = input.nextLine(); 

        System.out.println("Enter the last day your period ends (dd/mm/yyyy):"); 
        String periodEnd = input.nextLine(); 

        System.out.println("How many days does your menstrual cycle length take?"); 
        int cycleLength = input.nextInt(); 

        LocalDate start = LocalDate.parse(periodStart, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
        LocalDate end = LocalDate.parse(periodEnd, DateTimeFormatter.ofPattern("dd/MM/yyyy")); 
        Period cyclePeriod = Period.between(start, end); 

        LocalDate nextMenstrualCycleStart = end.plusDays(cycleLength);
        LocalDate nextMenstrualCycleEnd = nextMenstrualCycleStart.plus(cyclePeriod); 
        int cycleDuration = Period.between(nextMenstrualCycleStart, nextMenstrualCycleEnd).getDays(); 

        int ovulationDay = cycleLength / 2; 

        System.out.println("Start of current cycle: " + start); 
        System.out.println("End of current cycle: " + end); 
        System.out.println("Length of current cycle: " + cyclePeriod.getDays() + " days"); 
        System.out.println("Start of next cycle: " + nextMenstrualCycleStart); 
        System.out.println("End of next cycle: " + nextMenstrualCycleEnd);
        System.out.println("Duration of next cycle: " + cycleDuration + " days");
        System.out.println("Ovulation day: " + ovulationDay); 
    }
}

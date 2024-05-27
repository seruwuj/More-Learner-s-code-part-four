import java.util.Scanner;

public class LeapYear{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a Year");
        int year =input.nextInt();

        //Check if Year is a leap year
        boolean isLeapyear=(year %4==0 && year %100 !=0)||(year%400==0);

        //Display Result
        System.out.println(year+" is a Leap Year? "+ isLeapyear);
     } 
    }
    

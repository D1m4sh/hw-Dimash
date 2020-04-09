import java.util.Scanner;

public class DateTest {
    public static void main(String[] args) {
        Date display=new Date(0,0,0);
        Scanner input=new Scanner(System.in);
        int day,month,year;

        System.out.print("Enter the month, day and year ");

        month = input.nextInt();
        display.setM(month);

        day = input.nextInt();
        display.setD(day);

        year = input.nextInt();
        display.setY(year);



        System.out.print("Enter a new year:");
        year = input.nextInt();
        display.setY(year);

        System.out.print("The Date object's state is: ");
        display.displayDate();

        System.out.print("Enter a new day:");
        day = input.nextInt();
        display.setD(day);

        System.out.print("The Date object's state is: ");
        display.displayDate();

        System.out.print("Enter a new month:");
        month = input.nextInt();
        display.setM(month);
        
        display.displayDate();
    }
}

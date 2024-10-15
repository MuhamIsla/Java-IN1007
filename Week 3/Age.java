import java.util.Scanner;

public class Age {
    public static void main (String[] args){
        Scanner readLine = new Scanner(System.in);
        System.out.println("Please enter your year of birth: ");
        int YOB = readLine.nextInt();
        System.out.println("Please enter the current year: ");
        int currentYear = readLine.nextInt();
        System.out.println("Your age is "+ (currentYear - YOB) +" if your birthday has already happened, otherwise you are " + (currentYear -YOB -1));
    }
}

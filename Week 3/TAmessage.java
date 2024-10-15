import java.util.Scanner;

public class TAmessage {
    public static void main (String[] args){
        Scanner readLine = new Scanner(System.in);
        System.out.println("Please enter the TA name: ");
        String TAName = readLine.nextLine();
        System.out.println("Please enter your name: ");
        String yourName = readLine.nextLine();
        System.out.println("Dear " + TAName + ",\n\nI enjoy your tutorials, they are awesome!\n\n"+yourName);
    }
}

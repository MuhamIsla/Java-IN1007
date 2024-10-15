import java.util.Scanner;

public class inOrder {
    public static void main (String[] args){
        Scanner readLine = new Scanner(System.in);
        int p,q,r;
        System.out.println("Please enter the first number: ");
        p = readLine.nextInt();
        System.out.println("Please enter the second number: ");
        q = readLine.nextInt();
        System.out.println("Please enter the third number: ");
        r = readLine.nextInt();
        if (p < q && q < r){
            System.out.println("True");
            }
        else{
            System.out.println("False");
            }
        }
    }

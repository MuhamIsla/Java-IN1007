import java.util.Scanner;

public class intPalindrome {
    public static void main (String[] args){
        Scanner readLine = new Scanner(System.in);
        int number;
        System.out.println("Please enter a number: ");
        number = readLine.nextInt();
        String temp = "" + number;
        String reversed = new StringBuilder(temp).reverse().toString();
        if (temp.equals(reversed)){
            System.out.println(number + " is a palindrome");
        }
        else{
            System.out.println(number + " is not a palindrome");
        }
        }
    }

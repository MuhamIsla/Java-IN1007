import java.util.Scanner;

public class stringPalindrome {
    public static void main (String[] args){
        Scanner readLine = new Scanner(System.in);
        String word, reversed;
        System.out.println("Please enter a word: ");
        word = readLine.next();
        reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is not a palindrome");
        }
        }
    }

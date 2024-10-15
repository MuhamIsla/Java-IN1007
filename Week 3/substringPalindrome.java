import java.util.Scanner;

public class Name {
    public static void main (String[] args){
        Scanner readLine = new Scanner(System.in);
        String word, reversed;
        System.out.println("Please enter a word: ");
        word = readLine.next();
        for (int i = 0;i == word.length();i++ ){
            for (int j = 0; j== word.length() -1; j++){
        }
            reversed = new StringBuilder(word).reverse().toString();
        if (word.equals(reversed)){
            System.out.println(word + " is a palindrome");
        }
        else{
            System.out.println(word + " is not a palindrome");
        }
    }
}

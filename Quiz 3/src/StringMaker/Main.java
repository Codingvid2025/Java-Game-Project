package StringMaker;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        System.out.println("Type a random integer");
        Scanner scan = new Scanner(System.in);

        String number = scan.nextLine();
        System.out.println("The size of your Array is: "+ number+" elements");
        int num = Integer.parseInt(number);
        stringArray largeString = new stringArray(num);
        largeString.initArray();
        largeString.printString();
    }
}

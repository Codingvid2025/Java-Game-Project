package StringMaker;
import java.util.Scanner;
public class stringArray {
    int n;
    public stringArray(int n){
        this.n = n;
    }
    String[] StringArr = new String[n];
    public void initArray(){
        Scanner string = new Scanner(System.in);
        String value = string.nextLine();
        for(int j=1; j <= n; j++){
            System.out.println("Type in value number "+j+1);
            System.out.println("The value is '"+ value+"'");
            StringArr[j] = value;
        }
    }
    public void printString(){
        int max_length=0;
        int max_index = 0;
        for(int i =0; i < n; i++){
            if(StringArr[i].length() > max_length){
                max_length = StringArr[i].length();
                max_index = i;
            }
        }
        System.out.println("The largest string is: ' "+StringArr[max_index]+"'");
    }


}
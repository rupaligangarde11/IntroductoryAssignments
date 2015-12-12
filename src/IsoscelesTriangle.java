import java.util.Scanner;

/**
 * Created by rupalig on 09/12/15.
 */
public class IsoscelesTriangle {
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);
        System.out.print("enter no. of lines: ");
        int noOfLines= scanner.nextInt();

        for(int i=1; i < noOfLines*2 ; i=i+2) {
            for(int k = 0 ;k < (4 - i / 2); k++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}



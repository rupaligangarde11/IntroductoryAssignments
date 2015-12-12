import java.util.Scanner;

/**
 * Created by rupalig on 09/12/15.
 */
public class PrintRightTriangle {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("enter no.of lines of triangle");
        int NoOfLines = sc.nextInt();

        for(int i=0; i<NoOfLines; i++){
            for(int j=0;j<=i;j++)
                System.out.print("*");
            System.out.println();
        }
    }
}

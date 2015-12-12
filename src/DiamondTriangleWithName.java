import java.util.Scanner;

/**
 * Created by rupalig on 12/12/15.
 */
public class DiamondTriangleWithName {
        public static void main(String args[]){
            Scanner scanner = new Scanner(System.in);
            System.out.print("enter no. of lines: (no has to be greater than 3)");
            int noOfLines= scanner.nextInt();

            for (int i = 1; i < noOfLines; i++)
            {
                for (int j = 0; j < (noOfLines - i); j++)
                    System.out.print(" ");
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                for (int k = 1; k < i; k++)
                    System.out.print("*");
                System.out.println();
            }
            System.out.println(" Bill");
            for (int i = noOfLines - 1; i >= 1; i--)
            {
                for (int j = 0; j < (noOfLines - i); j++)
                    System.out.print(" ");
                for (int j = 1; j <= i; j++)
                    System.out.print("*");
                for (int k = 1; k < i; k++)
                    System.out.print("*");
                System.out.println();
            }
        }
}

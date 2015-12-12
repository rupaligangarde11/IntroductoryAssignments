import java.util.Scanner;

/**
 * Created by rupalig on 09/12/15.
 */
public class printAsteriskN {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("no. of asterisk:");
        int noOfAsterisk = sc.nextInt();
        for(int i=0;i<noOfAsterisk;i++)
            System.out.print("*");
    }
}

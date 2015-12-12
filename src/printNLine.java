import java.util.Scanner;

/**
 * Created by rupalig on 09/12/15.
 */
public class printNLine {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.print("NO of Lines:");
        int noOFLines = sc.nextInt();
        for(int i=0;i<noOFLines ;i++)
            System.out.println("*");
    }
}

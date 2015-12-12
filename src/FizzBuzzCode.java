/**
 * Created by rupalig on 09/12/15.
 */
public class FizzBuzzCode {
     public void fizzBuzz() {
         for (int i = 1; i < 100; i++){
             if (i % 3 == 0 && i % 5 == 0 ) {
                 System.out.println("fizzbuzz");
                 continue;
             }
             if (i % 3 == 0) {
                 System.out.println("fizz");
                 continue;
             }
             if (i % 5 == 0) {
                 System.out.println("buzz");
                 continue;
             }
         System.out.println(i);
     }

    }
}

class FizzBuzzDemo{
    public static void main(String args[]){
        FizzBuzzCode fizzBuzzCode = new FizzBuzzCode();
        fizzBuzzCode.fizzBuzz();
    }
}
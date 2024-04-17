import java.util.Scanner;
public class Factorial {
    public static int getFactorial(int number){
        int f=1;
        if(number == 0 || number ==1){
            return f;
        }else{
            for(int i=number;i>1;i--){
                f = f*i;
            }
            return f;
        }
    }
    public static void main(String[] args){
          Scanner sc = new Scanner(System.in);
         // System.out.println(getFactorial(sc.nextInt()));
          int Coefficient = getFactorial(5)/(getFactorial(3)*getFactorial(2));
          System.out.println("Binomial Coefficient of (5, 3) ::"+Coefficient);
    }
}
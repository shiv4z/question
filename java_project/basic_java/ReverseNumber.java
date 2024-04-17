import java.util.Scanner;
public class ReverseNumber{
    public static int reverseNumber(int number){
        int rev = 0;
        int remainder = 0;
        
        while(number > 0){
            remainder = number % 10;
            rev = rev * 10 + remainder;
            number = number/10;
        }
       return rev;
    }

  
    public static void main(String[] rgsa){
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        System.out.println("Reverse Number :: "+reverseNumber(number));

    }
}
 import java.util.Scanner;
 class PrimeNumber{

    public static Boolean isPrime(Integer number){
        if(number == 2){
            return true;
        }else if(number < 2){
            return false;
        }
        for(int i=2;i<=Math.sqrt(number);i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

     public static void primeInRange(int number){
        for(int i=2;i<=number;i++){
            if(isPrime(i)){
                System.out.print(i + " ");
            }
        }
    }

    public static int binaryToDecimal(int binary){
        int d = 0;
        int  pow = 0;
        while(binary > 0){
            int r = binary % 10;
            d += r* Math.pow(2, pow); 
            binary = binary/10;
            pow++;
        }
        return d;
    }

    public static int decimalToBinary(int number){
        int binary = 0;
        int pow=0;
        while(number>0){
            int r = number % 2;
            binary += r*(int)Math.pow(10, pow) ;
            number = number/2;
            pow++;
        }
        return binary;
    }
    public static void main(String[] rgs){
       //System.out.println(isPrime(-8787));
       Scanner sc = new Scanner(System.in);
       //primeInRange(sc.nextInt());
     //  System.out.println(binaryToDecimal(sc.nextInt()));
     System.out.println(decimalToBinary(sc.nextInt()));
    }
}
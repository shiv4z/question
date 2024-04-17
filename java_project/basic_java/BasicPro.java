import java.util.Scanner;
 public class BasicPro{
//     public static void main(String[] args){
//           Scanner sc = new Scanner(System.in);
//           Float radius = sc.nextFloat();
//           Double area = 3.14 * radius * radius;
//           System.out.println("Area is:: "+area);
//     }

   public static Boolean isPrime(Integer number){
        if(number == 2){
            return true;
        }
        for(int i=2;i<Math.sqrt(number);i++){
            if(number % 2 == 0){
                return false;
            }
        }
        return true;


    }

    public static int sum(int number){
      return number*(number+1)/2;
    }
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int number = sc.nextInt();
      //System.out.println(isPrime(number));
      System.out.println(sum(number));

    }
}
import java.util.Scanner;
public class Pattern {

    public static void printPaattern1(int lines){
        for(int i=1;i<=lines;i++){
              for(int j=1;j<=i;j++){
                System.out.print("*");
              }
              System.out.println();
        }
        
    }

public static void reversePattern1(int lines){
    for(int i =lines ; i>0;i--){
        for(int j=1;j<=i;j++){
           System.out.print("*");
        }
        System.out.println();
    }
}

public static void alternatePattern1(int lines){
    for(int i=1;i<=lines;i++){
        for(int j=1;j<= lines-i+1;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void printsquarePattern(int lines){
    for(int i=1;i<=lines;i++){
        for(int j=1;j<=lines;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void halfPyramid(int lines){
    for(int i=1;i<=lines;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println();
    }
}


public static void halfPyramidAdv(int lines){
    int count = 1;
    for(int i=1;i<=lines;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}

public static void characterPattern(int lines){
    char ch ='A';
    for(int i=1;i<=lines;i++){
        for(int j =1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
public static void characterPatternAdv(int lines){
    for(int i=1;i<=lines;i++){
        char ch ='A';
        for(int j =1;j<=i;j++){
            System.out.print(ch);
            ch++;
        }
        System.out.println();
    }
}
public static void hollowPyramid(int row, int col){
    for(int i=1;i<=row;i++){
        for(int j=1;j<=col;j++){
            if(i==1 || i==row || j==1 || j==col){
                System.out.print("*");
            }else{
                System.out.print(" ");
            }

        }
        System.out.println();
    }
}


public static void diamond(int row){
   for(int i=1;i<=row;i++){
     for(int j=1;j<=row-i;j++){
        System.out.print(" ");
     }
     for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
     }
    System.out.println();
   }
    for(int i=row;i>=1;i--){
     for(int j=1;j<=row-i;j++){
        System.out.print(" ");
     }
     for(int j=1;j<=2*i-1;j++){
        System.out.print("*");
     }
    System.out.println();
   }
}

public static void halfInvertedPyrammid(int row){
     for(int i=1;i<= row;i++){
        for(int j=1;j<=row-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
     }
}

public static void invertedNumberPyramid(int rows){
  
     for(int i=1;i<=rows;i++){
          int count=1;
        for(int j=i;j<=rows;j++){
            System.out.print(count);
            count++;
        }
        System.out.println();
     }
}

public static void floydTrangle(int rows){
    int count = 1;
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print(count+" ");
            count++;
        }
        System.out.println();
    }
}

public static void zeroOneTrangle(int rows){
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            if((i+j)% 2 == 0){
                System.out.print("1");
            }else{
                System.out.print("0");
            }
        }
        System.out.println();
    }
}

public static void butterfly(int rows){
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(rows-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }

     for(int i=rows;i>=1;i--){
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        for(int j=1;j<=2*(rows-i);j++){
            System.out.print(" ");
        }
        for(int j=1;j<=i;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void solidRhombus(int rows){
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }
        for(int j=1;j<=rows;j++){
            System.out.print("*");
        }
        System.out.println();
    }
}

public static void numberPattern(int rows){
  for(int i=1;i<=rows;i++){
    for(int j=i;j<=rows-1;j++){
        System.out.print(" ");
    }
    for(int j=1;j<=i;j++){
        System.out.print(i+" ");
    }
    System.out.println();
  }
}

public static void numberPattern1(int rows){
    for(int i=1;i<=rows;i++){
        for(int j=1;j<=rows-i;j++){
            System.out.print(" ");
        }

        for(int j=i;j>=1;j--){
           System.out.print(j);
        }   

        for(int j=2;j<=i;j++){
            System.out.print(j);
        } 
        System.out.println();
        }
}
    public static void main(String[] args){
    
       Scanner sc = new Scanner(System.in);
     // printPaattern1(sc.nextInt());
     //reversePattern1(sc.nextInt());
     //alternatePattern1(sc.nextInt());
    //  printsquarePattern(sc.nextInt());
    //  halfPyramid(sc.nextInt());
   // halfPyramidAdv(sc.nextInt());
  // characterPatternAdv(sc.nextInt());
  //hollowPyramid(sc.nextInt(), sc.nextInt());
 // diamond(sc.nextInt());
 //halfInvertedPyrammid(sc.nextInt());
  //invertedNumberPyramid(sc.nextInt());
 // floydTrangle(sc.nextInt());
 //zeroOneTrangle(sc.nextInt());
   //butterfly(sc.nextInt());
   //solidRhombus(sc.nextInt());
   //numberPattern(sc.nextInt());
   numberPattern1(sc.nextInt());
    } 
}
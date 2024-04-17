import java.util.*;
public class Sorting {
    public static int largest(int[] array){
        int largest = Integer.MIN_VALUE;
        int smallest = Integer.MAX_VALUE;
        for(int i=0;i<array.length;i++){
            if(array[i]>largest){
                largest = array[i];
            }
            if(array[i]<smallest){
                smallest = array[i];
            }
        }
        System.out.println("Smallest :: "+smallest);
        return largest;
    }
    

    public static int linearSearch(int[] array, int key){
        for(int i=0;i<array.length;i++){
            if(array[i]==key){
                return i;
            }
        }
        return -1;
    }

    public static int binarySearch(int[] array, int key){
        int start = 0;
        int end = array.length-1;
        while (start <= end){
            int mid = (start+end)/2;
            if(array[mid] == key){
                return mid;
            }else if(array[mid] < key){
                start = mid+1;
            }else{
                end = mid-1;
            }
        }
        return -1;
    }

    public static void reverse(int[] array){
       int temp = 0;
       int start = 0, end = array.length-1;
       while(start < end){
        temp = array[start];
        array[start] = array[end];
        array[end]=temp;
        start++;
        end--;
       }

    }

    public static void countSort(int[] array){
        int largest = Integer.MIN_VALUE;
        for(int i=0;i<array.length;i++){
            largest = Math.max(largest , array[i]);
        }

        int[] count = new int[largest+1];
        for(int i=0;i<array.length;i++){
            count[array[i]]++; 
        }
         int j=0;
        for(int i=0;i<count.length;i++){
           while(count[i]>0){
            array[j]=i;
            j++;
            count[i]--;

           }
        }
    }

    public static void bubbleSort(int[] array){
       for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] < array[j+1]){
                    int temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
       }
    }
    
    public static void selectionalSort(int[] array){
        for(int i=0;i<array.length;i++){
            int minPos = i;
            for(int j=i+1;j<array.length;j++){
                if(array[minPos] > array[j]){
                    minPos = j;
                }
            }
            int temp = array[i];
            array[i] = array[minPos];
            array[minPos] = temp;
        }
       
    }

    public static void insertionSort(int[] array){
        for(int i=1; i<array.length;i++){
            int curr = array[i];
            int prev = i-1;
            while( prev >= 0 && array[prev] > curr){
                array[prev+1] = array[prev];
                prev--;
            } 
            array[prev+1] = curr;
        }
    } 

    public static void countingSort(int[] array){
      int largest = Integer.MIN_VALUE;
      for(int i=0;i<array.length;i++){
        largest = Math.max(largest, array[i]);
      }

      int[] count = new int[largest+1];
      for(int i=0;i<array.length;i++){
        count[array[i]]++;
      }
      int j = 0;
      for(int i=0;i<count.length;i++){
        int maxCount = count[i];
        if(maxCount > 0){
           array[j] = i ;
           j++;
           maxCount--;
        }
      }
    }
 
    public static void main(String[] args){
       // int[] array = {4,5,1,3,2,1,5,3,2,1,1};
        int key = 4;
      //  System.out.println(linearSearch(array, key));
     // System.out.println("Largest is :: "+largest(array));
    // System.out.println(binarySearch(array, key));
   // reverse(array);
 //  countSort(array);
 int[] array = {5,4,1,3,2};
 //bubbleSort(array);
 //selectionalSort(array);
 //insertionSort(array);
 countingSort(array);
    for( int a : array){
        System.out.print(a+" ");
    }

    } 
}
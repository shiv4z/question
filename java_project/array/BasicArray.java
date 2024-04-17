public class BasicArray {
    public static void subArray(int[] arr){
        int ts = 0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                System.out.print("("+arr[i] +","+ arr[j]+")");
                ts++;
            }
            System.out.println();
        }
        System.out.println("Total sub-array :: "+ts);
    }


    public static void main(String[] args){
        int[] ar = {1,3,4,5,7,5,8};
        subArray(ar);

    }
}
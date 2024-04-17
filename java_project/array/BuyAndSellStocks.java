import java.util.*;
public class BuyAndSellStocks {
    public static void calculateProfit(int[] array){
        int buyingPrice = Integer.MAX_VALUE;
        int maxProfit = Integer.MIN_VALUE;

        for(int i=0;i<array.length;i++){
            if(buyingPrice < array[i]){
                maxProfit = Math.max(maxProfit, array[i]-buyingPrice);
            }

            if(buyingPrice > array[i]){
                buyingPrice = array[i];
            }
        }
        System.out.println("Max Profit is ::"+maxProfit);
    }

    public static void main(String[] args){
        int[] stockPrice = {7,1,5,3,6,4};
        calculateProfit(stockPrice);
    }
}
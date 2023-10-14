import java.util.Scanner;

public class buyAndSellStock {
public static int buyAndSellStock(int price[]) {
    int buyPrice=Integer.MAX_VALUE;
    int maxProfit=0;
    for(int i=0;i<price.length;i++){
        if(buyPrice<price[i]){
            int profit=price[i]-buyPrice;
            maxProfit=Math.max(maxProfit, profit);
        }
        else{
            buyPrice=price[i];
        }
    }
    return maxProfit;
}
  public static void main(String args []) { 
  Scanner sc =new Scanner(System.in);
  int price[]=new int[6];
  System.out.println("Enter the prices: ");
  for(int i=0;i<6;i++){
      price[i]=sc.nextInt();
    }
    System.out.println("The max profit is:  "+buyAndSellStock(price));

}
}

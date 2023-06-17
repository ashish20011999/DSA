public class StockSelling {
    public static void main(String args[])
    {
        int[] cost = {7,1,5,3,6,4};
        System.out.println(maxProfit(cost));
    }
    public static int maxProfit(int[] cost)
    {
       int tempMin = Integer.MAX_VALUE;
       int maxProfit = Integer.MIN_VALUE;
       for(int i = 0;i<cost.length;i++)
       {
           if(tempMin>cost[i]){
               tempMin = cost[i];
           }
           if(maxProfit<(cost[i]-tempMin)) {
               maxProfit=cost[i]-tempMin;
       }
       }
        return maxProfit;
    }
}

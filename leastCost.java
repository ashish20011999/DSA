public class leastCost {
    public static void main(String args[]) {
        int stations = 5;
        int start = 4;
        int finish = 3;
        int[] cost = {12,6,2,6,2};
        System.out.println(calculateLeastCost(stations,start,finish,cost));
    }
    public static long calculateLeastCost(int stations, int start, int finish, int[] cost) {
        long costClockwise =0;
        long costAnticlockwise=0;
        start--;
        finish--;
        for(int i = start;i!=finish;i=(i+1)%stations)
        {
            costClockwise += cost[i];
        }
        for(int i = finish;i!=start;i=(i+1)%stations)
        {
            costAnticlockwise += cost[i];
        }
        return Math.min(costClockwise,costAnticlockwise);
    }
}

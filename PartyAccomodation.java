import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class PartyAccomodation {
    public static void main(String args[])
    {
        int capacity = 4;
        int groups = 2;
        int[][] groupDetails = {{2,1,5},{4,3,7},{1,6,7}};
        System.out.println(solution(groups,capacity,groupDetails));
    }
    static String solution(int N, int C, int[][] audience){
        Map<Long,Long> timeAndPeopleCountMap = new HashMap<>();
        for (int i = 0; i <N; i++) {
            for (long j = audience[i][1]; j <= audience[i][2]; j++) {
                timeAndPeopleCountMap.putIfAbsent(j, Long.valueOf(0));
                if (timeAndPeopleCountMap.get(j) != null) {
                    timeAndPeopleCountMap.put(j, timeAndPeopleCountMap.get(j) + audience[i][0]);
                }
                if(timeAndPeopleCountMap.get(j)>C)
                {
                    return "No";
                }
            }
        }
        return "Yes";
    }

}

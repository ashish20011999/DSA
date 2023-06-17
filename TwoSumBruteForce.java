import java.util.Arrays;

public class TwoSumBruteForce {
        public static void main(String[] args) {
            int[] numbers = {1, 2, 3, 4, 5};
            int target = 9;
            int[] result = returnOutput(numbers,target);
            System.out.println(Arrays.toString(result));
        }
        public static int[] returnOutput(int[] numbers, int target)
        {
            for(int i = 0;i< numbers.length;i++)
            {
                for(int j =i+1;j< numbers.length;j++)
                {
                    if(numbers[i]+numbers[j]==target)
                    {
                        return new int[] {numbers[i],numbers[j]} ;
                    }
                }
            }
            return new int[] {};
        }
    }


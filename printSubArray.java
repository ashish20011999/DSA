public class printSubArray {
    public static void main(String args[])
    {

        int[] arr = {5,10,11,9,5};
        PrintAllSubArrays(arr,0,0);
    }
    public static void PrintAllSubArrays(int[] arr, int start, int end)
    {
        if(end==arr.length)
        {
            return;
        }
        else if(start>end)
        {
            PrintAllSubArrays(arr,0,end+1);
        }
        else{
            System.out.print("[");
            for(int i=start;i<=end;i++)
            {
                if(i==end)
                    System.out.print(arr[i]);
                else
                    System.out.print(arr[i]+",");
            }
            System.out.println("]");
            PrintAllSubArrays(arr,start+1,end);
        }

//        if (end == arr.length)
//            return;
//            // Increment the end point and start from 0
//        else if (start > end)
//            PrintAllSubArrays(arr, 0, end + 1);
//            // Print the subarray and increment the starting
//            // point
//        else {
//            System.out.print("[");
//            for (int i = start; i < end; i++)
//                System.out.print(arr[i] + ", ");
//            System.out.println(arr[end] + "]");
//            PrintAllSubArrays(arr, start + 1, end);
//        }
//        return;

    }
}

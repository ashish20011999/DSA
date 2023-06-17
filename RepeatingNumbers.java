import java.util.Arrays;

public interface RepeatingNumbers {
    public static void main(String args[])
    {
        int[] arr ={0,4,3,2,7,8,2,3,1};
        int n =arr.length;
        for(int i=0;i<arr.length;i++)
        {
            arr[arr[i]%n]=arr[arr[i]%n]+n;
        }
        System.out.println(Arrays.toString(arr));
        for(int i=0;i<n;i++)
        {
            if(arr[i]>=2*n)
            System.out.println(i);
        }
    }
}

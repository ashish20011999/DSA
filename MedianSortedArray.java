import java.util.Arrays;

public class MedianSortedArray {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
        int length2= nums2.length;
        int[] arr = new int[length1+length2];
        double result = 0;
        mergeArray(arr,nums1,nums2);
        System.out.println(Arrays.toString(arr));
        if(arr.length%2==0)
        {
            double m1= arr[arr.length/2];
            double m2= arr[arr.length/2-1];
            result = (m1+m2)/2;

        }
        else
        {
            result = arr[arr.length/2];
        }
        System.out.println(result);
        return result;
    }
    public static void mergeArray(int [] arr,int [] arr1, int[] arr2)
    {
        int length1 = arr1.length;
        int length2= arr2.length;
        int[] num1 = new int[length1+1];
        int[] num2 = new int[length2+1];
        for(int i=0;i<length1;i++)
        {
            num1[i]=arr1[i];
        }
        num1[length1] = Integer.MAX_VALUE;
        for(int i=0;i<length2;i++)
        {
            num2[i]=arr2[i];
        }
        num2[length2] = Integer.MAX_VALUE;
        int j=0;
        int k=0;
        int z =0;
        while(j<length1&&k<length2)
        {
            if(num1[j]>num2[k])
            {
                arr[z]=num2[k];
                k++;
            }
            else
            {   arr[z]=num1[j];
                j++;
            }
            z++;
        }
        while(j<length1)
        {
            arr[z]=num1[j];
            j++;
            z++;
        }
        while(k<length2)
        {
            arr[z]=num2[k];
            k++;
            z++;
        }
    }
    public static void main(String args[])
    {
        int[] nums1 = {};
        int[] nums2 = {3,4};
        System.out.println(findMedianSortedArrays(nums1,nums2));
    }
}

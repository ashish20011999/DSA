import java.util.Arrays;

public class SortingArray {
    public static void QuickSort(int[] arr)
    {

    }
    public static void SelectionSort(int[] arr){
     int n= arr.length;
     for(int i=0;i<n;i++)
     {
         int index=i;
         for(int j=i+1;j<n;j++)
         {
             if(arr[index]>arr[j])
             {
                 index = j;
             }
         }
         int temp = arr[i];
         arr[i]=arr[index];
         arr[index] =temp;
     }
    }
    public static void BubbleSort(int[] arr){
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            for(int j=i+1;j<n-i;j++)
            {
                if(arr[i]>arr[j])
                {
                    int temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
    }
    public static void InsertionSort(int[] arr){
    int n = arr.length;
    for(int i=1;i<n;i++)
    {
        int key =arr[i];
        int j=i-1;
        while(j>=0&&arr[j]>key)
        {
            arr[j+1]=arr[j];
            j--;
        }
        arr[j+1]=key;
    }
    }
    public static void MergeSort(int[] arr,int l,int r)
    {
        if(l<r)
        {
            int m=l+(r-l)/2;
            MergeSort(arr, l, m);
            MergeSort(arr, m + 1, r);
            mergeArray(arr,l,r,m);
        }
    }
    public static void mergeArray(int[] arr,int l,int r,int m) {
//        int length1 = m-l+1;
//        int length2 = r-m;
//        int[] num1 = new int[length1 + 1];
//        int[] num2 = new int[length2 + 1];
//        for (int i = 0; i < length1; i++) {
//            num1[i] = arr[l+i];
//        }
//        num1[length1] = Integer.MAX_VALUE;
//        for (int i = 0; i < length2; i++) {
//            num2[i] = arr2[m+i];
//        }
//        num2[length2] = Integer.MAX_VALUE;
//        int j = 0;
//        int k = 0;
//        int z = 0;
//        while (j < length1 && k < length2) {
//            if (num1[j] > num2[k]) {
//                arr[z] = num2[k];
//                k++;
//            } else {
//                arr[z] = num1[j];
//                j++;
//            }
//            z++;
//        }
//        while (j < length1) {
//            arr[z] = num1[j];
//            j++;
//            z++;
//        }
//        while (k < length2) {
//            arr[z] = num2[k];
//            k++;
//            z++;
//        }
    }
    public static void main(String args[])
    {
        int[] arr = {2,1,6,7,8,9};
        System.out.println(Arrays.toString(arr));
        QuickSort(arr);
//        BubbleSort(arr);
//        InsertionSort(arr);
//        MergeSort(arr,0,arr.length-1);
//        SelectionSort(arr);
        System.out.println(Arrays.toString(arr));
    }
}

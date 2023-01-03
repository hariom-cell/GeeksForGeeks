package kthsmallest;
import java.util.Arrays;

public class KthSmallest {
    public static void main(String[] args) {
        int[] arr={1,2,5,8,9,10,11,12,13,14,16,17,19,22,23,24,26,28,31,33,34,36,37,38,39,40,42,43,44,46,47,48,49,50,54,55,59,60,62,63,64,65,66,68,69,70,71,72,73,75,77,79,80,82,86,87,88,92,93,94,96,97,98,99,100};
        // int[] arr= {1,2,3,4};
        Kth kth = new Kth();
        kth.kthSmallest(arr,65,0,0);
    }
}


class Kth{
    public static int kthSmallest(int[] arr, int l, int r, int k)
    {

        Arrays.sort(arr);
        return arr[k-1];
    }
}
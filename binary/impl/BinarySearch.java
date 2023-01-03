package binary.impl;

import java.util.Arrays;
import java.util.stream.Collectors;

public class BinarySearch {
    public static void main(String[] args) {

        int[] arr={1,2,5,8,9,10,11,12,13,14,16,17,19,22,23,24,26,28,31,33,34,36,37,38,39,40,42,43,44,46,47,48,49,50,54,55,59,60,62,63,64,65,66,68,69,70,71,72,73,75,77,79,80,82,86,87,88,92,93,94,96,97,98,99,100};
       // int[] arr= {1,2,3,4};
        BinarySearchImplements binarySearchImplements = new BinarySearchImplements();
        System.out.println(binarySearchImplements.getIndex(arr,65,15));

    }
}

class BinarySearchImplements {
    public BinarySearchImplements() {

    }

    Integer getIndex(int[] arr, int n, int k) {
        return this.binarySearch(arr, k, 0, n - 1);
    }

    private int binarySearch(int[] arr, int searchKey, int left, int right) {

        if(left<=right)
        {
            int middleItem = left + (right-left) / 2;
            if (arr[middleItem] == searchKey) {
                return middleItem;
            }
            if (arr[middleItem] > searchKey)
                return binarySearch(arr, searchKey, left, middleItem-1);
            else
                return binarySearch(arr, searchKey, middleItem+1, right);

        }else {
            return -1;
        }



    }
}


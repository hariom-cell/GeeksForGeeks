package continousbigarray;

import java.util.ArrayList;
import java.util.Collections;

public class ContinuousBigArray {

    public static void main(String[] args) {
    int arr[]={16,17,4,3,5,2};
        System.out.println(leaders(arr,6));
    }
    static ArrayList<Integer> leaders(int arr[], int n){
        ArrayList leaderList=new ArrayList<>();
        int biggest=arr[n-1];
        for (int i=n-1;i>=0;i--)
        {
            if(arr[i]>=biggest) {
                leaderList.add(arr[i]);
                biggest=arr[i];
            }
        }
        Collections.reverse(leaderList);
        return leaderList;
    }

}

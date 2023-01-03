package minjumps;
public class MinJumps {
    public static void main(String[] args) {

        int[] arr={2, 3 ,1 ,1 ,2 ,4 ,2 ,0 ,1,1};
        System.out.println(minJumps(arr));
    }
    static int minJumps(int[] arr){
        int length = arr.length-1;
        int jump=0;
        for (int i = 0;;)
        {
            if(arr[i] == 0)
            {
                return -1;
            }
            if(i+arr[i] >= length)
            {
                return jump;
            }
            jump++;
            i=i+arr[i];
        }
    }
}

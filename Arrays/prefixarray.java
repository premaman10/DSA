// this is prefix array method to find maximum sum from subarray it has O(n^2) time complexity.

public class prefixarray {
    public static void prefixsum(int num[]){
        int currsum=0;
        int maxsum = Integer.MIN_VALUE;
        int sum[] = new int[num.length];
        sum[0]= num[0];
        for(int i=1;i<sum.length;i++){
            sum[i]= sum[i-1]+num[i];
        }
        for(int i=0;i<num.length;i++){
            int start = i;
            for(int j =i;j<num.length;j++){
                    int end = j;
                    if(start ==0){
                        currsum = sum[end];
                    }
                    else{
                        currsum = sum[end]- sum[start-1];
                    }
                    //checking for max sum
                    if(maxsum<currsum){
                        maxsum = currsum;
                    }
            }
        }
        System.out.println("MAximum sum of subarrays from this array:-"+maxsum);
    }
public static void main(String[] args) {
    int num[]={1,2,3,4,5};
    prefixsum(num);
}
}

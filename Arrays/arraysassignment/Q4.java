//Given n non-negative integers representing an elevation map 
//where the width of each bar is 1, 
//compute how much water it can trap after raining.

package arraysassignment;

public class Q4 {
    public static int trap(int height[]){
        int n = height.length;
        int leftm[]= new int[n];
        int rightm[]= new int [n];
        leftm[0]= height[0];
        for(int i=1;i<n;i++){
            leftm[i]=Math.max(height[i],leftm[i-1]);
        }
        rightm[n-1]= height[n-1];
        for(int i = n-2;i>=0;i--){
            rightm[i]= Math.max(height[i],rightm[i+1]);
        }
        int trapwater =0;
        for(int i=0;i<n;i++){
            int waterl = Math.min(leftm[i],rightm[i]);
            trapwater += waterl-height[i];
        }
        return trapwater;
    }
    public static void main(String args[]){
        int height[]={0,1,0,2,1,0,1,3,2,1,2,1};
        System.out.println("Amount of rain water they can hold is:-"+trap(height));
    }
}

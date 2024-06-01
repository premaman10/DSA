public class rainwaetertrapping {
    public static int trappedrainwater(int height[]){
        int n = height.length;
            //calculating left max boundary
            int leftmax[] = new int[n];
            leftmax[0]=height[0];
            for(int i=1;i<n;i++){
                leftmax[i]=Math.max(height[i], leftmax[i-1]);
            }
            //calculate right max boundary
            int rightmax[] = new int[n];
            rightmax[n-1]=height[n-1];
            for(int i=n-2;i>=0;i--){
                rightmax[i]= Math.max(height[i],rightmax[i+1]);
            }
            //trappedwater is currently 0
            int trappedwater = 0;
            for(int i=0;i<n;i++){
                //to find water level and amount trapped water
                int waterlevel = Math.min(leftmax[i],rightmax[i]);
                trappedwater += waterlevel-height[i];
            }
            return trappedwater;
    }
   public static void main(String[] args) {
    int height[]={4,2,0,6,3,2,5};
    System.out.println("Amount of trapped water by these heights buildings:-"+trappedrainwater(height));
   } 
}

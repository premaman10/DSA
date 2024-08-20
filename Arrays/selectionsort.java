public class selectionsort {
    public static void select(int arr[]){
         for(int i =0;i<arr.length-1;i++){
            int midpos = i;
            for(int j = i+1;j<arr.length-1;j++){
                if(arr[midpos]>arr[j]){
                    
                    midpos =j;
                }
            }
            int temp = arr[midpos];
            arr[midpos]=arr[i];
            arr[i]=temp;
         }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={34,67,87,98,67,56,35,86,98,2,5,687,975,6875}; 
        select(arr);
        print(arr);
    }
}

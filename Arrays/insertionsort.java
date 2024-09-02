public class insertionsort {
    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int prev = i-1;
            int curr = arr[i];
            while(prev>=0 && arr[prev]> curr){
                arr[prev+1] = arr[prev];
                prev--;
            }
            arr[prev+1 ]= curr;
        }
    }
    public static void printarr(int arr[]){
        for( int i=0;i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }
    public static void main(String[] args) {
        int[] arr = {78,87,76,5,45};
        insertion(arr);
        printarr(arr);
    }
}

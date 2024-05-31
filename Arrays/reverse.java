public class reverse {
    public static void re(int arr[]){
        int first = 0;
        int last = arr.length-1;
        while(first<last){
            int temp = arr[last];
            arr[last]=arr[first];
            arr[first]=temp;
            first++;
            last--;
        }
    }
    public static void main(String[] args) {
        int arr[]={54,78,89,67,56,78,65,74};
        re(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}

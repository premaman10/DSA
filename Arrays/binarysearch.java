import java.util.Scanner;
public class binarysearch{
    public static int search(int arr[],int key){
           int start = 0;
           int end = arr.length-1;
          
           while (start<=end) {
            int mid =((start+end)/2);
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                end = mid-1;
            }
            else {
                start = mid+1;
            }
           }
           return -1;

    }
    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6,7,8,9};
        int key;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number which you wnat to find: ");
        key=sc.nextInt();
        System.out.println("Index of the element you have searched for "+search(arr, key));
    }
}
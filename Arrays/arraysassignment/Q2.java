//Given the array nums after the possible rotation and
// an integer target, returnthe index oftarget if it is in nums, 
//or -1   if it is not in nums.
//You must write an algorithm with O(log n) runtime complexity.
package arraysassignment;
import java.util.Scanner;
public class Q2 {
    public static int fun(int arr[],int key){
        int n = arr.length;
        int mid,s,e;
         s = arr[0];
         e = arr[n-1];
         mid = (s+e)/2;
         while(s<=e){
            if(key==arr[mid]){
                return mid;
            }
            else if(key>arr[mid]){
                s = mid+1;
            }
            else{
                e = mid-1;
            }
         }
         return -1;

    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the size of an aaray:-");
        int size = sc.nextInt();
        int key;
        int arr[]= new int[size];
        System.out.print("Enter elements:-");
        for(int i=1;i<size;i++){
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the number which you wnat to find:-");
         key = sc.nextInt();
         fun(arr, key);
    }
}

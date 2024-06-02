//Given an integer array nums, return true 
//if any value appears at least twice in the array,
//and return false if every element is distinct.

package arraysassignment;
import java.util.Scanner;
public class Q1 {
    public static boolean checker(int arr[]){
        boolean found = false;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    found = true;
                }
            }
        }
        return found;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enetr the size of an array:-");
        int size = sc.nextInt();
        int arr[] = new int [size];
        for(int i=0;i<size;i++){
             arr[i]= sc.nextInt();
        }
        System.out.println("Status of similar numbers:-" +checker(arr));
    }
}

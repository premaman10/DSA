import java.util.Scanner;

public class linearsearch {
public static void main(String args[]){
    int a[]={1,2,3,907986,4,5,6,989,7,8,9,10};
    int key;
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the number which you want to find:");
    key = sc.nextInt();
    for(int i=0;i<a.length;i++){
        if(a[i]==key){
            System.out.println(key+" found at "+i);
        }
    }
}
}

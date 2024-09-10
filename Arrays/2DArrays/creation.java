import java.util.Scanner;

public class creation {
    
    public static boolean Search(int matrix[][],int key){
        key = 7;
        for(int i =0;i<matrix.length;i++){
            for(int j = 0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("key found at ("+i+" "+j+" "+")");
                    return true;
                }
            }
        }
        return false;
    }
@SuppressWarnings("static-access")
public static void main(String[] args) {
    int matrix[][]= new int [3][3] ;
    Scanner sc = new Scanner(System.in);
    int n = matrix.length;
    int m = matrix[0].length;
    //Enetering values
    for(int i =0;i<n;i++){
        for(int j = 0;j<m;j++){
            matrix[i][j] = sc.nextInt();
        }
    }

    //To Show the 2D array
    for(int i =0;i<n;i++){
        for(int j = 0;j<m;j++){
            System.out.print(matrix[i][j]+" ");
        }
        System.out.println();
    }
    Search(matrix,7);
}
}

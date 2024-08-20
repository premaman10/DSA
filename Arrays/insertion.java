public class insertion {
    public static void insert(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int cur = arr[i];
            int pre = i-1;
            while (pre>=0 && arr[pre]>cur) {{
                arr[pre+1]=arr[pre];
                pre--;
            }
            arr[pre+1]=arr[cur];
                
            }
        }
    }
    public static void print(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={67,56,87,90,97,87,67,56,3,4,23,4,5,78,97,67};
        insert(arr);
        print(arr);
    }
}

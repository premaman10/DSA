public class removevowel {
    public static void main(String[] args) {
       String str123 = "Hii myself Prem Aman";
       StringBuilder str = new StringBuilder();
        for(int i =0;i<str123.length();i++){
            if(str123.charAt(i)=='a' || str123.charAt(i)=='A'||str123.charAt(i) =='e'||str123.charAt(i)=='E' 
            || str123.charAt(i)=='i'||str123.charAt(i) =='I'||str123.charAt(i)=='o' ||
             str123.charAt(i)=='O'||str123.charAt(i) =='u'||str123.charAt(i)=='U'){
                continue;
            }
            else{
                str.append(str123);
            }
        }
        System.out.println(str);
    }
}

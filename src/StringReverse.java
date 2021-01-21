public class StringReverse {
    public static void main(String[] args) {
//        字符串分割后反转
        String a="I am a student";
        System.out.println(a.trim().split("\\s+"));
     String arr[]=a.trim().split("\\s+");
     for(String test:arr){
         System.out.println(test);
     }
     for (int i=arr.length-1;i>=0;i--){
         System.out.print(arr[i]+" ");
     }

//     字符顺序反转
        StringBuffer b=new StringBuffer("I am a teacher");
        System.out.println(b.reverse());


    }
}

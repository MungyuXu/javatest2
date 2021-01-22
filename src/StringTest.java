
public class StringTest {

    @Override
    public String toString() {
        return "888";
//        return super.toString()+"888";
    }
    public  static  class  Test{
        @Override
        public String toString() {
            return "22222";
        }
    }

//    public static String toString (String a){
//        String b=a+"888";
//        return b;
//    }

    public static void main(String[] args) {
        String a="sadwae";
        System.out.println(a.toString());
        Test test=new Test();
        System.out.println(test.toString());
    }
}

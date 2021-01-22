import java.util.HashMap;

public class HashMapTest {
    public static void main(String[] args) {
        HashMap hashMap=new HashMap();
        hashMap.put(1,"A");
        hashMap.put(2,"B");
        HashMap hashMap1 = (HashMap) hashMap.clone();
        hashMap.keySet();
        System.out.println(hashMap1.get(2));
        System.out.println(hashMap1);
    }
}

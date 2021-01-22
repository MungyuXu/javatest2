import java.util.ArrayList;
import java.util.Iterator;

public class ListTest {
    public static void main(String[] args) {
        ArrayList<String> arrayList=new ArrayList<>();
        arrayList.add("1");
        arrayList.add("6");
        arrayList.add("a");
        arrayList.add("1");
//        System.out.println(arrayList.lastIndexOf("1"));

        Iterator<String> it= arrayList.iterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }


    }
}

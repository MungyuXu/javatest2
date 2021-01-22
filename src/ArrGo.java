//给定一个数组，不用循环的方法，遍历这个数组。

import javax.xml.transform.Source;
import java.util.Arrays;
import java.util.List;

public class  ArrGo{
public static void main(String[]args) {
    int a[] = {1, 2, 3, 6, 5, 4,};
    System.out.println(Arrays.toString(a));

//    List<Integer> list= Arrays.asList(a);
//    System.out.println(list.size());
//
//    Integer[] c=new Integer[list.size()];
//    list.toArray(c);
//    System.out.println(c.length);
    int i = 0;
    if (i<a.length){
        i++;
        System.out.println(a[i]);
    }
}
}

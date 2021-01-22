import java.sql.SQLOutput;
import java.util.Stack;

public class StackTest {
    public static void main(String[] args) {
        Stack<Integer> stack=new Stack<Integer>();
        stack.addElement(1);
        stack.addElement(2);
        stack.addElement(3);
        stack.push(4);
//        stack.addElement(2);
        System.out.println(stack);
////        System.out.println(stack.pop());
//        System.out.println(stack.search(1));
//        System.out.println(stack.search(2));
//        System.out.println(stack.search(3));
//        System.out.println(stack.elementAt(1));
    }


}

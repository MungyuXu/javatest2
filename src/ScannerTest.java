import java.util.ArrayList;
import java.util.Scanner;

public class ScannerTest {

    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        ArrayList arrayList=new ArrayList();
        String b [];

        for (int i=0;i<3;i++){
            if (scanner.hasNext()){
                String a=scanner.next();
                System.out.println(a);
                arrayList.add(a);
                System.out.println(arrayList);
            }

        }

//        scanner.close();
    }
}

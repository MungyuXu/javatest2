public class Sort
{
    public static void main(String[] args) {
    int a[]={3,15,9,8,66,7,13,15};
////        冒泡排序
//    for (int i=0;i<a.length-1;i++){
//        for (int j=0;j<a.length-1-i;j++){
//            if (a[j]<a[j+1]){
//                int x=a[j];
//                a[j]=a[j+1];
//                a[j+1]=x;
//            }
//        }
//    }

//        选择排序
        int l=a.length;
        int minIndex,temp;
        for(int i=0;i<l-1;i++){
            minIndex=i;
            for (int j=i+1;j<l;j++){
                if (a[j]<a[minIndex]) {
               minIndex=j;
                }
            }
            temp=a[i];
            a[i]=a[minIndex];
            a[minIndex]=temp;
        }
    for (int b:a){
        System.out.println(b);
    }
    }
}

import java.security.Key;

public class BinarySearch {
    public static void main(String[] args) {
        int a[]={1,6,9,11,30,60};
        System.out.println(commonBinarySearch(a,11));
    }

//    递归实现
    public  static  int recursionBinarySearch(int a [],int k,int low,int high){
        if (k<a[low]|| k>a[high]||low >high){
            return -1;
        }
        int middle=(low+high)/2;
        if (a[middle]>k){
            return recursionBinarySearch(a,k,low,middle-1);
        }else if (a[middle]<k){
            return recursionBinarySearch(a,k,middle+1,high);
        }else{
            return middle;
        }
    }

//    不使用递归,while循环实现
    public static int commonBinarySearch(int a[],int k){
        int low=0;
        int high=a.length-1;
        int middle=0;
        if (k<a[low]||k>a[high]||low>high){
            return -1;
        }
        while (low<=high){
            middle=(low+high)/2;
            if (a[middle]>k){
                high=middle-1;
            }else if (a[middle]<k){
                low=middle+1;
            }else{
                return middle;
            }
        }
//        最后仍然没找到,返回-1
        return -1;
    }
}

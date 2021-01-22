//https://www.cnblogs.com/onepixel/articles/7674659.html#commentform

public class Sort
{
    public static void main(String[] args) {
    int a[]={3,15,9,8,66,7,13,15};
//        冒泡排序,一次比较两个元素，如果它们的顺序错误就把它们交换过来。
//        走访数列的工作是重复地进行直到没有再需要交换，也就是说该数列已经排序完成。
//        这个算法的名字由来是因为越小的元素会经由交换慢慢“浮”到数列的顶端。
//    for (int i=0;i<a.length-1;i++){
//        for (int j=0;j<a.length-1-i;j++){
//            if (a[j]<a[j+1]){
//                int x=a[j];
//                a[j]=a[j+1];
//                a[j+1]=x;
//            }
//        }
//    }

//        选择排序,首先在未排序序列中找到最小（大）元素，存放到排序序列的起始位置，
//        然后，再从剩余未排序元素中继续寻找最小（大）元素，然后放到已排序序列的末尾。
//        以此类推，直到所有元素均排序完毕。
//        int l=a.length;
//        int minIndex,temp;
//        for(int i=0;i<l-1;i++){
//            minIndex=i;
//            for (int j=i+1;j<l;j++){
//                if (a[j]<a[minIndex]) {
//               minIndex=j;
//                }
//            }
//            temp=a[i];
//            a[i]=a[minIndex];
//            a[minIndex]=temp;
//        }

//输出排序后的数组
//        for (int b:a){
//            System.out.println(b);
//        }


//堆排序，利用堆这种数据结构所设计的一种排序算法。堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：
// 即子结点的键值或索引总是小于（或者大于）它的父节点。
//        用数组来按照完全二叉树实现堆,大顶堆小顶堆根据根节点最大最小来区分




    }

}

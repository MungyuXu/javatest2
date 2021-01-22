
//堆排序，利用堆这种数据结构所设计的一种排序算法。堆积是一个近似完全二叉树的结构，并同时满足堆积的性质：
// 即子结点的键值或索引总是小于（或者大于）它的父节点。
//        用数组来按照完全二叉树实现堆,大顶堆小顶堆根据根节点最大最小来区分

public class HeapSort {
    public static void main(String[] args) {
        int a[]={3,15,9,8,66,7,13,15};
        heapSort(a);
        for (int i:a){
            System.out.println(i);
        }
    }
    public  static  void  heapSort(int a[]){
//        创建堆
        for ( int i=(a.length-1)/2;i>=0;i--){
//从第一个非叶子结点从下至上，从右至左调整结构
            adjustHeap(a,i,a.length);
        }
        //调整堆结构+交换堆顶元素与末尾元素
        for (int i=a.length-1;i>0;i--){
            //将堆顶元素与末尾元素进行交换
            int temp=a[i];
            a[i]=a[0];
            a[0]=temp;
            //重新对堆进行调整
            adjustHeap(a,0,i);

        }
    }

//    调整堆
    public static void adjustHeap(int a[],int parent,int length){
//    将temp作为父节点
        int temp=a[parent];
//        左孩子
        int lChild=2*parent+1;
        while ( lChild<length){
//            右孩子
            int rChild=lChild+1;
            // 如果有右孩子结点，并且右孩子结点的值大于左孩子结点，则选取右孩子结点
            if(rChild<length && a[lChild]<a[rChild]){
                lChild++;
            }
            // 如果父结点的值已经大于孩子结点的值，则直接结束
            if (temp>=a[lChild]){
                break;
            }
            // 把孩子结点的值赋给父结点
            a[parent]=a[lChild];
            //选取孩子结点的左孩子结点,继续向下筛选
            parent=lChild;
            lChild=2*lChild+1;
        }
        a[parent]=temp;
    }
}

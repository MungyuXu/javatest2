import jdk.internal.org.objectweb.asm.tree.analysis.Value;

import javax.xml.soap.Node;
import java.util.Stack;

//中序遍历(递归+非递归)
public class TreeTest {

//    节点定义
    static  class  TreeNode{
        int value;
        TreeNode left;
        TreeNode right;
        TreeNode(int x){
            value=x;
        }
    }

    public static void main(String[] args) {
    TreeNode treeNode=new TreeNode(1);
    treeNode.left=new TreeNode(2);
    treeNode.right=new TreeNode(3);
        inorder2(treeNode);

    }
//    递归,先序就把sout放到前面,后序将sout放到最后
public  static void  inOrder(TreeNode root){
        if (root==null){
            return;
        }else{
            inOrder(root.left);
            System.out.println(root.value);
            inOrder(root.right);
        }

    }
//    非递归
    public  static void inorder2(TreeNode treeNode){
        Stack<TreeNode> stack=new Stack<>();
        while (treeNode!=null|| !stack.isEmpty()){
            while (treeNode!=null){
                stack.push(treeNode);
                treeNode=treeNode.left;
            }
//            左子树进栈完毕
            if (!stack.isEmpty()){
                treeNode=stack.pop();
                System.out.println(treeNode.value);
                treeNode=treeNode.right;
            }
        }
    }





}

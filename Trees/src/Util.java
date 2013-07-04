
public class Util {
void printInorder(Node root){
if(root==null)return;	
printInorder(root.left);
System.out.print(" "+root.data);
printInorder(root.right);
}
void printPreorder(Node root){
if(root==null)return;	
System.out.print(" "+root.data);
printInorder(root.left);
printInorder(root.right);
}

void printPostorder(Node root){
if(root==null)return;	
printInorder(root.left);
printInorder(root.right);
System.out.print(" "+root.data);
}

void fillData(Node root){
root.num=8;
root.left=new Node(4).setLeft(new Node(3));	
root.right=new Node(10);
}

}

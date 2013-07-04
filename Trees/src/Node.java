public class Node {
public String data;
public int num;
public Node left=null;
public Node right=null;
Node(int t){
	num=t;
}
Node(String t){
	data=t;
}
public String getData() {
	return data;
}
public void setData(String data) {
	this.data = data;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public Node getLeft() {
	return left;
}
public void setLeft(Node left) {
	this.left = left;
}
public Node getRight() {
	return right;
}
public void setRight(Node right) {
	this.right = right;
}
}

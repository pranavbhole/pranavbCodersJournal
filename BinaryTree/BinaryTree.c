/*
 * BinaryTree.c
 *
 *  Created on: Oct 7, 2013
 *      Author: pranav
 */
#include<stdio.h>
#include<stdbool.h>
#include "Node.c"

int numberOfLeafNodeRecursive(Node *root) {
	if (root == NULL )
		return 0;
	if (root->left == NULL && root->right == NULL )
		return 1;
	else
		return numberOfLeafNodeRecursive(root->left)
				+ numberOfLeafNodeRecursive(root->right);
}

int numberOfLeafNodeNonRecursive(Node *root) {
	if (root == NULL )
		return 0;
	int maxLeafs = 0;
	push(root);
	Node * prev = NULL;
	while (!isEmpty()) {
		Node * cur = topMost();
		if (!prev || prev->left == cur || prev->right == cur) {
			if (cur->left)
				push(cur->left);
			else if (cur->right)
				push(cur->right);
		} else if (cur->left == prev) {
			if (cur->right)
				push(cur->right);
		} else {
			if (cur->left == NULL && cur->right == NULL )
				maxLeafs++;
			pop();
		}
		prev = cur;
	}
	return maxLeafs;
}

int max(int a, int b, int c) {
	int t = a >= b ? a : b;
	return t >= c ? t : c;
}

int totalNumberOfNodes(Node *root) {
	if (root == NULL )
		return 0;
	int leftLP = totalNumberOfNodes(root->left);
	int rightLP = totalNumberOfNodes(root->right);
	return max(leftLP, rightLP, 1 + leftLP + rightLP);
}

Node* insertInto(Node*, int);

void buildBinaryTree(Node *root, int a[], int num) {
	if (a == NULL )
		return;
	int i;
	for (i = 1; i < num; i++) {
		Node *temp = root;
		Node *new = (Node *) malloc(sizeof(Node));
		new->data = a[i];
		new->left = NULL;
		new->right = NULL;

		while (temp != NULL ) {
			if (temp->data > a[i]) {
				if (temp->left == NULL ) {
					temp->left = new;
					break;
				}
				temp = temp->left;
			} else if (temp->data < a[i]) {
				if (temp->right == NULL ) {
					temp->right = new;
					break;
				}
				temp = temp->right;
			} else
				break;
		}
	}
}
void buildBinaryTreeRecursive(Node *root, int a[], int num) {
	if (a == NULL )
		return;
	int i;
	for (i = 1; i < num; i++) {
		if (!insertInto(root, a[i]))
			printf(" Failed to Insert %d", a[i]);
	}
}

Node* insertInto(Node *root, int item) {
	if (root == NULL ) {
		root = (Node *) malloc(sizeof(Node));
		root->data = item;
		root->left = NULL;
		root->right = NULL;
		return root;
	}
	if (root->data > item)
		root->left = insertInto(root->left, item);
	if (root->data < item)
		root->right = insertInto(root->right, item);
	return root;

}

void inorder(Node * root) {
	if (root == NULL )
		return;
	inorder(root->left);
	printf(" %d ", root->data);
	inorder(root->right);
}

int longestPath(Node * root){
if(root==NULL)return 0;
int l=0,r=0;
if(root->left)l=1+maxDepthIterative(root->left);
if(root->right)r=1+maxDepthIterative(root->right);
return max(r+l,longestPath(root->left),longestPath(root->right));
}

int max2(int a, int b) {
	return a >= b ? a : b;
}

int maxDepth;
int depthRecursive(Node *root, int c, bool flag) {
	if (flag == true)
		maxDepth = -1;
	if (root == NULL ) {
		if (c > maxDepth) {
			maxDepth = c;
		}
		return c;
	}
	return max2(depthRecursive(root->left, c + 1, false),
			depthRecursive(root->right, c + 1, false));
}

int maxDepthIterative(Node *root) {
	if (!root)
		return 0;
	push(root);
	int maxDepth = 0;
	Node *prev = NULL;
	while (!isEmpty()) {
		Node *curr = topMost();
		if (!prev || prev->left == curr || prev->right == curr) {
			if (curr->left)
				push(curr->left);
			else if (curr->right)
				push(curr->right);
		} else if (curr->left == prev) {
			if (curr->right)
				push(curr->right);
		} else {
			pop();
		}
		prev = curr;
		if (sizeOfStack() > maxDepth)
			maxDepth = sizeOfStack();
	}
	return maxDepth;
}

int main() {
	int random[] = { 20, 1, 4, 5, 7, 8, 32, 43, 10, 14, 21, 5 };
	Node *root = NULL;
	root = (Node *) malloc(sizeof(Node));
	root->data = random[0];
	root->left = NULL;
	root->right = NULL;
	buildBinaryTree(root, random, 12);
//	buildBinaryTreeRecursive(root, random, 12);
	inorder(root);
	printf("\nnumberOfLeafNodeRecursive=%d", numberOfLeafNodeRecursive(root));
	printf("\nMaxDepth=%d", maxDepthIterative(root));
	initializeStack();
	printf("\nnumberOfLeafNodeNonRecursive=%d",
			numberOfLeafNodeNonRecursive(root));
	printf("\ntotalNumberOfNodes=%d", totalNumberOfNodes(root));
	printf("\ndepthRecursive=%d", depthRecursive(root, 0, true));
	printf("\n longestPath=%d", longestPath(root));
	initializeQueue();

}

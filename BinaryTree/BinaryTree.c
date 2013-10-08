/*
 * BinaryTree.c
 *
 *  Created on: Oct 7, 2013
 *      Author: pranav
 */
#include<stdio.h>
#include<stdbool.h>

typedef struct Node {
	int data;
	struct Node *left, *right;
} Node;

Node* insertInto(Node*, int);

void buildBinaryTree(Node *root, int a[]) {
	if (a == NULL )
		return;
	int i;
	for (i = 1; i < sizeof(a); i++) {
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
			}
		}
	}
}
void buildBinaryTreeRecursive(Node *root, int a[]) {
	if (a == NULL )
		return;
	int i;
	for (i = 1; i < sizeof(a); i++) {
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

int main() {
	int random[] = { 20, 1, 4, 5, 7, 32, 43, 10, 14, 4, 5 };
	Node *root = NULL;
	root = (Node *) malloc(sizeof(Node));
	root->data = random[0];
	root->left = NULL;
	root->right = NULL;
	buildBinaryTree(root, random);
	inorder(root);
}

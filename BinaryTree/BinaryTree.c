/*
 * BinaryTree.c
 *
 *  Created on: Oct 7, 2013
 *      Author: pranav
 */
#include<stdio.h>
#include<stdbool.h>

typedef struct Node  {
	int data;
	struct Node *left, *right;
} Node;

bool insertInto(Node*, int);
void buildBinaryTree(Node *root, int a[]) {
	if (a == NULL )
		return;
	int i = 0;
	for (i = 0; i < sizeof(a) / 2; i++) {
		if (!insertInto(root, a[i]))
			printf(" Failed to Insert %d", a[i]);
	}
}

bool insertInto(Node *root, int item) {
	if (root == NULL ) {
		root = (Node *) malloc(sizeof(Node));
		root->data = item;
		root->left=NULL;
		root->right=NULL;
		return true;
	}
	if (root->data > item)
		return insertInto(root->left, item);
	if (root->data < item)
		return insertInto(root->right, item);
	return false;
}

int main() {
	Node *root = NULL;
	int random[] = { 20, 1, 4, 5, 7, 32, 43, 10, 14, 5 };
	buildBinaryTree(root, random);
}

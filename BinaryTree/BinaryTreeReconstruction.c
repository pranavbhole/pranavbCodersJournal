/*
 * BinaryTreeReconstruction.c
 *
 *  Created on: Oct 20, 2013
 *      Author: pranav
 */
#include<stdio.h>
#include<stdbool.h>
#include "Node.c"

int inOrderStr[] = { 3, 4, 5, 7, 10, 12, 15, 16 };
int inOrderCount = 8;
int preOrderStr[] = { 10, 5, 4, 3, 7, 15, 12, 16 };
int preOrderCount = 8;

int getOffset(int array[], int start, int end, int key) {
	if (end >= start) {
		int i;
		for (i = start; i <= end; i++)
			if (array[i] == key)
				return i;
	}
	return -1;
}

Node * buildTreeUsingPreNInOrder(int start, int end) {
	static int rootIndex = 0;
	if (start > end) //First Base condition
		return NULL ;
	Node *root = (Node*) malloc(sizeof(Node));
	root->data = preOrderStr[rootIndex++];
	int offset = getOffset(inOrderStr, start, end, root->data);
	root->left = buildTreeUsingPreNInOrder(start, offset - 1);
	root->right = buildTreeUsingPreNInOrder(offset + 1, end);
	return root;
}

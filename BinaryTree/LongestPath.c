/*
 * LongestPath.c
 *
 *  Created on: Oct 20, 2013
 *      Author: pranav
 */
#include<stdio.h>
#include<stdbool.h>
#include "Node.c"

int longestPath(Node * root) {
	if (root == NULL )
		return 0;
	int l = 0, r = 0;
	if (root->left)
		l = 1 + maxDepthIterative(root->left);
	if (root->right)
		r = 1 + maxDepthIterative(root->right);
	return max(r + l, longestPath(root->left), longestPath(root->right));
}


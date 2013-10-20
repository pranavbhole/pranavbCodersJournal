/*
 * AddAllGreaterValuesToEveryNode.c
 *
 *  Created on: Oct 20, 2013
 *      Author: pranav
 */
#include<stdio.h>
#include<stdbool.h>
#include "Node.c"

// This method add all the other greater values in the binary tree to every node.
void addAllGreterValuesToEveryNode(Node *root, int *sum){
if(root==NULL)return;
addAllGreterValuesToEveryNode(root->right, sum);
*sum=*sum+ root->data;
root->data=*sum;
addAllGreterValuesToEveryNode(root->left, sum);
}

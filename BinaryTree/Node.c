/*
 * Node.c
 *
 *  Created on: Oct 13, 2013
 *      Author: pranav
 */
#define MAX_INT 9999
#define MIN_INT -9999
typedef struct Node {
	int data;
	struct Node *left, *right;
} Node;

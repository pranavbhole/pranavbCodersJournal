/*
 * Stack.c
 *
 *  Created on: Oct 13, 2013
 *      Author: pranav
 */
#include<stdio.h>
#include<stdbool.h>
#include "Node.c"

int MAX = 1000;
int top = -1;
int size = 0;

Node * stack[1000];

bool push(Node * item) {
	if (size >= MAX)
		return false;
	top = (top + 1) % MAX;
	stack[top] = item;
	size++;
	return true;
}

Node* pop() {
	if (size <= 0)
		return NULL ;
	if (top == 0) {
		top = MAX - 1;
		size--;
		return stack[0];
	} else {
		size--;
		return stack[top--];
	}
}

Node * topMost() {
	if (size > 0) {
		return stack[top];
	} else
		return NULL ;
}

bool isEmpty() {
	if (size <= 0)
		return true;
	else
		return false;
}

int sizeOfStack() {
	return size;
}
void initializeStack(){
top = -1;
size = 0;
}

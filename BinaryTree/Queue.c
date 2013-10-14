/*
 * Queue.c
 *
 *  Created on: Oct 14, 2013
 *      Author: pranav
 */
#include<stdio.h>
#include<stdbool.h>
#include "Node.c"
int MAXQUEUE = 5;
int front=0, rear=0;
int sizeQueue = 0;

Node * queue[1000];

bool queueUp(Node * item) {
	if (sizeQueue >= MAXQUEUE)
		return false;
	queue[front] = item;
	front = (front + 1) % MAXQUEUE;
	sizeQueue++;
	return true;
}

Node* removeFromQueue() {
	if (sizeQueue <= 0)
		return NULL ;
	Node * temp=queue[rear];
rear=(rear+1)%MAXQUEUE;
sizeQueue--;
return temp;
}

Node * firstRankedInQueue() {
	if (sizeQueue > 0) {
		return queue[rear];
	} else
		return NULL ;
}

bool isEmptyQueue() {
	if (sizeQueue <= 0)
		return true;
	else
		return false;
}

int sizeOfQueue() {
	return sizeQueue;
}
void initializeQueue(){
rear =0;
front=0;
sizeQueue = 0;
}

void printQueue(){
printf("\n Front=%d , Rear =%d, size=%d ", front, rear, sizeQueue);
}

/*
 *	int c=1;
	Node *temp = NULL;
	while(c>0){
		printf(" Enter the choice");
		scanf("%d", &c);
		switch (c){
		case 0:
			break;
		case 1:
			temp = (Node *) malloc(sizeof(Node));
			printf(" Enter the item ");
			scanf("%d", &temp->data);
			if(!queueUp(temp))printf(" Queue up Failed!!!");
			break;
		case 2:
			temp=removeFromQueue();
			if(temp)
			printf(" Removed from Queue=%d", temp->data);
			else
				printf(" Failed to remove from Queue ");
			break;
		}
		printQueue();
	}
 *
 */

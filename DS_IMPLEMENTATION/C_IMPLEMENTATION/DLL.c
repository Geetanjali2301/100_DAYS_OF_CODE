#include<stdio.h>
#include<stdlib.h>
struct node{
	int data;
	struct node* next;
	struct node* prev;
};
struct node* head=NULL;
struct node* tail=NULL;

struct node* create_node(int val)
{
	struct node* newnode=(struct node*)malloc(sizeof(struct node));
	newnode->data=val;
	newnode->next=NULL;     
	newnode->prev=NULL;
}

struct node* insert_begin(int val)
{
	struct node* new=create_node(val);
     if(head==NULL)
     {
     	head=tail=new;
     	return head;
     	
	}
	head->prev=new;
	new->next=head;
	head=new;	
	return head;
}

void insert_end(int val)
{
	struct node* new=create_node(val);
	if(head==NULL)
	{
		head=tail=new;
	
	}
	tail->next=new;
	new->prev=tail;
	tail=new;	
	
}

void delete_head()
{
	struct node* temp=head;
	head=temp->next;
	head->prev=NULL;
	free(temp);	
}

void delete_tail()
{
	struct node* temp=tail;
	temp->prev->next=NULL;
	tail=temp->prev;
	free(temp);
}

void display_fromhead()
{
	struct node* temp=head;
	while(temp != NULL)
	{
		printf("%d ",temp->data);
		temp=temp->next;		
	}
	
}

void display_fromtail()
{
	struct node* temp=tail;
	while(temp !=NULL)
	{
		printf("%d ",temp->data);
		temp=temp->prev;
	}
}

int main()
{
	insert_begin(1);
	insert_begin(2);
	insert_begin(3);
	insert_end(4);
	insert_end(5);
	delete_tail();
	delete_tail();
	display_fromhead();
}


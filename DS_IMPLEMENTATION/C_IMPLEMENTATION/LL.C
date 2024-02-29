#include<stdio.h>
#include<stdlib.h>
#include<stdbool.h>
struct node{
	int data;
	struct node* next;
};

struct node* head=NULL;
struct node* tail=NULL;

//creation of node function
struct node* create_node(int val)
{
	struct node* newnode=(struct node*)malloc(sizeof(struct node));
	newnode->data=val;
	newnode->next=NULL;
	return newnode;
}

void display(){
	struct node* temp=head;
	while(temp!=NULL)
	{
		printf("%d ",temp->data);
		temp=temp->next;
	}
	
}


void insert_begin(int val)
{
	if(head==NULL)
	{
		head=tail=create_node(val);
		
	}
	else{
		struct node* new =create_node(val);
		new->next=head;
		head=new;
	}
}

void insert_end(int val)
{
	if(head==NULL)
	{
		head=tail=create_node(val);
	}
	else
	{
		struct node* new=create_node(val);
		tail->next=new;
		tail=new;
	}
}

void insert_pos(int val,int pos)
{
	struct node* temp=head;
	struct node* new=create_node(val);
	int i;
	for(i=0;i<pos-1;i++)
	{
		temp=temp->next;
	}
	new->next=temp->next;
	temp->next=new;
	
}

void delete_begin()
{
    if(head==NULL)
    {
        return;
    }
    else
    {
        struct node* temp=head;
        head=temp->next;
        free(temp);
    }
}


void delete_end()
{
   
    struct node* temp=head;
    while(temp->next->next != NULL)
    {
        temp=temp->next;
    }
    struct node* delnode=tail;
    temp->next=NULL;
    temp=tail;
    free(delnode);
        
    
}

void delete_pos(){
    printf("Enter the position of which the element to be deleted: ");
    int pos,i;
    scanf("%d",&pos);
    struct node* temp=head;
    for(i=0;i<pos-1;i++)
    {
        temp=temp->next;
    }
    struct node* delnode=temp->next;
    temp->next=delnode->next;
    free(delnode);
    
}

int main()
{
	
	int choice,val,pos;
	
	bool flag=true;
	while(flag){
	    printf("\nEnter a choice: \n1]insert at begin \n2]insert at end \n3]insert at position \n4]display  \n5]delete from begin \n6]delete from end \n7]delete from position \n8]exit \n" );
	    scanf("\n%d",&choice);
	switch(choice)
	{
		case 1:
			printf("Enter the value to insert in beginning: ");
			scanf("%d",&val);
			insert_begin(val);
			break;
			
			
		case 2:
		     printf("Enter the value to insert at end: ");
		     scanf("%d",&val);
		     insert_end(val);
		     break;
		     
		     
		case 3:
			printf("Enter the value and pos to insert at any position: ");
			scanf("%d %d",&val,&pos);
			insert_pos(val,pos);
			break;
		
			
		case 4:
		     display();
		     break;
		     
		case 5:
		     delete_begin();
		     break;  
		     
		case 6:
		     delete_end();
		     break; 

        case 7:
		     delete_pos();
		     break;
		     
		case 8:
		     flag=false;
		     break;
		     
	}
	}

}

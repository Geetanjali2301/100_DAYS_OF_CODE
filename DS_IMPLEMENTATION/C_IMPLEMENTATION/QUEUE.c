
#include<stdio.h>
int Queue[5];
int front=-1;
int rear=-1;
void enqueue();
void dequeue();
void display();
int main()
{
	int choice;
	while(1)
	{
		printf("\nQueue operations\n");
	     printf("1.Enqueue\n2.Dequeue\n3.Display");
	     printf("\nEnter the Choice: ");
	     scanf(" %d",&choice);
		switch(choice)
	{
		case 1:
			{
				enqueue();
			  	break;
		}
       	case 2:
			{
				dequeue();
				break;
			}
		case 3:
			{
				display();
				break;
			}
		default:
			{
				printf("Enter the valid choice\n");
			}
	}
	}
}
void enqueue()
{
	int x;
	if(rear==4)
	{
		printf("Queue is overflow");
	}
	else
	{
		if (front==-1 && rear==-1)
		    front=rear=0;
		    
		
		else 
		     rear++;
		     printf("Enter the value to insert: ");
		     scanf("%d",&x);
		     Queue[rear]=x;
		
		
	}
}
void dequeue()
{
	if(front==-1&&rear==-1)
	{
		printf("Queue is underflow");
		
	}
	else
	{
		printf("The dequeue element is %d",Queue[front]);
	
	if (front==rear)
	    front=rear=-1;
	else 
	    front++;
}
}
void display()
{
	int i;
	if(rear==-1)
	{
		printf("The Queue is empty");
		
	}
	else
	{
		printf("The Queue is:");
		for(i=front;i<=rear;i++)
		{
			printf("%d ",Queue[i]);
	
		}
	}
}


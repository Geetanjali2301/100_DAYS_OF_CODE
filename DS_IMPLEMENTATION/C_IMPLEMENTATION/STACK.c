#include<stdio.h>
#include<conio.h>
#include<stdlib.h>
int stack[5];
int top=-1;
void push();
void pop();
void display();

int main()
{
	
	int Choice;
	while(1)
	{
	
	printf("\nStack operations\n");
	printf("1.Push\n2.Pop\n3.Display");
	printf("\nEnter the Choice: ");
	scanf(" %d",&Choice);
	switch(Choice)
	{
		case 1:
			{
				push();
			  	break;
		}
       	case 2:
			{
				pop();
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
void push()
{
	int x;
	if(top >= 4)
	{
		printf("Stack is overflow");
	}
	else
	{
		top++;
		printf("Enter the value to push: ");
		scanf("%d",&x);
		stack[top]=x;
		
		
	}
}
void pop()
{
	if(top==-1)
	{
		printf("Stack is underflow");
		
	}
	else
	{
		printf("The poped element is %d",stack[top]);
		top--;
	}
}
void display()
{
	int i;
	if(top>=0)
	{
		printf("The stack is:");
		for(i=top;i>=0;i--)
		{
			printf("\n%d",stack[i]);
		
		}
	}
	else
	{
		printf("The stack is empty");
	}
}


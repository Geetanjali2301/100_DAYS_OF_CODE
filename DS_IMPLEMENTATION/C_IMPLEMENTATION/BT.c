#include<stdio.h>
#include<stdlib.h>

struct treenode{
	int data;
	struct treenode *left;
	struct treenode *right;
};

struct treenode *create_node(int data)
{
	struct treenode* NewNode= (struct treenode*) malloc(sizeof(struct treenode));
	NewNode->data=data;
	NewNode->left=NULL;
	NewNode->right=NULL;
	
	return NewNode;
}

struct treenode *insert(int data,struct treenode* parent,char child)
{
	if(parent!=NULL)
	{
		if(child=='l')
		{
			parent->left=create_node(data);
			if(parent->left!=NULL)
			{
				return parent->left;
			}
		}
		else if(child=='r')
		{
			parent->right=create_node(data);
			if(parent->right!=NULL)
			{
				return parent->right;
			}
		}
	}
	return parent;
}



void inorder(struct treenode *root)
{
	
	if(root==NULL)
	{
		return;
	}
	inorder(root->left);
	printf("%d ",root->data);
	inorder(root->right);
}

int main()
{
	struct treenode *root=create_node(10);
	insert(5, root, 'l');
     insert(12, root, 'r');
     insert(25, root->left, 'l');
     insert(67, root->right, 'l');
     inorder(root);
	
}


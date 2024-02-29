#include<stdio.h>
#include<stdlib.h>
//node defination how is the structure of node actually a data and 2 pointers left and right
struct node{
	int data;
	struct node *left;
	struct node *right;
};

//new node creation
struct node *create_node(int data)
{
	struct node* NewNode= (struct node*) malloc(sizeof(struct node));
	NewNode->data=data;
	NewNode->left=NULL;
	NewNode->right=NULL;
	
	return NewNode;
}

//insertion in bst
struct node* build_bst(int data,struct node* root)
{
	if(root==NULL)
	{
		return create_node(data);
		
	}
	else if(root->data>data)
	{
		root->left= build_bst(data,root->left);
		
	}
	else if(root->data<data)
	{
		root->right= build_bst(data,root->right);
	
	}
	return root;
}

//searching pending
struct node* search(int key,struct node* root)
{
	if(root->data==key || root==NULL )
	{
		
		return root;
		
	}
	else if(key<root->data)
	{
		root->left= search(key,root->left);
		return root->left;
	}
	else
	{
		root->right= search(key,root->right);
		return root->right;
	     
	}

	return root;
}


//function for inorder successor
struct node* inordersuc(struct node* root)
{
	
	
	while(root->left!=NULL)
	{
	
		root=root->left;
	
	}
return root;
}

//deletion pending 

struct node * delete(int key, struct node * root)
{
	if(root==NULL)
	{
		return root;
	}
	else if(root->data>key)
	{
		root->left=delete(key,root->left);
	}
	else if(root->data<key)
	{
		root->right=delete(key,root->right);
	}
	else
	{
		//only leaf node or single chile
		if(root->left==NULL)
		{
			struct node * temp=root->right;
			free(root);
			return temp;
		}
		else if(root->right==NULL)
		{
			struct node* temp=root->left;
			free(root);
			return temp;
		}
		
		//case 3 having two chid just replace the root value with is inorder successor or predessecor
		//inorder successor is the smallest node of right subtree
		// inorder predecessor is the largest node of left subtree
		
		struct node * i=inordersuc(root->right);
		root->data=i->data;
		root->right=delete(i->data,root->right);
		
	}
	return root;
}



//traversal in bst
//inorder always give you the sorted order remaining post and pre will be same 
void inorder(struct node *root)
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
	struct node* root= create_node(7);
	build_bst(6,root);
	build_bst(2,root);
	build_bst(3,root);
	build_bst(8,root);
	inorder(root);

	
}

package DAY_88;

import java.util.*;

class Node {
    int data;      
    Node next;     

    Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class reversek {

    static Node reverseLinkedList(Node head) {
    
       Node temp = head;
       Node prev = null;  
       
       while(temp != null){  
           Node front = temp.next;  
           temp.next = prev;  
           prev = temp;  
           temp = front; 
       }
     
       return prev;  

    }

    static Node getKthNode(Node temp, int k) {
    
        k -= 1;
        while (temp != null && k > 0) {
            k--;
            temp = temp.next;
        }
     
        return temp;
    }

    static Node kReverse(Node head, int k) {
        Node temp = head;
        Node prevLast = null;

        while (temp != null) {
            
            Node kThNode = getKthNode(temp, k);
            
            if (kThNode == null) {
    
                if (prevLast != null) {
                    prevLast.next = temp;
                }
              
                break;
            }
        
            Node nextNode = kThNode.next;
            kThNode.next = null;
            reverseLinkedList(temp);
            
            if (temp == head) {
                head = kThNode;
            } else {
            
                prevLast.next = kThNode;
            }
            
           
            prevLast = temp;
            temp = nextNode;
        }
     
        return head;
    }

    static void printLinkedList(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        // Create a linked list with
        // values 5, 4, 3, 7, 9 and 2
        Node head = new Node(5);
        head.next = new Node(4);
        head.next.next = new Node(3);
        head.next.next.next = new Node(7);
        head.next.next.next.next = new Node(9);
        head.next.next.next.next.next = new Node(2);

        // Print the original linked list
        System.out.print("Original Linked List: ");
        printLinkedList(head);

        // Reverse the linked list
        head = kReverse(head, 4);

        // Print the reversed linked list
        System.out.print("Reversed Linked List: ");
        printLinkedList(head);
    }
}
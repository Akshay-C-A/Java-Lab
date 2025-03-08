package javaLAB;
import java.util.Scanner;

class DLLProgram {    
    class Node {  
        int item;  
        Node previous;  
        Node next;  
        public Node(int item) {  
            this.item = item;  
        }  
    }  
    Node head, tail = null;  
    public void addNode(int item) {  
        Node newNode = new Node(item);  
        if(head == null) {  
            head = tail = newNode;  
            head.previous = null;  
            tail.next = null;  
        }  
        else { 
            tail.next = newNode;  
            newNode.previous = tail;  
            tail = newNode;  
            tail.next = null;  
        }  
        System.out.println(item+" inserted\n");
    }  
    public void deleteNodes() {
    	int x = head.item;
        head = head.next;
        System.out.println("Element "+x+" got deleted\n");
    }
    public void printNodes() {  
        Node current = head;  
        if(head == null) {  
            System.out.println("Doubly linked list is empty\n");  
            return;  
        }  
        System.out.println("Nodes of doubly linked list: ");  
        while(current != null) {  
            System.out.print(current.item + " ");  
            current = current.next;  
        }
        System.out.println("");
    }  
}

public class DoublyLinkedList {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		DLLProgram dll=new DLLProgram();
		int ch,item;
		while(true)
		{
			System.out.println("Enter your choice : ");
			System.out.println("1.Insert new element\n2.Delete element\n3.Display\n4.Exit");
			ch=sc.nextInt();
			switch(ch)
			{
				case 1 : System.out.println("Enter the element to be inserted : ");
						 item=sc.nextInt();
						 dll.addNode(item);
						 break;
				case 2 : dll.deleteNodes();
					     dll.printNodes();
					     System.out.println();
					     break;
				case 3 : dll.printNodes();
						 System.out.println();
						 break;
				case 4 : System.exit(0);
						 break;
				default :System.out.println("Wrong Choice!!!\n");
						 break;
			}
			
		}

	}

}

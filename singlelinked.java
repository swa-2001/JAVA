//ALL OPERATIONS FOR LINKED LIST DONE BY MY OWN IN JAVA
public class singlelinked {
	Node head;
	class Node{
		int data;
		Node next;
		
		Node(int data){
			this.data=data;
			this.next=null;
		}
	}
	public void addFirst(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		newnode.next=head;
		head=newnode;
	}
	public void addLast(int data) {
		Node newnode=new Node(data);
		if(head==null) {
			head=newnode;
			return;
		}
		Node curr=head;
		while(curr.next!=null) {
			curr=curr.next;
		}
		curr.next=newnode;
	}
	public void printall() {
		if(head==null) {
			System.out.println("Linked list is empty");
		}
		Node curr=head;
		while(curr!=null) {
			System.out.print(curr.data + "---->");
			curr=curr.next;
		}
		System.out.println("null");
	}
	public void removeLast() {
		if(head==null) {
			System.out.println("Linked list is empty");
		}
		Node prev=head;
		Node curr=head;
		while(curr.next!=null) {
			prev=curr;
			curr=curr.next;
		}
		prev.next=null;
		
	}
	public void removeFirst() {
		Node curr=head;
		head=curr.next;
		curr.next=null;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		singlelinked list=new singlelinked();
		list.addFirst(10);
		list.addFirst(20);
		list.addLast(30);
		list.addLast(40);
		list.removeFirst();
		list.removeFirst();
		list.printall();
	}

}

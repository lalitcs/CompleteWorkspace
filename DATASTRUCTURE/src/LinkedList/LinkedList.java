package LinkedList;

public class LinkedList {
	    Node head;
	    void insert(int ele){
	    Node N =new Node(ele);
	    if(head==null){
	        head=N;
	        System.out.println("new Linked list created with node"+ele);
	    }
	    
	    else{
	        Node temp=head;
	        while(temp.next!=null){
	            temp=temp.next;
	       }
	        temp.next=N;
	      
	      }  System.out.println("new node insert value"+ele);
	    }
	    void insertFront(int ele){
	        Node n=new Node(ele);
	        n.next=head;
	        head=n;
	        System.out.println("new node has been inserted in front"+ele);
	    }
	    void display(){
	        if(head==null){
	            System.out.println("linked list is empty.....");
	        }
	        else{
	            Node temp=head;
	            while(temp.next!=null){
	                System.out.println(temp.data+"->");
	                temp=temp.next;
	            }
	            System.out.println(temp.data);
	        }
	    }
	    void deleteFront(int ele){
	       if(head==null){
	            System.out.println("linked list is empty.....");
	        }
	        else{
	            System.out.println("node with the value"+head.data+"has been deleted");
	            head=head.next;
	        }
	    }
	    void deleteLast(){
	       if(head==null){
	            System.out.println("linked list is empty.....");
	        }
	        else if(head.next==null){
	        	System.out.println(head.data+" has been deleted");
	            head=null;
	        }
	        else {
	        	Node temp=head;
	            while(temp.next.next!=null) {
	            	temp=temp.next;
	                
	            }
	            //System.out.println(temp.data);
	            System.out.println(temp.next.data + " has been deleted");
	            temp.next=null;
	            
	        }
	    }

	 }


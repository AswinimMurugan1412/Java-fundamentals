package Linked_list;

class Intersection_Nodes {
        static class Node {
        	int data;
        	Node next;
        }
        
      public static Node push(Node head,int data)
      {
    	  Node node=new Node();
    	  node.data=data;
    	  node.next=head;
    	  return node;
      }
      private static Node intersectionPoint(Node list1,Node list2) {
    	  Node firstTemp=list1;
    	  while(firstTemp !=null) {
    		  Node temp=list2;
    		  while(temp!=null) {
    			  if (firstTemp==temp) {
    				  return firstTemp;
    			  }
    			  temp=temp.next;
    			  
    			  firstTemp=firstTemp.next;
    		  }
    		  return null;
    	  }
		return firstTemp;
    	  
    			  }
  
	public static void main(String[] args) {
		Node first=null;
		for (int i=7;i>0;i--) {
		first=push(first,i);
		
		}
        Node second=null;
        for (int i=3;i>0;i--) {
        	second=push(second,i);
        	
        }
        second.next.next.next=first.next.next.next;
        Node addr=intersectionPoint(first,second);
        if(addr!=null) {
        	System.out.println("The intersection point is"+addr.data);
        	
        }
        else {
        	System.out.println("The lists do not intersect.");
        }
	}

}
 
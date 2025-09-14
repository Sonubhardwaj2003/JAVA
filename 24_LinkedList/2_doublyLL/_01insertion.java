public class _01insertion {
    Node head;

    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
        }
    }

    //add to beganing
    public void addBeg(int val){
        Node newNode=new Node(val);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head.prev=newNode;
        head=newNode;
    }


    //add to end
    public void addEnd(int val){
        Node newNode=new Node(val);

        if(head==null){
            head=newNode;
            return;
        }

       Node currNode=head;
       while(currNode.next!=null){
            currNode=currNode.next;
       }

       currNode.next=newNode;
       newNode.prev=currNode;
    }

    //add to Location
    public void addLoc(int val,int ind){
        Node newNode=new Node(val);

        if(head==null){
            head=newNode;
            return;
        }

       Node currNode=head;
       Node ptr=null;
       int i=0;
       while(i<ind){
            ptr=currNode;
            currNode=currNode.next;
            i++;
       }

       currNode.prev=newNode;
       newNode.prev=ptr;
       ptr.next=newNode;
       newNode.next=currNode;
    }


    //to display
    public void display(){
        if(head==null){
            System.out.println("List is empty,nothing to print");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.val+" -> ");
            currNode=currNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        _01insertion list=new _01insertion();

        list.addBeg(15);
        list.addBeg(10);
        list.addBeg(5);
        list.display();

        list.addEnd(20);
        list.addEnd(25);
        list.display();

        list.addLoc(12, 2);
        list.display();
    }
}

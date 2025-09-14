public class _02deletion {
    Node head;

    public int size;
    _02deletion(){
        this.size=0;
    }

    class Node{
        int val;
        Node next;
        Node prev;

        Node(int val){
            this.val=val;
            this.next=null;
            this.prev=null;
            size++;
        }
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

    //delet from begaining
    public void delBeg(){
        if(head==null){
            return;
        }
        size--;
        head=head.next;
        head.next.prev=null;
    }

    //delet from end
    public void delEnd(){
        if(head==null){
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }
        size--;
        currNode.prev.next=null;
        currNode.prev=null;
    }

    //delet from Location or any index
    public void delLoc(int ind){
        if(head==null){
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

        size--;

        ptr.next=currNode.next;
        currNode.next.prev=ptr;
        currNode.next=null;
        currNode.prev=null;
    }

    //to display
    public void display(){
        if(head==null){
            System.out.println("List is already empty,nothing to delete");
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
        _02deletion list=new _02deletion();

        list.display();

        list.addEnd(5);
        list.addEnd(10);
        list.addEnd(15);
        list.addEnd(20);
        list.addEnd(25);
        list.addEnd(30);
        list.addEnd(35);
        list.display();

        list.delBeg();
        list.display();

        list.delEnd();
        list.display();

        list.delLoc(2);
        list.display();

        System.out.println(list.size);
    }
}

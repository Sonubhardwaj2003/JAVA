public class _02insertionInt {
    Node head;
    class Node{
        int value;
        int Loc;
        Node next;

        Node(int value){
            this.value=value;
            this.Loc=Loc;
            this.next=null;
        }
    }

    //add to begaining
    public void addFirst(int value){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    //add to last
    public void addLast(int value){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        while(currNode.next!=null){
            currNode=currNode.next;
        }

        currNode.next=newNode;
    }

    //add to Location
    public void addLoc(int value ,int Loc){
        Node newNode=new Node(value);

        if(head==null){
            head=newNode;
            return;
        }

        Node currNode=head;
        Node temp=null;
        int i=0;
        while(i<Loc){
            temp=currNode;
            currNode=currNode.next;
            i++;
        }

        newNode.next=currNode;
        temp.next=newNode;
    }

    //to print
    public void printList(){
        if(head==null){
            System.out.println("Currently list is empty , nothing to print");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.value+" -> ");
            currNode=currNode.next;
        }

        System.out.println("Null");
    }


    public static void main(String[] args) {
        _02insertionInt list=new _02insertionInt();
        
        list.printList();

        list.addFirst(10);
        list.printList();

        list.addFirst(5);
        list.addLast(15);
        list.addLast(20);
        list.addLoc(12,3);
        list.printList();

    }
}

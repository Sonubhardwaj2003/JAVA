public class _03deletion {
    Node head;

    private int size;

    _03deletion(){
        this.size=0;
    }

    class Node{
        int val;
        Node next;

        Node(int val){
            this.val=val;
            this.next=null;
            size++;
        }
    }

    //add to list
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

    //delete from beganing
    public void delFirst(){
        if(head==null){
            return;
        }
        size--;
        head=head.next;
    }

    //delete from end
    public void delLast(){
        if(head==null){
            return;
        }

        size--;

        Node ptr=head;
        Node currNode = null;
        while(ptr.next!=null){
            currNode=ptr;
            ptr=ptr.next;
        }

        currNode.next=null;
    }

    //print list
    public void printList(){
        if(head==null){
            System.out.println("list is already empty,nothing to delete. ");
            return;
        }

        Node currNode=head;
        while(currNode!=null){
            System.out.print(currNode.val+" -> ");
            currNode=currNode.next;
        }

        System.out.println("Null");
    }

    //to get the size
    public int getSize(){
        return size;
    }

    public static void main(String[] args) {
        _03deletion list=new _03deletion();

        list.addLast(5);
        list.addLast(10);
        list.printList();

        list.delFirst();
        list.printList();

        list.addLast(15);
        list.addLast(20);
        list.addLast(25);
        list.addLast(30);
        list.delLast();
        list.printList();

        System.out.println(list.getSize());
        list.addLast(30);
        System.out.println(list.getSize());
    }
}

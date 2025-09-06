public class _01insertionStr {
    Node head;
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data=data;
            this.next=null;
        }
    }

    //add to first
    public void addFirst(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        newNode.next=head;
        head=newNode;
    }

    //add to last
    public void addLast(String data){
        Node newNode=new Node(data);

        if(head==null){
            head=newNode;
            return;
        }

        Node currentNode=head;
        while(currentNode.next!=null){
            currentNode=currentNode.next;
        }

        currentNode.next=newNode;
        
    }

    //print list
    public void printList(){
        if(head==null){
            System.out.println("Currently list is empty, there is nothing to display");
            return;
        }

        Node currentNode=head;
        while(currentNode != null){
            System.out.print(currentNode.data+" -> ");
            currentNode=currentNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        _01insertionStr list=new _01insertionStr();

        list.printList();

        list.addFirst("Sonu");
        list.addFirst("am");
        list.printList();

        list.addFirst("I");
        list.printList();

        list.addLast("bhardwaj");
        list.printList();
    }
}


public class _04reverseLL {
    Node head;

    class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
            this.next = null;
        }
    }

    // add to begaining
    public void addFirst(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    // add to last
    public void addLast(int value) {
        Node newNode = new Node(value);

        if (head == null) {
            head = newNode;
            return;
        }

        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }

        currNode.next = newNode;
    }

    // to reverse the list
    public void reverse(){
        if(head==null || head.next==null){
            return ;
        }

        Node prev=head;
        Node curr=head.next;
        while(curr!=null){
            Node Next=curr.next;
            curr.next=prev;

            //update
            prev=curr;
            curr=Next;
        }

        head.next=null;
        head=prev;
    }


    //recursive method to revers the list
    public Node reverseRec(Node head){
        if(head== null || head.next==null){
            return head;
        }

        Node newNode=reverseRec(head.next);
        head.next.next=head;
        head.next=null;

        return newNode;
    }

    // to print
    public void printList() {
        if (head == null) {
            System.out.println("Currently list is empty , nothing to print");
            return;
        }

        Node currNode = head;
        while (currNode != null) {
            System.out.print(currNode.value + " -> ");
            currNode = currNode.next;
        }

        System.out.println("Null");
    }

    public static void main(String[] args) {
        _04reverseLL list=new _04reverseLL();

        list.printList();

        list.addFirst(10);
        list.printList();

        list.addFirst(5);
        list.addLast(15);
        list.addLast(20);
        list.printList();

        list.reverse();
        list.printList();

        list.head=list.reverseRec(list.head);
        list.printList();
    }
}

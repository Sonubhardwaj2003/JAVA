public class CircularSLL {
    Node head;

    class Node {
        int val;
        Node next;

        Node(int val) {
            this.val = val;
        }
    }

    // Insert at beginning
    public void insBeg(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != head) {
            last = last.next;
        }

        newNode.next = head;
        last.next = newNode;
        head = newNode;
    }

    // Insert at last
    public void insLast(int val) {
        Node newNode = new Node(val);

        if (head == null) {
            newNode.next = newNode;
            head = newNode;
            return;
        }

        Node last = head;
        while (last.next != head) {
            last = last.next;
        }

        newNode.next = head;
        last.next = newNode;
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

    // Display the list
    public void display() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }

        Node curr = head;
        do {
            System.out.print(curr.val + " -> ");
            curr = curr.next;
        } while (curr != head);

        System.out.println(head.val);
    }

    public static void main(String[] args) {
        CircularSLL list = new CircularSLL();

        list.insBeg(5);
        list.insBeg(10);
        list.insBeg(15);
        list.display();

        list.insLast(20);
        list.insLast(25);
        list.insLast(30);
        list.display();


        list.addLoc(17, 3);
        list.display();
    }
}
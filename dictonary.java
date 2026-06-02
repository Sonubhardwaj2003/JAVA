import java.util.Scanner;

public class dictonary {
    Node head;

    class Node {
        String data;
        Node[] next;
        boolean isEnd;   

        Node(String data) {
            this.data = data;
            this.next = new Node[26];
            this.isEnd = false;
        }
    }

    public Node insert(String word, Node head) {
        if (head == null) {
            head = new Node("");
        }

        Node current = head;
        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (current.next[index] == null) {
                current.next[index] = new Node(String.valueOf(c));
            }
            current = current.next[index];
        }

        current.isEnd = true;  
        return head;
    }

    public boolean search(String word, Node head) {
        if (head == null) return false;

        Node current = head;
        for (char c : word.toCharArray()) {
            int index = c - 'a';

            if (current.next[index] == null) {
                return false;
            }
            current = current.next[index];
        }

        return current.isEnd;  
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        dictonary dict = new dictonary();
        dict.head = dict.insert("hello", dict.head);
        dict.head = dict.insert("world", dict.head);
        dict.head = dict.insert("hi", dict.head);
        dict.head = dict.insert("hwi", dict.head);
        dict.head = dict.insert("java", dict.head);

        String searchWord = sc.nextLine();

        boolean found = dict.search(searchWord, dict.head);

        if (found) {
            System.out.println("Word found in dictionary.");
        } else {
            System.out.println("Word not found in dictionary.");
        }

        sc.close();
    }
}
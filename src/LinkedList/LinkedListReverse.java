package src;

public class LinkedListReverse {

    Node reverse(Node node)
    {
        Node prev = null;
        Node current = node;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    
    static Node reverseUsingRecursion(Node head)
    {
        if (head == null || head.next == null)
            return head;

        Node rest = reverseUsingRecursion(head.next);
        head.next.next = head;
 
        head.next = null;
 
        return rest;
    }
    
    // function to print linkedlist
    static void print()
    {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }
    
    static void push(int data)
    {
        Node temp = new Node(data);
        temp.next = head;
        head = temp;
    }
}

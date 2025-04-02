
import java.util.*;

class SLL {
    Node head;
    Node tail;
    void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head == null) head = tail = temp;
    }
}

public class implementationLL {

    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtEnd(3);
    }
}

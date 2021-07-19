package features.v1.f6;

public class MyLinkedList {
    public LinkedListNode head;
    public LinkedListNode tail;

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    public void append(LinkedListNode node){
        node.next = null;
        node.prev = null;

        if(this.head == null){
            this.head = node;
        }else{
            this.tail.next = node;
            node.prev = this.tail;
        }
        this.tail = node;
    }

}

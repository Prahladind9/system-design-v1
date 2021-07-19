package features.v1.f6;

public class LinkedListNode {
    public int key;
    public int val;
    public int freq;
    public LinkedListNode next;
    public LinkedListNode prev;

    public LinkedListNode(int key,
                          int val,
                          int freq,
                          LinkedListNode next,
                          LinkedListNode prev) {
        this.key = key;
        this.val = val;
        this.freq = freq;
        this.next = next;
        this.prev = prev;
    }
}

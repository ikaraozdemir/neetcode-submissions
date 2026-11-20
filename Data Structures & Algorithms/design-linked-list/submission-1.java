class ListNode {
    int val;
    ListNode next;
    ListNode prev;

    ListNode(int val) {
        this.val = val;
        this.next = null;
        this.prev = null;
    }
}

public class MyLinkedList {
    private ListNode head;
    private ListNode tail;
    private int size;
    MyLinkedList() {
        head = new ListNode(0);
        tail = new ListNode(0);
        head.next = tail;
        tail.prev = head;
        size = 0;
    }

    public int get(int index) {
        if (index < 0 || index >= size)
            return -1;
        ListNode curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }

        return curr != null ? curr.val : -1;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        ListNode next = head.next;
        head.next = newNode;
        next.prev = newNode;
        newNode.prev = head;
        newNode.next = next;
        size++;
    }

    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode prev = tail.prev;
        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = tail;
        tail.prev = newNode;
        size++;
    }

    public void addAtIndex(int index, int val) {
        if (index < 0 || index > size)
            return;

        ListNode newNode = new ListNode(val);

        ListNode curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        ListNode prev = curr.prev;
        ListNode next = curr;

        prev.next = newNode;
        newNode.prev = prev;
        newNode.next = next;
        next.prev = newNode;
        size++;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;
        ListNode curr = head.next;
        for (int i = 0; i < index; i++) {
            curr = curr.next;
        }
        ListNode prev = curr.prev;
        ListNode next = curr.next;

        prev.next = next;
        next.prev = prev;
        size--;
    }
}

/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */
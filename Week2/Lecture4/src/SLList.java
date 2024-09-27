public class SLList {

    private static class IntNode {
        int item;
        IntNode next;

        IntNode(int first, IntNode next) {
            this.item = first;
            this.next = next;
        }
    }

    /* the first item is at sentinel.next */
    private IntNode sentinel;
    private int size;

    /* Creates a new list with one item x. */
    public SLList(int x) {
        sentinel = new IntNode(35, null);
        sentinel.next = new IntNode(x, null);
        size = 1;
    }

    /* creates an empty SLList. */
    public SLList() {
        sentinel = new IntNode(35, null);
        size = 0;
    }

    /* add x to the front of the list. */
    public void addFirst(int x) {
        sentinel.next = new IntNode(x, sentinel.next);
        size++;
    }

    /* add x to the back of the list. */
    public void addLast(int x) {
        IntNode p = sentinel;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
        size++;
    }

    /* Returns the size of the list. */
    public int size() {
        return size;
    }

    /* Returns the first item of the list. */
    public int getFirst() {
        return sentinel.next.item;
    }

    public static void main(String[] args) {
        SLList list = new SLList(15);
        list.addFirst(10);
        list.addFirst(5);
        list.addLast(20);
        for (IntNode n = list.sentinel.next; n != null; n = n.next) {
            System.out.println(n.item);
        }
    }
}

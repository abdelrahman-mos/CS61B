public class SLList {

    private static class IntNode {
        int item;
        IntNode next;

        IntNode(int first, IntNode next) {
            this.item = first;
            this.next = next;
        }
    }

    private IntNode first;

    /* Creates a new list with one item x. */
    public SLList(int x) {
        first = new IntNode(x, null);
    }

    /* add x to the front of the list. */
    public void addFirst(int x) {
        first = new IntNode(x, first);
    }

    /* add x to the back of the list. */
    public void addLast(int x) {
        IntNode p = first;
        while (p.next != null) {
            p = p.next;
        }
        p.next = new IntNode(x, null);
    }

    /* Returns the size of the list. */
    public int size() {
        return size(first);
    }

    /* returns size of the list starting at IntNode p. */
    private int size(IntNode p) {
        if (p.next == null) {
            return 1;
        }
        return 1 + size(p.next);
    }

    /* Returns the first item of the list. */
    public int getFirst() {
        return first.item;
    }

    public static void main(String[] args) {
        SLList list = new SLList(15);
        list.addFirst(10);
        list.addFirst(5);
        System.out.println(list.getFirst());
    }
}

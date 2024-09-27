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

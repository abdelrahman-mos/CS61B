public class IntList {
    public int first;
    public IntList next;

    public IntList(int first, IntList next) {
        this.first = first;
        this.next = next;
    }

    public int size() {
        if (next == null) return 1;
        return 1 + next.size();
    }

    public int iterativeSize() {
        IntList list = this;
        int size = 0;
        while (list != null) {
            list = list.next;
            size++;
        }
        return size;
    }

    public int get(int index) {
        if (index < 0 || index >= size()) throw new IndexOutOfBoundsException();
        if (index == 0) return first;
        return next.get(index-1);
    }

    public static void main(String[] args) {
        IntList list = new IntList(15, null);
        list = new IntList(10, list);
        list = new IntList(5, list);

//        for (IntList i = list; i != null; i = i.next) {
//            System.out.println(i.first);
//        }

        System.out.println(list.size());
        System.out.println(list.iterativeSize());
        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}

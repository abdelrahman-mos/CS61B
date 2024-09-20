import java.util.*;
public class IntList {
    public int first;
    public IntList next;

    public IntList(int first, IntList next) {
        this.first = first;
        this.next = next;
    }

    public static void main(String[] args) {
        IntList list = new IntList(15, null);
        list = new IntList(10, list);
        list = new IntList(5, list);

        for (IntList i = list; i != null; i = i.next) {
            System.out.println(i.first);
        }
    }
}

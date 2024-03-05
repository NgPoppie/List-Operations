import java.util.*;

class ListNode<T> {
    public T data;
    public ListNode<T> next;

    // search
    public static ListNode<Integer> search(ListNode<Integer> L, int key) {
        boolean k = true;
        while (L != null && L.data != key) {
            L = L.next;
        }
        k = false;
        if (k == false) {
            System.out.println("Not found");
        }
        return L;
    }

    // insert
    public static void insertAfter(ListNode<Integer> node, ListNode<Integer> newNode) {
        newNode.next = node.next;
        node.next = newNode;
    }

    // delete a node
    public static void deleteList(ListNode<Integer> aNode) {
        aNode.next = aNode.next.next;
    }

    // merge two lists
    public static ListNode<Integer> Merge(ListNode<Integer> L1, ListNode<Integer> l2) {
        ListNode<Integer> dummyhead = new ListNode<>();
        ListNode<Integer> current = dummyhead;
        ListNode<Integer> p1 = L1, p2 = l2;
        while (p1 != null && p2 != null) {
            if (p1.data <= p2.data) {
                current.next = p1;
                p1 = p1.next;
            } else {
                current.next = p2;
                p2 = p2.next;
            }
            current = current.next;
        }
        current.next = p1 != null ? p1 : p2;
        return dummyhead.next;
    }

    public static void main(String[] args) {
        ListNode<Integer> next = new ListNode<>();
        ListNode<Integer> newNode = new ListNode<>();
        insertAfter(next, newNode);
        // Example usage of forEach
        List<Integer> list = Arrays.asList(9, 54, 23, 77, 99, 5, 6);
        forEach(list, (Integer i) -> System.out.println(i));
    }

    public static <T> void forEach(List<T> list, Consumer<T> c) {
        for (T t : list) {
            c.accept(t);
        }
    }
}

@FunctionalInterface
interface Consumer<T> {
    void accept(T t);
}

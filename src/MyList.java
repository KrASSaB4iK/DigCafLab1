public class MyList<T> implements WorkWithStudents{
    static class Item<T> {
        private T value;
        private Item<T> next;
    }

    private Item<T> head;
    private Item<T> tail;
    private int len = 0;

    MyList() {
    }

    MyList(T value) {
        add(value);
    }

    MyList (T [] arr) {
        for (T Item : arr) {
            add(Item);
        }
    }

    public T getItem(int index) throws NullPointerException{
        Item<T> item = head;
        for (int i = 0; i < index; i++) {
            item = item.next;
        }
        return item.value;
    }

    public int getLen() {
        return len;
    }

    public void insertAt(T value, int index) throws NullPointerException {
        Item<T> item = head;
        Item<T> newItem = new Item<>();
        newItem.value = value;
        len++;
        for (int i = 0; i < index - 1; i++) {
            item = item.next;
        }
        newItem.next = item.next;
        item.next = newItem;
    }

    public void add(T value) {
        Item<T> item = new Item<>();
        item.value = value;
        item.next = null;
        len++;
        if (head == null) {
            head = item;
            tail = item;
            return;
        }
        tail.next = item;
        tail = item;
    }

    public void prepend(T value) {
        Item<T> item = new Item<>();
        item.value = value;
        item.next = null;
        len++;
        if (head == null) {
            head = item;
            tail = item;
            return;
        }
        item.next = head;
        head = item;
    }

    public void remove(int index) {
        len--;
        if (index == 0) {
            head = head.next;
            return;
        }
        Item<T> item = head;
        if (index == len) {
            for (int i = 0; i < index - 2; i++) {
                item = item.next;
            }
            tail = item;
            item.next = null;
            return;
        }
        for (int i = 0; i < index - 1; i++) {
            item = item.next;
        }
        item.next = item.next.next;
    }

    public void replaceItem(T value, int index) {
        Item<T> item = head;
        for (int i = 0; i < index - 1; i++) {
            item = item.next;
        }
        item.value = value;
    }

    public void printItems() {
        Item<T> item = head;
        for (int i = 0; i < len; i++) {
            System.out.println(item.value);
            item = item.next;
        }
    }
}

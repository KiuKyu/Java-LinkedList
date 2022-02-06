public class MyLinkedList {
    private Node head; // Tạo biến head KDL Node
    private int numNodes; // Tạo biến numNodes với KDL int

    public MyLinkedList(Object data) { // Tạo Constructor có tham số data KDL Object
        head = new Node(data); //
    }

    private class Node { // Lớp Node khai báo bên trong lớp MyLinkedList
        private Node next; // Khai báo biến next với KDL Node
        private Object data; // Khai báo biến data với KDL Object
        public Node(Object data) { // Constructor của lớp Node
            this.data = data;
        }

        public Object getData() {
            return this.data;
        }
    }
//    Cài đặt phương thức add
    public void add(int index, Object data) {
        Node temp = head;
        Node holder;

        for (int i = 0; i < index - 1 && temp.next != null; i++) {
            temp = temp.next;
        }
        holder = temp.next;
        temp.next = new Node(data);
        temp.next.next = holder;
        numNodes++;
    }
//    Phương thức addFirst
    public void addFirst(Object data) {
        Node temp = head;
        head = new Node(data);
        head.next = temp;
        numNodes++;
    }
//    Phương thức get
    public Node get(int index) {
        Node temp = head;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
//    Phương thức printList
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.println(temp.data);
            temp = temp.next;
        }
    }
}

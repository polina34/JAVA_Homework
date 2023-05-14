import java.util.LinkedList;

class Main {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();
        list.add("one");
        list.add("two");
        list.add("three");
        list.add("four");

        LinkedList<String> reversedList = reverseLinkedList(list);

        System.out.println("Original List: " + list);
        System.out.println("Reversed List: " + reversedList);
    }

    public static LinkedList<String> reverseLinkedList(LinkedList<String> list) {
        LinkedList<String> reversedList = new LinkedList<>();

        for (int i = list.size() - 1; i >= 0; i--) {
            reversedList.add(list.get(i));
        }

        return reversedList;
    }
}
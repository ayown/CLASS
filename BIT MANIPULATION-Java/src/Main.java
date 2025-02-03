
public class Main {
    static void fixLists(LinkedList listA, LinkedList listB) {
        Node oddInA = null;
        Node evenInB = null;

        // Search list A for odd number
        Node current = listA.head;
        while (current != null) {
            if (current.data % 2 != 0) {
                oddInA = current;
                break;
            }
            current = current.next;
        }

        // Search list B for even number
        current = listB.head;
        while (current != null) {
            if (current.data % 2 == 0) {
                evenInB = current;
                break;
            }
            current = current.next;
        }

        // Swap the values
        if (oddInA != null && evenInB != null) {
            int temp = oddInA.data;
            oddInA.data = evenInB.data;
            evenInB.data = temp;
        }
    }

    public static void main(String[] args) {
        LinkedList listA = new LinkedList();
        listA.append(2);
        listA.append(4);
        listA.append(7);  // Odd number
        listA.append(8);

        LinkedList listB = new LinkedList();
        listB.append(1);
        listB.append(6);  // Even number
        listB.append(3);
        listB.append(5);

        System.out.println("Before fixing:");
        System.out.println("List A: " + listA.display());
        System.out.println("List B: " + listB.display());

        fixLists(listA, listB);

        System.out.println("\nAfter fixing:");
        System.out.println("List A: " + listA.display());
        System.out.println("List B: " + listB.display());
    }
}

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListExample {
    public static void main(String[] args) {
        List<String> myList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        addToList(myList, scanner);
        System.out.println("My List: " + myList);
        
    }

    public static List<String> addToList(List<String> myList, Scanner scanner) {
        System.out.println("Would you like to add an item to the list? (yes/no)");
        String confirmation = scanner.nextLine();
        while(!confirmation.equalsIgnoreCase("no")) {
            System.out.println("What item would you like to add to this list?");
            myList.add(scanner.nextLine());
            System.out.println("Would you like to add an item to the list? (yes/no)");
            confirmation = scanner.nextLine();
        }
        return myList;
    }
}

public class Node {
    int key;
    Node left, right;

    public Node(int item) {
        key = item;
        left = right = null;
    }
}

public class BinarySearchTree {
    Node root;

    public BinarySearchTree() {
        
    }
}
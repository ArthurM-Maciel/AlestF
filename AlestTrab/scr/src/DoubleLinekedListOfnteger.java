import java.util.HashSet;
import java.util.Set;


public class DoubleLinekedListOfnteger {

    public class App {
        private Node head;
        private Node tail;

        private class Node{
            Integer value;
            Node next;
            Node prev;

        }

        public void removeDuplicata(){
            Node current = head;
            Set<Integer> seen = new HashSet<>();
            while (current != null){
                if (seen.contains(current.value)) {
                    Node next = current.next;
                    remove(current);
                    current = next;
                }else {
                    seen.add(current.value);
                    current = current.next;

                }
            }
        }

        private void remove(Node node){
            if(node ==head){
                head = node.next;
            }
            if (node.prev!= null){
                node.prev.next = node.next;
            }
            if(node.next != null){
                node.next.prev = node.prev;
            }
        }

        public void staticToDynamic(Integer[] staticList) {


        }


    }

}

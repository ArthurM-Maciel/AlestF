import java.util.HashSet;
import java.util.Set;


public class DoubleLinekedListOfnteger {

        private Node head;
        private Node tail;

        private class Node{
            Integer value;
            Node next;
            Node prev;

            Node(Integer value){
                this.value = value;

            }

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
            for( int i = 0; i< staticList.length; i +=2){
                Integer value = staticList[i];
                Integer position = staticList[i+1];

                insertAtPosition(value, position);
            }


        }


    }



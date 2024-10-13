public class App {
        public static void main(String[] args) {
            Integer[] staticList = {70, 2, 30, 9, 20, 3, 50, 7, 60, 0, 80, 5, 10, 1, 100, 6, 90, 8, 40, 4};

            DoubleLinkedListOfInteger doubleLinkedList = new DoubleLinkedListOfInteger();

            doubleLinkedList.staticToDynamic(staticList);

            System.out.println("Lista duplamente encadeada:");
            doubleLinkedList.printList();

            int positionMin = doubleLinkedList.findPositionMin();
            System.out.println("Posição do menor elemento: " + positionMin);

            int valueToRemove = 10;
            doubleLinkedList.removeLowerThan(valueToRemove);
            System.out.println("Lista após remover elementos menores que " + valueToRemove + ":");
            doubleLinkedList.printList();

            int splitIndex = 5;
            DoubleLinkedListOfInteger newList = doubleLinkedList.splitLists(splitIndex);
            System.out.println("Lista original após divisão:");
            doubleLinkedList.printList();
            System.out.println("Nova lista com elementos a partir do índice " + splitIndex + ":");
            newList.printList();
        }
    }

        s.push(s.top() - q.dequeue());
        q.enqueue(q.dequeue() + s.pop());
        q.enqueue(q.head() - s.top());
        s.push(q.dequeue() - s.top());

        System.out.println("Pilha:");
        s.print();
        System.out.println("Fila:");
        q.print();
    }
}
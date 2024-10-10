public class QueueOfInteger {

    private DoubleLinkedListOfInteger list;

    public QueueOfInteger() {

        this.list = new DoubleLinkedListOfInteger();
    }


    /**
     * Retorna o elemento que está no início da fila sem removê-lo.
     * @return Integer o valor do elemento no início da fila.
     */
    public Integer head() {
        if (list.head != null) {
            return list.head.value;
        }
        return null;
    }

    /**
     * Remove e retorna elemento que está no início da fila.
     * @return Integer o valor do elemento no início da fila.
     */
    public Integer dequeue() {
        if (list.head != null) {
            Integer value = list.head.value;
            list.remove(list.head);
            return value;
        }
        return null;
    }

    /**
     * Insere um elemento no final da fila.
     * @param value o valor do elemento a ser inserido na fila
     * @return void
     */
    public void enqueue(Integer value) {
        list.insertAtEnd(value); // Método para inserir no final da lista
    }

}


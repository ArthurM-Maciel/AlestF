public class StackOfInteger {


        private DoubleLinkedListOfInteger list;

        public StackOfInteger() {

                this.list = new DoubleLinkedListOfInteger();
        }

        /**
         * Retorna o elemento que está no topo da pilha
         * @return Integer o valor do elemento no topo da pilha.
         */
        public Integer top() {
                // Considera que o topo da pilha é o último elemento da lista
                if (list.tail != null) {
                        return list.tail.value;
                }
                return null;
        }

        /**
         * Remove e retorna o elemento que está no topo da pilha.
         * @return Integer o valor do elemento removido do topo da pilha.
         */
        public Integer pop() {
                if (list.tail != null) {
                        Integer value = list.tail.value;
                        list.remove(list.tail);
                        return value;
                }
                return null;
        }

        /**
         * Insere um elemento no topo da pilha.
         * @param value o valor do elemento a ser inserido na pilha.
         */
        public void push(Integer value) {
                list.insertAtEnd(value); // Método para inserir no final da lista
        }

    }


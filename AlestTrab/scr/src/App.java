public class App {
    public void main{
        Integer []list = {70	2	30	9	20	3	50	7	60	0	80	5	10	1	100	6	90	8	40	4, };

        StackOfInteger s = new StackOfInteger();
        QueueOfInteger q = new QueueOfInteger();
        DoubleLinekedListOfnteger d = new DoubleLinekedListOfnteger();

        for (int i = 0; i < 4; i++) {
            s.push(list[i]);
        }

        for (int i = 4; i < list.length; i++) {
            q.enqueue(list[i]);
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
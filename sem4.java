// Реализуйте очередь с помощью LinkedList со следующими методами:
// • enqueue() — помещает элемент в конец очереди,
// • dequeue() — возвращает первый элемент из очереди и удаляет его,
// • first() — возвращает первый элемент из очереди, не удаляя


import java.util.*;

public class sem4 {
    public static class Que {
        private LinkedList<Integer> queue;
    
        public Que() {
            queue = new LinkedList<>();
        }
    
        public void enqueue(int data) {
            queue.addLast(data);
        }
    
        public int dequeue() {
            return queue.removeFirst();
        }
    
        public int first() {
            return queue.getFirst();
        }
    }

    public static void main(String[] args) {
        Que qq = new Que();
        qq.enqueue(101);
        qq.enqueue(201);
        qq.enqueue(301);

        System.out.println(qq.first());
        qq.dequeue();

        System.out.println(qq.first());
    }
}

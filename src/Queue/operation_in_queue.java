package Queue;


public class operation_in_queue {

         int arr[];
         int size;
         int rear;

        operation_in_queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
        }

        boolean isEmpty() {
            return rear == -1;
        }

        void add(int data) {
            if (rear == size - 1) {
                System.out.println("Queue is full");
                return;
            }
            rear = rear + 1;
            arr[rear] = data;
        }

        int remove() {
            if (isEmpty()) {
                System.out.println("Empty Queue");
                return -1;
            }
            int front = arr[0];
            for (int i = 0; i < rear; i++) {
                arr[i] = arr[i + 1];
            }
            rear = rear - 1;
            return front;
        }

         int peek() {
            if (isEmpty()) {
                System.out.println("Queue is empty");
                return -1;
            }
            return arr[0];
        }


        public static void main(String[] args) {
            operation_in_queue q = new operation_in_queue(7);
            q.add(1);
            q.add(2);
            q.add(3);
            while (!q.isEmpty()) {
                System.out.println(q.peek());
                q.remove();

            }
        }
    }



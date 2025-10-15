
import java.util.*;

class que {

    int size;
    int front, rea;
    int[] q;

    que(int s) {
        size = s;
        front = -1;
        rea = -1;
        q = new int[size];
    }

    int elementCount() {
        if (front == -1) {
            return 0;
        }else if (rea >= front) {
            return rea - front + 1;
        }else {
            return size - front + rea + 1;
        }
    }

    void Enq(int x) {
        System.out.println("");

        if ((front == 0 && rea > size) || front == rea + 1) {
            System.out.println("Queue is Full.");
        } else {
            if (rea > size) {
                rea = 0;
            } else {
                rea++;
                q[rea] = x;
            }
            if (front < 0) {
                front = 0;
            }
        }
        System.out.print("Front: " + front + "\tRear: " + rea + "\t\tElements: " + elementCount());
    }

    void Deq(int j) {
        if (front < 0) {
            System.out.println("The queue is Empty.");
        } else {
            if (front == rea) {
                j = q[front];
                front = rea = -1;
            } else {
                j = q[front];
                front++;
            }
        }
        System.out.println("\nFront: " + front + "\tRear: " + rea + "\t\tElements: " + elementCount());
    }
}

public class queue {

    public static void main(String[] args) {
        System.out.print("Enter the size of queue: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        sc.close();
        que obj = new que(size);
        obj.Enq(10);
        obj.Enq(20);
        obj.Enq(30);
        obj.Enq(40);
        obj.Deq(0);
    }
}

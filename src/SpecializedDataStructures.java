import java.util.BitSet;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Stack;

public class SpecializedDataStructures {

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(1);
        stack.push(-341);
        System.out.println(stack);

        Queue<Integer> priorityQueue = new PriorityQueue<>();
        priorityQueue.addAll(stack);
        System.out.println(priorityQueue);

        BitSet bitSet = new BitSet(10);
        bitSet.set(1);
        bitSet.set(2);
        bitSet.set(3);
        bitSet.set(4);
        bitSet.set(1);
        bitSet.set(2);
        System.out.println(bitSet);





    }
}

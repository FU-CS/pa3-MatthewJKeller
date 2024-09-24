package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class QueueTest {  
    @Test
    public void testEnqueue() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        assertEquals(node1, queue.dequeue());
    }

    @Test
    public void testDequeue() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        assertEquals(node1, queue.dequeue());
        assertEquals(node2, queue.dequeue());
    }

    @Test
    public void testIsEmpty() {
        Queue queue = new Queue();
        assertTrue(queue.isEmpty());
        Node node1 = new Node(4);
        queue.enqueue(node1);
        assertFalse(queue.isEmpty());
        queue.dequeue();
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueEmpty() {
        Queue queue = new Queue();
        assertNull(queue.dequeue());
    }

    

    @Test
    public void testEnqueueDequeueSingle() {
        Queue queue = new Queue();
        Node node = new Node(1);
        queue.enqueue(node);
        assertEquals(node, queue.dequeue());
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testEnqueueDequeueResize() {
        Queue queue = new Queue();
        for (int i = 0; i < 15; i++) {
            queue.enqueue(new Node(i));
        }
        for (int i = 0; i < 15; i++) {
            assertEquals(i, queue.dequeue().value);
        }
        assertTrue(queue.isEmpty());
    }
    @Test
    public void testEnqueueDequeueBig() {
        Queue queue = new Queue();
        for (int i = 0; i < 100; i++) {
            queue.enqueue(new Node(i));
        }
        for (int i = 0; i < 100; i++) {
            assertEquals(i, queue.dequeue().value);
        }
        assertTrue(queue.isEmpty());
    }

    

    @Test
    public void testEnqueueNull() {
        Queue queue = new Queue();
        queue.enqueue(null);
        assertNull(queue.dequeue());
        assertTrue(queue.isEmpty());
    }

    @Test
    public void testDequeueAfterEmpty() {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(5);
        queue.enqueue(node1);
        queue.enqueue(node2);
        queue.dequeue();
        queue.dequeue();
        assertNull(queue.dequeue());
    }
}

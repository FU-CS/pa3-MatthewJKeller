
package pa3;

/**
 * A queue of nodes.
 */
public class Queue {
    Node[] queue;
    int currSize;
    /** 
     * Constructs an empty queue.
     */
    public Queue() {
        this.queue = new Node[10];
        currSize = 0;
    }

    /**
     * Adds a node to the queue.
     * @param node
     */
    public void enqueue(Node node) {
        if (queue[0] == null){
            queue[0] = node;
        }
        else {
            if(currSize+1 == queue.length){
                Node[] newQueue = new Node[currSize*2];
                for(int i=0; i<currSize; i++){
                    newQueue[i] = queue[i];
                }
                queue = newQueue;
            }
            queue[currSize]= node;     
            }
        currSize++; 
        }

    /**
     * Removes and returns the node at the front of the queue.
     * @return the node at the front of the queue.
     */
    public Node dequeue() {
        if(queue[0] == null){
            System.out.println("Queue empty");
            return null;
        }
        Node value = queue[0];
        for(int i=0; i<queue.length-1; i++){
            queue[i] = queue[i+1];
        }
        currSize--;
        return value;
    }

    /**
     * Returns true if the queue is empty.
     * @return true if the queue is empty.
     */
    public boolean isEmpty() {
        if (queue[0] == null) {
            return true;
        }
        else{
            return false;
        }
    }
    
    public static void main(String[] args) {
        Queue queue = new Queue();
        Node node1 = new Node(4);
        Node node2 = new Node(4);
        queue.enqueue(node1);
        queue.enqueue(node2);
        System.out.println(queue.dequeue().value); // Should print 4
    }
    
}

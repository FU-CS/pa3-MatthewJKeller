package pa3;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    public void testLevelOrderTraversal() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        assertEquals("1 2 3 4 5 6 7 ", tree.levelOrderTraversal());
    }

    @Test
    public void testLevelOrderTraversalEmpty() {
        BinaryTree tree = new BinaryTree();
        assertEquals("", tree.levelOrderTraversal());
    }

    @Test
    public void testLevelOrderTraversalSingle() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        assertEquals("1 ", tree.levelOrderTraversal());
        assertEquals(0, tree.getHeight());

    }

    @Test
    public void testLevelOrderTraversalUnbalanced() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        assertEquals("1 2 3 4 ", tree.levelOrderTraversal());
    }

    @Test
    public void testAddDup() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(1);
        assertEquals("1 1 ", tree.levelOrderTraversal());
    }

    @Test
    public void testGetHeightUnbalanced() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        tree.add(8);
        assertEquals(3, tree.getHeight());
    
      
    }

    @Test
    public void testGetHeightBalanced() {
        BinaryTree tree = new BinaryTree();
        tree.add(1);
        tree.add(2);
        tree.add(3);
        tree.add(4);
        tree.add(5);
        tree.add(6);
        tree.add(7);
        assertEquals(2, tree.getHeight());
    }
    @Test
    public void testEmptyHeight(){
        BinaryTree tree = new BinaryTree();
        assertEquals(0, tree.getHeight());
    }
}

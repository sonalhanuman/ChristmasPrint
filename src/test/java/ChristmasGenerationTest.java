import org.junit.Test;

import static org.junit.Assert.*;

public class ChristmasGenerationTest {

    @Test
    public void treeList1layer() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
        assertEquals("The tree must have more than one layer", christmasGeneration.generateTree(1));
    }

    @Test
    public void treeList2layer() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
        assertEquals("><", christmasGeneration.generateTree(2));
    }

    @Test
    public void treeList4layer() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
        assertEquals("><", christmasGeneration.generateTree(4));
    }

    @Test
    public void treeList6layer() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
        assertEquals("><", christmasGeneration.generateTree(6));
    }

    @Test
    public void treeList10layer() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
        assertEquals("><", christmasGeneration.generateTree(10));
    }

    @Test
    public void treeList30layer() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
        assertEquals("><", christmasGeneration.generateTree(30));
    }
}
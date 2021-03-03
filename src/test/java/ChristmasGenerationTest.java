import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.*;

public class ChristmasGenerationTest {

    @Test
    public void generateTreeWith1ShouldReturnErrorMessage() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
        assertEquals("The tree must have more than one layer", christmasGeneration.generateTree(1));
    }

    @Test
    public void generateTreeWith2ShouldReturnTreeWithTwoLayers() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
        ArrayList<String> twoLayerList = new ArrayList<>();
        twoLayerList.add("><");
        twoLayerList.add("**");

        var actualTree = christmasGeneration.generateTree(2);

        assertEquals(twoLayerList, actualTree);
    }

    @Test
    public void generateTreeWith4ShouldReturnTreeWithFourLayers() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
//         assertEquals("><", christmasGeneration.generateTree(4));
    }

    @Test
    public void generateTreeWith6ShouldReturnTreeWithSixLayers() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
//         assertEquals("><", christmasGeneration.generateTree(6));
    }

    @Test
    public void generateTreeWith10ShouldReturnTreeWithTenLayers() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
//         assertEquals("><", christmasGeneration.generateTree(10));
    }

    @Test
    public void treeList30layer() {
        ChristmasGeneration christmasGeneration = new ChristmasGeneration();
//         assertEquals("><", christmasGeneration.generateTree(30));
    }
}
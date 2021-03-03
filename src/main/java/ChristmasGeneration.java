import java.util.ArrayList;
import java.util.List;

public class ChristmasGeneration {
    private static final String stars = "*";
    private static final String trunk = "|";

    public Object generateTree(int layer) {
        List<String> treeLayerList = new ArrayList<>();
        int maxLength = ((layer-1) * 2);
        int i;
        if (layer <= 1) {
            String message = "The tree must have more than one layer";
            return message;
        }
        for(i = 0; i<layer; i++){
            if (i == 0) {
                String starLayerLeft = padLeft (">", (layer - 1));
                String starLayerRight = padRight ("<", (layer - 1));
                String starLayer = starLayerLeft + starLayerRight;
                treeLayerList.add(starLayer);
            } else {
                int j;
                String starLayer = new String();
                for (j = 0; j< i; j++) {
                    if (j == 0) {
                        starLayer = stars;
                    } else {
                        starLayer = starLayer + "*";
                    }
                }
                String starLayerLeft = padLeft(starLayer, (layer - 1));
                String starLayerRight = padRight(starLayer, (layer - 1));
                starLayer = starLayerLeft + starLayerRight;
                treeLayerList.add(starLayer);
            }
        }

        if (layer >= 3) {
            int trunkLength = layer / 3;
            int k;
            String trunkLayer = new String();
            for (k = 0; k< trunkLength; k++) {
                if (k == 0) {
                    trunkLayer = trunk;
                } else {
                    trunkLayer = trunkLayer + "|";
                }
            }
            String trunkLayerLeft = padLeft(trunkLayer, (layer - 1));
            String trunkLayerRight = padRight(trunkLayer, (layer - 1));
            trunkLayer = trunkLayerLeft + trunkLayerRight;
            treeLayerList.add(trunkLayer);
            treeLayerList.add(trunkLayer);
        }
        for(int l=0;l<treeLayerList.size();l++){
            System.out.println(treeLayerList.get(l));
        }
        return treeLayerList;
    }

    public static String padRight(String s, int n) {
        return String.format("%-" + n + "s", s);
    }

    public static String padLeft(String s, int n) {
        return String.format("%" + n + "s", s);
    }
}

package gol;

import java.util.ArrayList;
import java.util.List;

public class Universe {

    private List<GolCell> allCell =new ArrayList<>();

    public void add(GolCell liveCell) {
        allCell.add(liveCell);
    }

    public void nextIteration() {
    }

    public GolCell cellAt(int x, int y) {
        for(GolCell c:allCell)
        {
            if(c.getX() == x && c.getY() == y)
                return c;
        }
        return null;
    }

}

package gol;

import org.junit.Assert;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

/**
 * Created by Piyuri on 11/13/2016.
 */
public class MainTest
{
    @Test
    public void aLiveCellWithNoNeigborDies()
    {
        //given
        Universe universe = new Universe();
        GolCell liveCell = new GolCell(true);
        universe.add(liveCell);

        //when
        universe.nextIteration();

        //than
        Assert.assertFalse(liveCell.isAlive());

    }

    @Test
    public void aLiveCellWithOneNeighborDies()
    {
        //given
        Universe universe = new Universe();
        GolCell liveCell = new GolCell(true, 0, 0);
        GolCell neighborCell = new GolCell(true, 1, 0);
        universe.add(liveCell);
        universe.add(neighborCell);

        //when
        universe.nextIteration();

        //than
        Assert.assertFalse(universe.cellAt(0, 0).isAlive());
        Assert.assertFalse(universe.cellAt(1, 0).isAlive());

    }
}
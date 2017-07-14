package com.piyuri.test;

import static org.junit.Assert.*;

import piyuri.com.java.Cell;
import piyuri.com.java.Cell.CellState;

import org.junit.Test;

import piyuri.com.java.Universe;

public class UniverseTest {

	private static final CellState O = CellState.DEAD;
	private static final CellState X = CellState.ALIVE;

	@Test
	public void initialState() {
		new Universe(new CellState[][]{});
		CellState[][] original = new CellState[][]{
			{X,O,X},
			{O,O,O},
			{O,X,X}
		};
		Universe test=new Universe(original);
		CellState[][] actual=test.getState();
		assertArrayEquals(original, actual);
	} 
	
	@Test
	public void universeShouldUpdateTest()
	{CellState[][] original = new CellState[][]{{X}};
	Universe test=new Universe(original);
	test.update();
	CellState[][] actual=test.getState();
	assertEquals(CellState.DEAD, actual[0][0]);
		
	}
	
	@Test
	public void shouldUpdateAllState()
	{
		Universe init=new Universe(new CellState[][]{
			{O,X,X},
			{X,O,X},
			{X,X,X}
		});
		
		CellState[][] expected = new CellState[][]{
			{O,X,O},
			{X,O,O},
			{O,X,O}
		};
		
		init.update();
		init.getNumberOfAliveNeighbour(2, 0);
		System.out.println(init.getNumberOfAliveNeighbour(2, 0));
		CellState[][] actual=init.getState();
		assertArrayEquals(expected, actual);
		
	}

}

package com.piyuri.test;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;

import junitparams.JUnitParamsRunner;
import piyuri.com.java.Cell;
import piyuri.com.java.Cell.CellState;


@RunWith(JUnitParamsRunner.class)
public class TestForGame {

	@Test
	public void shouldDieWithOnlyOneNeighbour() {
		Cell cell=new Cell(Cell.CellState.ALIVE);
		CellState actual=cell.getNextState(1);
		assertEquals(Cell.CellState.DEAD, actual);
		
		
	}
	
	
	@Test
	public void shouldDieWIrthZeroNeighbour()
	{
		Cell cell=new Cell(Cell.CellState.ALIVE);
		cell.update(0);
		CellState actual=cell.getState();
		  
		assertEquals(Cell.CellState.DEAD, actual);
		}

	@Test
	public void shouldLiveWIthTwoNeighbour()
	{
		Cell cell=new Cell(Cell.CellState.ALIVE);
		CellState actual=cell.getNextState(2);
		assertEquals(Cell.CellState.ALIVE, actual);
		} 

	@Test
	public void shouldDieWIthThreeNeighbour()
	{
		Cell cell=new Cell(Cell.CellState.ALIVE);
		CellState actual=cell.getNextState(3);
		assertEquals(Cell.CellState.ALIVE, actual);
		} 
	

	@Test
	public void shouldDieWIthFourNeighbour()
	{
		Cell cell=new Cell(Cell.CellState.ALIVE);
		CellState actual=cell.getNextState(4);
		assertEquals(Cell.CellState.DEAD, actual);
		} 
	@Test
	public void souldBecomeLiveWithTwoNeighbour()
	{
		Cell cell=new Cell(Cell.CellState.DEAD);
		CellState actual=cell.getNextState(2);
		assertEquals(Cell.CellState.ALIVE, actual);

	}
	@Test
	public void shouldReturnItsState()
	{
		Cell cell=new Cell(CellState.ALIVE);
		
		assertEquals(CellState.ALIVE, cell.getState());
	}
	
	
}

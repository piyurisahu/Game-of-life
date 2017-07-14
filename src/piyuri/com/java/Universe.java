package piyuri.com.java;

import piyuri.com.java.Cell.CellState;

public class Universe {

	private Cell[][] state;

	public Universe(CellState[][] cellStates) {
		state = new Cell[cellStates.length][];
		for (int row = 0; row < cellStates.length; row++) {
			state[row] = new Cell[cellStates[row].length];
			for (int col = 0; col < cellStates[row].length; col++) {
				state[row][col] = new Cell(cellStates[row][col]);
			}
		}
	}

	public CellState[][] getState() {
		CellState[][] cellStates = new CellState[state.length][];
		for (int row = 0; row < state.length; row++) {
			cellStates[row] = new CellState[state[row].length];
			for (int col = 0; col < state[row].length; col++) {
				cellStates[row][col] = state[row][col].getState();
			}
		}
		return cellStates;
	}

	public void update() {
		for (int row = 0; row < state.length; row++) {
			
			for (int col = 0; col < state[row].length; col++) {
				int numberOfAliveNeighbour=getNumberOfAliveNeighbour(row,col);
				System.out.printf("number of neighbor in a[%d][%d]",row,col);
				System.out.println(numberOfAliveNeighbour);
				state[row][col].update(numberOfAliveNeighbour);
			}
		}
		
	}

	public int getNumberOfAliveNeighbour(int row, int col) {
		int numberOfAliveNeighbor=0;
		if(row>0)
		{
			 int rowAbove = row-1;
			 if(col>0)
			 {
				 if(state[rowAbove][col-1].getState()==CellState.ALIVE) numberOfAliveNeighbor++;
			 }
			 if(state[rowAbove][col].getState()==CellState.ALIVE) numberOfAliveNeighbor++;
			 if(col<state[row].length-1)
			 {
				 if(state[rowAbove][col+1].getState()==CellState.ALIVE) numberOfAliveNeighbor++;
			 }
		}
		
		

		if(col>0)
		{
			if(state[row][col-1].getState()==CellState.ALIVE) numberOfAliveNeighbor++;
		}
		
		
		if(col<state[row].length-1)
		{
			if(state[row][col+1].getState()==CellState.ALIVE) numberOfAliveNeighbor++;
		}
		
		
		if(row<state.length-1)
		{
			int rowBelow=row+1;
			 if(col>0)
			 {
				 if(state[rowBelow][col-1].getState()==CellState.ALIVE) numberOfAliveNeighbor++;
			 }
			 if(state[rowBelow][col].getState()==CellState.ALIVE) numberOfAliveNeighbor++;
			 if(col<state[row].length-1)
			 {
				 if(state[rowBelow][col+1].getState()==CellState.ALIVE) numberOfAliveNeighbor++;
			 }
			
		}
		
		
		
		
		return numberOfAliveNeighbor;
	}
	

	
}
package piyuri.com.java;

import piyuri.com.java.Cell.CellState;

public class Cell {
	
	private CellState state;

	public Cell(CellState alive) {
		// TODO Auto-generated constructor stub
		this.state=alive;
	}

	public enum CellState
	{
		ALIVE,DEAD;
	}

	public CellState getNextState(int i) {
		if(i==2 || i==3)
			return CellState.ALIVE;
		
		return CellState.DEAD;
		// TODO Auto-generated method stub
		
	}

	public CellState getState() {
		// TODO Auto-generated method stub
		return state;
	}


		// TODO Auto-generated method stub
		public void update(int i) {
			if (state == CellState.ALIVE) {
				state = i > 1 && i < 4 ? CellState.ALIVE : CellState.DEAD;
			} else {
				state = i == 3 ? CellState.ALIVE : CellState.DEAD;
			}
	}

}

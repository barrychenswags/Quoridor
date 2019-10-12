package ca.mcgill.ecse223.quoridor.controller;

import ca.mcgill.ecse223.quoridor.controller.TOWall.Orientation;

public class TOWallCandidate {
	
	/**
	 * This is the Wall Candidate class. The constructor creates a 
	 * 
	 * 
	 * @author Alixe Delabrousse
	 * 
	 * 
	 */

    private Orientation orientation;
    private int row;
    private int column;
    
    TOWallCandidate(Orientation orientation, int row, int column) {
    	
    	this.orientation = orientation;
    	this.row = row;
    	this.column = column;
    }
    
    public int getRow() {
    	return this.row;
    }
    
    public void setRow(int row) {
    	this.row = row;
    }
    
    public int getColumn() {
    	return this.column;
    }
    
    public void setColumn(int column) {
    	this.column = column;
    }
}

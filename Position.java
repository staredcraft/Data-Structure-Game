public class Position 
{
    	protected int row,
                      column;
            

	/**
         * Initializes this Position object to (0, 0).
         */    	
        public Position () 
	{
        	row = 0;
        	column = 0;
    	} // default constructor


	/**
         * Initializes this Position object to (row, column).
         *
         * @param row the row this Position object has been initialized to.
         * @param column the column this Position object has been initialized to.
         */
    	public Position (int row, int column) 
	{
        	this.row = row;
        	this.column = column;
    	} // constructor


	/**
         * Determines the row of this Position object.
         *
         * @return the row of this Position object.
         */
    	public int getRow () 
	{
        	return row;
    	} // method getRow


	/**
         * Determines the column of this Position object.
         *
         * @return the column of this Position object.
         */    	
        public int getColumn () 
	{
        	return column;
    	} // method getColumn
 public void setColumn (int col) 
    	{
            	this.column=col;
        	} 
        
        public void setRow (int ro) 
    	{
            	this.row=ro;
        	} 

} // class Position

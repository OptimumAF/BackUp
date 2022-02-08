public class MagicSquare{
		/* A magic square is a square in which the sum of each row, column, and main diagonal are equal.*/

    private int[][] square; // n x n 2D array
    private int n; // number of rows(or columns) of square
    /** write a constructor that accepts a 2d array
        Precondition: Assume that square is a square(number of rows = number of columns) 2D array. Assume also that the values in square are in the range 1 - n^2. 
    */
    public MagicSquare(int[][] a){
		square = a;
    }



    /** Returns row sum of the row given by the parameter r
        Precondition: 0 <= r < number of rows of square
    */
    public int rowSum(int r){
    	int total = 0;
    	for (int i = 0; i < square.length; i++){
        	total += square[r][i];
		}
		return total; 
    }
    /** Returns column sum of the column given by the parameter c
        Precondition: 0 <= c < number of columns of square
    */
    public int colSum(int c){
    	int total = 0;
    	for (int i = 0; i < square[c].length; i++){
    		total += square[i][c];
    	}
    	return total;
    }
    /**
    Returns whether both the diagonal sums are equal to the parameter sum. 
    */
    public boolean diagSums(int sum){
    	int diagTotal = 0; 
        for (int i = 0; i<square.length; i++){
        	if(i>square[i].length){
        		diagTotal+=0;
			}
        	else {
        		diagTotal+=square[i][i];
        	}
		}
        int diagTotalI = 0;
        int j = square[0].length-1;
        for (int m = 0; m<square.length; m++){
        	if(j>square[m].length){
    			diagTotal+=0;
			}
        	else {
        		diagTotalI += square[m][j];
        		j--;
			}
		}
        return diagTotal == sum && diagTotalI == sum; 
    }
    /**
    Precondition: Values of square is in range 1 to n^2.
    Returns true if the numbers 1 to n^2 occurs exactly once in square and false otherwise. 
    */
    public boolean exactlyOnce(){
		int totalNumbers = 0;
        
    	for (int i = 0; i< square.length; i++){
        	for(int j = 0; j< square[i].length; j++){
        		totalNumbers++;
			}
		}
		for(int p = 1; p<=totalNumbers; p++){
        	int count = 0;
			for(int m = 0; m<square.length; m++){
				for(int n = 0; n<square[m].length; n++){
					if (p == square[m][n]) {
						count++;
					}
              		if (count >1){
                		return false;
					}
				}
			}
        	if(count == 0){
        		return false;
			}
    	return true;
		}
	}
    /**
    Using all of the helper methods above. Implement isMagic() below so that
    it returns true if square is magic and false otherwise.  
    */
    public boolean isMagic(){
		return exactlyOnce() == true && diagSums(34) == true;
    }

}
package proj02.part3;

public class FindSam {

	private int numOfRows;
	private int numOfColumn;
	private int maxValue;
	private int[][] map;
	private int samsRow;
	private int samsColumn;
	private boolean isFoundSam;
	
	public FindSam(int numOfRows, int numOfColumn) {
		this.numOfRows = numOfRows;
		this.numOfColumn = numOfColumn;
		this.map = new int[this.numOfRows][this.numOfColumn];
		this.isFoundSam = false;
	}
	
	public FindSam(int[][] map) {
		this.map = map;
		this.numOfRows = map.length;
		this.numOfColumn = map[0].length;
		this.isFoundSam = false;
	}
	
	public void setMap(int[][] map) {
		this.map = map;
	}
	
	public void setCoordinateData(int row, int column, int IQ) {
		try {
			this.map[row][column] = IQ;
		} catch (Exception e) {
			System.err.println("The coordinate is out of the map.");
		}
	}
	
	private void findSam() {
		if (!this.isFoundSam) {
			this.maxValue = Integer.MIN_VALUE;
			for (int i = 0; i < this.map.length; i++) {
				for (int j = 0; j < this.map.length; j++) {
					if (this.maxValue < this.map[i][j]) {
						this.maxValue = this.map[i][j];
						this.samsRow = i;
						this.samsColumn = j;
					}
				}
			}
			this.isFoundSam = true;
		}
	}

	public int getNumOfRows() {
		return numOfRows;
	}

	public int getNumOfColumn() {
		return numOfColumn;
	}

	public int getMaxValue() {
		if (!this.isFoundSam) {
			findSam();
		}
		return maxValue;
	}

	public int getSamsRow() {
		if (!this.isFoundSam) {
			findSam();
		}
		return samsRow;
	}

	public int getSamsColumn() {
		if (!this.isFoundSam) {
			findSam();
		}
		return samsColumn;
	}

	public int[][] getMap() {
		return map;
	}
	
}

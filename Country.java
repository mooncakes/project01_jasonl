package project01_jasonlDropbox;

public class Country {
	
	private double[] dataList;
	public String name;
	public int startingYear;
	
	public Country(String name, double[] data) {
		this.name = name;
		this.dataList = data;
	}
	
	public double[] getData() {
		return this.dataList;
	}
	
	public void setStartingYear(int year) {
		this.startingYear = year;
	}
	
	public double getNumberOfSubscriptions(int startYear, int endYear) {
		double sum = 0.0;
		int startIndex = startYear - startingYear;
		int endIndex = endYear - startingYear;
		if (startIndex < 0) {
			System.out.println("ERROR : requested year " + startYear + " is less than " + this.startingYear);
			return -1.00;
		}
		if (endYear > 2014) {
			System.out.println("ERROR : requested year " + endYear + " is greater than the current year");
		}
		for (int i = startIndex; i < endIndex + 1; i++) {
			sum += dataList[i];
		}
		
		return Math.round(sum * 100.0) / 100.0;
		
	}
	

}

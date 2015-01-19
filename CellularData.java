package project01_jasonlDropbox;

import java.util.ArrayList;

public class CellularData {
	
	private int startingYear;
	private int numRows;
	private int numColumns;
	public ArrayList<Country> countriesList = new ArrayList<Country>();
	
	
	public CellularData(int numRows, int numColumns, int startingYear) {
		this.numRows = numRows;
		this.numColumns = numColumns;
		this.startingYear = startingYear;
	}
	
	public double getNumSubscriptionsInCountryForPeriod(String countryName, int firstYear, int endYear) {
		for (int i = 0; i < countriesList.size(); i++) {
			if (countriesList.get(i).name.equals(countryName)) {
				return countriesList.get(i).getNumberOfSubscriptions(firstYear, endYear);
			}
		}
		return 0.0;
		
	}
	
	public void addCountry(String country, double[] data) {
		Country newCountry = new Country(country, data);
		newCountry.setStartingYear(this.startingYear);
		countriesList.add(newCountry);
		
	}
		
	public int getNumRows() {
		return this.numRows;
	}
	
	public int getNumColumns() {
		return this.numColumns;
		
	}
	
	public int getStartingYear() {
		return this.startingYear;
	}
	
	public String toString() {
		String answer = String.format("%-11s %-5s", "Countries", "Year");
		for (int j = 0; j < getNumColumns(); j++) {
			answer += String.format(" %-5d", this.startingYear + j);
		}
		answer += "\n";
		for (int i = 0; i < this.countriesList.size(); i++) {
			answer += String.format("%-11s", countriesList.get(i).name) + "      ";
			for (int j = 0; j < getNumColumns(); j++) {
				answer += String.format(" %-5.2f", countriesList.get(i).getData()[j]);
			}
			answer += String.format(" \n");
		}
		return answer;
	}

}


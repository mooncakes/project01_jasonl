package project01_jasonlDropbox;

/**
 *  Tests the CellularData class by reading in one dimensional arrays of countries.
 *  Given a country name and a range of years, computes the total number of subscriptions
 *  during that period.
 */
public class TestCellularData {

	public static void main(String[] args) 
	{
		System.out.println("Part 1 with Partial Data:");
		double[] canadaPartial = {0,0,0.05,0.23,0.37,0.75,1.26};
		double[] mexicoPartial = {0,0,0,0,0,0,0.01};
		double[] usaPartial = {0,0,0.14,0.28,0.5,0.83,1.39};
		
		int startingYear = 1983;
		
		CellularData datatable;
		int numRows = 3;
		int numColumns = canadaPartial.length;
		
		datatable = new CellularData(numRows, numColumns, startingYear);
		
		datatable.addCountry("canada", canadaPartial);
		datatable.addCountry("mexico", mexicoPartial);
		datatable.addCountry("usa", usaPartial);		
		
		System.out.println(datatable);
		// the output is:
		// Country	Year	1983	1984	1985	1986	1987	1988	1989	
		// canada			0		0		0.05	0.23	0.37	0.75	1.26	
		// mexico			0		0		0		0		0		0		0.01	
		// usa				0		0		0.14	0.28	0.50	0.83	1.39	
		// Note: As long as your output is easily readable,
		//		 Then the alignment (i.e. tabs and white-space) of your output need not match mine.
		

		System.out.printf("usa (1983 to 1989): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("usa",1983,1989));
		// country is "usa", subscriptions from 1983 to 1989
		// the output is: 
		// usa (1983 to 1989): 3.14
		// Note: Due to round off errors, your answer may be close to 3.14
		
		System.out.printf("mexico (1983 to 1989): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("mexico",1983,1989));
		// country is "mexico", subscriptions from 1983 to 1989
		// the output is:
		// mexico (1983 to 1989): 0.01
		
		System.out.printf("canada (1890 to 2000): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("canada",1890, 2000));
		// testing out-of-bounds data
		// ERROR : requested year 1890  is less than 1983
		// canada (1890 to 2000): -1.00
		
		
		// Part 2
		System.out.println("\n\nPart 2 with All Data:");
		final double[] canada = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.046433382,0.229211886,0.370663166,0.752880479,1.264765577,2.110674786,2.769888481,3.621301434,4.648371087,6.435664704,8.840378661,11.82226558,14.04583637,17.73689555,22.72196984,28.42909462,34.36625958,37.94941948,42.07126881,47.06386648,52.75959279,57.49320536,61.47310755,66.20487722,70.54830532,75.676078,79.41215888,80.05046389};
		final double[] mexico = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.001815204,0.010079818,0.074266061,0.183067275,0.348322481,0.421293924,0.608553991,0.721767371,1.051320868,1.758956617,3.326889843,7.556565917,13.55289414,20.65462731,24.29476815,27.85371761,35.15321825,42.56115672,49.40875353,58.62729509,65.49948112,71.45817512,77.51826326,79.24118294,83.35070827};
		final double[] usa = {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0.038253436,0.140659444,0.279060364,0.498659917,0.829863407,1.39281703,2.075802366,2.939643902,4.249049037,6.103716586,9.104921407,12.6047249,16.23815248,20.14238484,24.89063952,30.57610298,38.46809105,44.69057874,48.85103822,54.84681409,62.54719598,68.31769507,76.29353842,82.06414479,85.20916517,88.62364611,91.31165202,94.71891668,95.44786574};
		
		startingYear = 1960;
		
		numRows = 3;
		numColumns = canada.length;
		
		datatable = new CellularData(numRows, numColumns, startingYear);
		
		datatable.addCountry("canada", canada);
		datatable.addCountry("mexico", mexico);
		datatable.addCountry("usa", usa);
		
		System.out.println(datatable);
		// For an example output refer to part 1. However, note that the startingYear is different.

		System.out.printf("usa (1983 to 1989): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("usa",1983,1989));
		// country is "usa", subscriptions from 1983 to 1989
		// the output is:
		// usa (1983 to 1989): 3.18

		System.out.printf("mexico (1960 to 2000): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("mexico",1960,2000));
		// country is "mexico", subscriptions from 1960 to 2000
		// the output is:
		// mexico (1960 to 2000): 29.62
		
		System.out.printf("canada (1890 to 2000): %.2f \n", datatable.getNumSubscriptionsInCountryForPeriod("canada",1890, 2000));
		// For an example output refer to part 1. 
		// Note: Make sure to test for other invalid requests for range of years.
	}
}

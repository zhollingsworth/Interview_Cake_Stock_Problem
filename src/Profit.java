/*****************************************************************
Zac Hollingsworth
4/2/2016

Interview Cake
https://www.interviewcake.com/question/java/stock-price

Problem:
Suppose we could access yesterday's stock prices as an array, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500.

Write an efficient function that takes stockPricesYesterday and returns the best profit I could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

No "shorting"—you must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass).
*******************************************************************/

public class Profit {
	int max;
	int min;
	int[] stockPricesYesterday = new int[]{10,7,5,8,11,9};
	
	public int getMaxProfit(int[] a)
	{
		for(int i = 1; i <= a.length; i++)
		{
			max = (a[i] > max) ? a[i]:max;
			min = (a[i] < min) ? a[i]:min;	
		}
		
		return max - min;
	}
	
}

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
	
	public static int getMaxProfit(int[] a)
	{
		int  max = 0;
		int trueMax = 0;
		int  min = 0;
		
		for(int i = 1; i < a.length; i++)
		{
			max = (a[max] < a[i] && (i < min)) ? i:max;
			trueMax = (a[trueMax] < a[i]) ? i:trueMax;
			min = (a[i] < a[min]) ? i:min;
		}
		max = ((a[trueMax] > a[max]) && (trueMax < min)) ? trueMax:max;
		return a[max] - a[min];
	}
	
	public static void main(String[] args)
	{
		int[] stockPricesYesterday = new int[]{10,7,5,8,11,4,9};
		int[] stockPricesYesterday2 = new int[]{10,7,5,8,4,11,4,9};
		System.out.println("Best profit = "+getMaxProfit(stockPricesYesterday));
		System.out.println("Best profit = "+getMaxProfit(stockPricesYesterday2));
	}
}

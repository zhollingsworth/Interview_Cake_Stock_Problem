/********************************************************************************************************************************
Zac Hollingsworth
4/2/2016

Interview Cake
https://www.interviewcake.com/question/java/stock-price

Problem:
Suppose we could access yesterday's stock prices as an array, where:

The indices are the time in minutes past trade opening time, which was 9:30am local time.
The values are the price in dollars of Apple stock at that time.
So if the stock cost $500 at 10:30am, stockPricesYesterday[60] = 500.

Write an efficient function that takes stockPricesYesterday and returns the best profit I 
could have made from 1 purchase and 1 sale of 1 Apple stock yesterday.

No "shorting"—you must buy before you sell. You may not buy and sell in the same time step (at least 1 minute must pass).
********************************************************************************************************************************/

public class Profit {
	
	public static int getMaxProfit(int[] a)
	{
		int  max = -2147483648;
		
		for(int i = 0; i < a.length; i++)
		{
			for(int j = i+1; j < a.length; j++)
			{
				max = ((a[j] - a[i]) > max) ? (a[j] - a[i]) : max;
			}
		}
		return max;
	}
	
	public static void main(String[] args)
	{
		int[] stockPricesYesterday = new int[]{10,7,5,8,11,4,9};
		int[] stockPricesYesterday2 = new int[]{10,7,5,8,4,11,4,9};
		int[] stockPricesYesterday3 = new int[]{20,15,11,10,8,2};
		System.out.println("Best profit = "+getMaxProfit(stockPricesYesterday));
		System.out.println("Best profit = "+getMaxProfit(stockPricesYesterday2));
		System.out.println("Best profit = "+getMaxProfit(stockPricesYesterday3));
	}
}

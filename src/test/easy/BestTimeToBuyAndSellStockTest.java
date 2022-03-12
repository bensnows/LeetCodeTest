package test.easy;

import static org.junit.Assert.assertEquals;

import org.junit.jupiter.api.Test;

import easy.BestTimeToBuyAndSellStock;

public class BestTimeToBuyAndSellStockTest {

	BestTimeToBuyAndSellStock test = new BestTimeToBuyAndSellStock();

	@Test
	void test() {
		int[] prices = { 7, 1, 5, 3, 6, 4 };
		int result = test.maxProfit(prices);
		int expected = 5;
		assertEquals(expected, result);
	}

	@Test
	void test2() {
		int[] prices = { 7, 6, 4, 3, 1 };
		int result = test.maxProfit(prices);
		int expected = 0;
		assertEquals(expected, result);
	}
}

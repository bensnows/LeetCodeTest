package easy;

public class BestTimeToBuyAndSellStock {
	public int maxProfit(int[] prices) {
		if (prices.length == 0) {
			return 0;
		}

		int earned = 0;

		int in = prices[0];
		int out = prices[0];

		for (int day = 1; day < prices.length; day++) {

			if (prices[day] > out) {
				out = prices[day];
			} else if (prices[day] < in) {
				earned = out - in > earned ? out - in : earned;
				in = out = prices[day];
			}
		}

		if (out - in > earned)
			return out - in;
		else
			return earned;
	}
}

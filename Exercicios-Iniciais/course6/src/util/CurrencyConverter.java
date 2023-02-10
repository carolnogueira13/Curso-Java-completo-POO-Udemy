package util;

public class CurrencyConverter {
	public static double converter(double dollars, double price) {
		return dollars * price + 0.06 * dollars * price;
	}
}

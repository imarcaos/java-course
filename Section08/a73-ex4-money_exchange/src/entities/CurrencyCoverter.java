package entities;

public class CurrencyCoverter {

    public static double tax = 0.06;

    public double totalConvert (double currencyPrice, double money) {
        return money * currencyPrice;
    }

    public double applyTax(double bought) {
        return (bought * tax) + bought;
    }

}

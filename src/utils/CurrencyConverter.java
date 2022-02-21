package utils;

public class CurrencyConverter {

    public static final double IOF = 6.0/100;

    public static double dollarprice(double dollar, double amount){
        double valor = dollar * amount;
        return valor + IOF * (dollar * amount);
    }


}

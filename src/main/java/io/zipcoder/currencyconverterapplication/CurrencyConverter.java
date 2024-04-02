package io.zipcoder.currencyconverterapplication;


//1
public class CurrencyConverter {
    public static Double convert(Double amountOfBaseCurrency, ConvertableCurrency sourceCurrencyType, CurrencyType targetCurrencyType) {
        return sourceCurrencyType.convert(targetCurrencyType) * amountOfBaseCurrency;
    }
}

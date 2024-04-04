package io.zipcoder.currencyconverterapplication;

public interface ConvertableCurrency {
    default Double convert(CurrencyType currencyType) {
        Double sourceCurrancy = getCurrencyType().getRate();

       return currencyType.getRate()/sourceCurrancy;

    }

    CurrencyType getCurrencyType ();

}

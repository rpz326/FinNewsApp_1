package ru.mirea.sukhanovmd.finnewsapp.data.repository;

import ru.mirea.sukhanovmd.finnewsapp.data.model.CurrencyRate;

public class CurrencyRepositoryImplementation implements CurrencyRepository {

    @Override
    public CurrencyRate getCurrencyRate() {
        return new CurrencyRate("USD", 100.0, "EUR", 105.0);
    }

    @Override
    public void refreshCurrencyRate() {
        // обновление курса
    }
}

package ru.mirea.sukhanovmd.finnewsapp.data.repository;

import ru.mirea.sukhanovmd.finnewsapp.data.model.CurrencyRate;

public interface CurrencyRepository {
    CurrencyRate getCurrencyRate();
    void refreshCurrencyRate();
}

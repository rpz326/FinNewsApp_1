package ru.mirea.sukhanovmd.finnewsapp.domain.usecase;

import ru.mirea.sukhanovmd.finnewsapp.data.model.CurrencyRate;
import ru.mirea.sukhanovmd.finnewsapp.data.repository.CurrencyRepository;

public class GetCurrencyRateUseCase {
    private final CurrencyRepository currencyRepository;

    public GetCurrencyRateUseCase(CurrencyRepository currencyRepository) {
        this.currencyRepository = currencyRepository;
    }

    public CurrencyRate execute() {
        return currencyRepository.getCurrencyRate();
    }
}
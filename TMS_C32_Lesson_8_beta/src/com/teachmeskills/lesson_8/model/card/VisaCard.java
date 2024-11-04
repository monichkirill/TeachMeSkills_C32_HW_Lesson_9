package com.teachmeskills.lesson_8.model.card;

import com.teachmeskills.lesson_8.model.client.BaseClient;

import java.util.Date;

public class VisaCard extends BaseCard{

    int cashback;

    public VisaCard(String cardNumber, int cvv, Date validDate, BaseClient cardHolder, String currency, int cashback) {
        super(cardNumber, cvv, validDate, cardHolder, currency);
        this.cashback = cashback;
    }

    @Override
    public boolean checkCardLimitTransfer(double limit) {
        if (limit <= BaseCard.LIMIT_OF_VISA || limit > this.amount) {
            return false;
        } else {
            return true;
        }
    }
}

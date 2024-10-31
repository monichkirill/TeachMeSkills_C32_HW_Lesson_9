package com.teachmeskills.lesson_8.model.card;

import java.util.Date;

public class MasterCard extends BaseCard {

    public String country;

    public MasterCard(String cardNumber, int cvv, Date validDate, String cardHolder, String currency, String country) {
        super(cardNumber, cvv, validDate, cardHolder, currency);
        this.country = country;
    }

    @Override
    public boolean checkCardLimitTransfer(double limit) {
        return limit <= BaseCard.LIMIT_OF_MASTER;
    }
}

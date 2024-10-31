package com.teachmeskills.lesson_8.transfer.impl;

import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;
import com.teachmeskills.lesson_8.transfer.CardTransferService;

import java.util.Date;

// TODO реализовать имплементацию интерфейса
public class VisaCardTransferService implements CardTransferService {
    @Override
    public Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer) {
        if (cardFrom.checkCardLimitTransfer(sumOfTransfer) && sumOfTransfer > 0) {
            cardFrom.amount -= sumOfTransfer;
            cardTo.amount += sumOfTransfer;
            return new Check(sumOfTransfer, new Date(), cardFrom, "Success");
        } else {
            return new Check(sumOfTransfer, new Date(), cardFrom, "Failure");
        }

    }

    @Override
    public Check transferFromCardToAccount(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer) {
        if (cardFrom.checkCardLimitTransfer(sumOfTransfer) && sumOfTransfer > 0) {
            cardFrom.amount -= sumOfTransfer;
            cardTo.amount += sumOfTransfer;
            return new Check(sumOfTransfer, new Date(), cardTo, "Success");
        } else {
            return new Check(sumOfTransfer, new Date(), cardTo, "Failure");
        }
    }
}

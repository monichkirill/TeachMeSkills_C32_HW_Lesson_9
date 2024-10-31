package com.teachmeskills.lesson_8.transfer;

import com.teachmeskills.lesson_8.model.card.BaseCard;
import com.teachmeskills.lesson_8.model.document.Check;

public interface CardTransferService {

    Check transferFromCardToCard(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer);

    Check transferFromCardToAccount(BaseCard cardFrom, BaseCard cardTo, double sumOfTransfer);

}

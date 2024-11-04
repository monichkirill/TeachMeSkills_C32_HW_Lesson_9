package com.teachmeskills.lesson_8.model.client;

import com.teachmeskills.lesson_8.model.account.Account;
import com.teachmeskills.lesson_8.model.card.BaseCard;

import java.util.ArrayList;
import java.util.List;

public abstract class BaseClient {

    String name;
    Account[] accounts;
    List<BaseCard> cards = new ArrayList<>();

    public BaseClient(String name) {
        this.name = name;
    }

    public void addCard(BaseCard card) {
        cards.add(card);
    }

    public void showCardInfo() {
        int count = 0;
        for (int i = 0; i < cards.size(); i++) {
            for (int j = i + 1; j < cards.size(); j++) {
                if (cards.get(i).equals(cards.get(j))) {
                    count++;
                }
            }
        }

        if (count > 0) {
            System.out.println(this.name + " has " + count + " equals cards");
        } else {
            System.out.println(this.name + " has no equals cards");
        }
    }
}

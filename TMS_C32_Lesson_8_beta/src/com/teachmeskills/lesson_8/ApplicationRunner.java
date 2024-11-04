package com.teachmeskills.lesson_8;

import com.teachmeskills.lesson_8.model.card.MasterCard;
import com.teachmeskills.lesson_8.model.card.VisaCard;
import com.teachmeskills.lesson_8.model.client.IndividualClient;

import java.util.Date;

public class ApplicationRunner {

    public static void main(String[] args) {
        IndividualClient client1 = new IndividualClient("Vlad Fomin", "1234 123456");
        IndividualClient client2 = new IndividualClient("Nikita Krutoy", "9876 987654");

        MasterCard masterCard1 = new MasterCard("1234 123456", 123, new Date(), client1, "USD", "Russia");
        MasterCard masterCard2 = new MasterCard("1234 12345", 123, new Date(), client1, "USD", "Russia");
        MasterCard masterCard3 = new MasterCard("1234 123456", 123, new Date(), client1, "USD", "Russia");
        MasterCard masterCard4 = new MasterCard("3456 123456", 321, new Date(), client1, "USD", "Russia");

        VisaCard visaCard1 = new VisaCard("1234 123456", 123, new Date(), client2, "USD", 2);
        VisaCard visaCard2 = new VisaCard("3456 123456", 321, new Date(), client2, "USD", 2);

        client1.showCardInfo();
        client2.showCardInfo();

    }

}

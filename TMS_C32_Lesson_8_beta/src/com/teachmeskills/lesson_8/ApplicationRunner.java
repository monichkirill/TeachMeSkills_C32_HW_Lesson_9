package com.teachmeskills.lesson_8;

import com.teachmeskills.lesson_8.document_parser.IParser;
import com.teachmeskills.lesson_8.fabric.ParserFabric;
import com.teachmeskills.lesson_8.model.card.MasterCard;
import com.teachmeskills.lesson_8.model.card.VisaCard;
import com.teachmeskills.lesson_8.transfer.impl.MasterCardTransferService;
import com.teachmeskills.lesson_8.transfer.impl.VisaCardTransferService;

import java.util.Date;
import java.util.Scanner;

public class ApplicationRunner {

    public static void main(String[] args) {
        System.out.println("Input path to file");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();

        IParser parser = ParserFabric.createParser(input);
        parser.parseFile(input);

        MasterCard masterCardAccount1 = new MasterCard("123123", 234, new Date(), "Vlad Fomin", "RUB", "RUS");
        VisaCard visaCardAccount1 = new VisaCard("321321", 123, new Date(), "Vlad Fomin", "RUB", 5);

        MasterCard masterCardAccount2 = new MasterCard("456456", 645, new Date(), "Nikita Krutoy", "BYN", "BLR");
        VisaCard visaCardAccount2 = new VisaCard("654654", 446, new Date(), "Nikita Krutoy", "BYN", 1);

        MasterCardTransferService transfer1 = new MasterCardTransferService();
        transfer1.transferFromCardToCard(masterCardAccount1, visaCardAccount2, 500);
        VisaCardTransferService transfer2 = new VisaCardTransferService();
        transfer2.transferFromCardToAccount(masterCardAccount2, visaCardAccount1, 23532);

    }

}

package com.teachmeskills.lesson_8.model.document;

import com.teachmeskills.lesson_8.model.card.BaseCard;

import java.util.Date;

// TODO добавить поля: сумма перевода, дата перевода, номер счета или номер карты
// TODO создать метод для вывода информации о чеке на экран
public class Check {
    private double transferSum;
    private Date dateOfTransfer;
    private String accountNumber;
    private String comment;

    public Check(double transferSum, Date dateOfTransfer, BaseCard account, String comment) {
        this.transferSum = transferSum;
        this.dateOfTransfer = dateOfTransfer;
        this.accountNumber = account.cardNumber;
        this.comment = comment;
    }

    public void getCheckInfo() {
        System.out.println("Transfer Sum: " + transferSum + "\nAccount Number: " + accountNumber + "\nComment: " + comment);
    }
}

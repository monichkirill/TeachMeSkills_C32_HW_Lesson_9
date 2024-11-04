package com.teachmeskills.lesson_8.model.client;

public class IndividualClient extends BaseClient {

    String passportNumber;

    public IndividualClient(String name, String passportNumber) {
        super(name);
        this.passportNumber = passportNumber;
    }
}

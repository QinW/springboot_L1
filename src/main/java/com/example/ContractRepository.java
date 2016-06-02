package com.example;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Wei on 2016/6/2.
 */
public class ContractRepository {

    public ContractRepository() {

    }

    public List<Contact> findAll() {
        return new ArrayList<>();
    }

    public void save(Contact contact) {
        System.out.println(contact + " saved.");
    }
}

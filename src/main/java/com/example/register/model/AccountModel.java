package com.example.register.model;

import com.example.register.entity.Account;

import java.util.List;

public interface AccountModel {
    boolean save(Account obj);
    boolean update(int id, Account updateObj);
    boolean delete(int id);
    List<Account> findAll();
    Account findById(int id);
    Account findByUsername(String username);
}

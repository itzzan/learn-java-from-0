package com.zanedu.encap;

public class AccountTest {
    public static void main(String[] args) {
        //创建Account
        Account account = new Account();
        account.setName("jackasda");
        account.setBalance(6);
        account.setPassword("1234561231");

        account.showInfo();
    }
}

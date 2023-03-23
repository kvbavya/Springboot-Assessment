package com.application.wallet.app;

public class WalletDto {
    private Integer walletId;
    private String name;
    private Double balance;



    @Override
    public String toString() {
        return "WalletDto{" +
                "walletId=" + walletId +
                ", name='" + name + '\'' +
                ", balance=" + balance +
                '}';
    }

    public Integer getWalletId() {
        return walletId;
    }

    public void setWalletId(Integer walletId) {
        this.walletId = walletId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public WalletDto(Integer walletId, String name, Double balance) {
        this.walletId = walletId;
        this.name = name;
        this.balance = balance;
    }
    public WalletDto() {
    }
}

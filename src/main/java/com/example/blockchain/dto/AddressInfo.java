package com.example.blockchain.dto;

public class AddressInfo {
    private String address;
    private String hash160;
    private Integer txSize;
    private Double reveiveAmount;
    private Double finalBalance;;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getHash160() {
        return hash160;
    }

    public void setHash160(String hash160) {
        this.hash160 = hash160;
    }

    public Integer getTxSize() {
        return txSize;
    }

    public void setTxSize(Integer txSize) {
        this.txSize = txSize;
    }

    public Double getReveiveAmount() {
        return reveiveAmount;
    }

    public void setReveiveAmount(Double reveiveAmount) {
        this.reveiveAmount = reveiveAmount;
    }

    public Double getFinalBalance() {
        return finalBalance;
    }

    public void setFinalBalance(Double finalBalance) {
        this.finalBalance = finalBalance;
    }
}

package com.example.blockchain.dto;

import java.util.Date;
import java.util.List;

public class TransactionInfoDTO {
    private String txid;
    private String txhash;
    private Long size;
    private Integer weight;
    private Date time;
    private Double totalInput;
    private Double totalOutput;
    private Double fees;
    private List<TxDetailInTxInfo> txDetails;

    public String getTxid() {
        return txid;
    }

    public void setTxid(String txid) {
        this.txid = txid;
    }

    public String getTxhash() {
        return txhash;
    }

    public void setTxhash(String txhash) {
        this.txhash = txhash;
    }

    public Long getSize() {
        return size;
    }

    public void setSize(Long size) {
        this.size = size;
    }

    public Integer getWeight() {
        return weight;
    }

    public void setWeight(Integer weight) {
        this.weight = weight;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Double getTotalInput() {
        return totalInput;
    }

    public void setTotalInput(Double totalInput) {
        this.totalInput = totalInput;
    }

    public Double getTotalOutput() {
        return totalOutput;
    }

    public void setTotalOutput(Double totalOutput) {
        this.totalOutput = totalOutput;
    }

    public Double getFees() {
        return fees;
    }

    public void setFees(Double fees) {
        this.fees = fees;
    }

    public List<TxDetailInTxInfo> getTxDetails() {
        return txDetails;
    }

    public void setTxDetails(List<TxDetailInTxInfo> txDetails) {
        this.txDetails = txDetails;
    }
}

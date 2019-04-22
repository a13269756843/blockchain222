package com.example.blockchain.dto;

import java.util.Date;

public class BlockDetailDTO {
    private String blockhash;
    private Integer height;
    private Date time;
    private Integer txSize;
    private Long sizeOnDisk;
    private Double difficulty;
    private String preBlockhash;
    private String nextBlockhash;
    private Double ouputTotal;
    private Double transcationFees;
    private String mekleRoot;

    public String getBlockhash() {
        return blockhash;
    }

    public void setBlockhash(String blockhash) {
        this.blockhash = blockhash;
    }

    public Integer getHeight() {
        return height;
    }

    public void setHeight(Integer height) {
        this.height = height;
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    public Integer getTxSize() {
        return txSize;
    }

    public void setTxSize(Integer txSize) {
        this.txSize = txSize;
    }

    public Long getSizeOnDisk() {
        return sizeOnDisk;
    }

    public void setSizeOnDisk(Long sizeOnDisk) {
        this.sizeOnDisk = sizeOnDisk;
    }

    public Double getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(Double difficulty) {
        this.difficulty = difficulty;
    }

    public String getPreBlockhash() {
        return preBlockhash;
    }

    public void setPreBlockhash(String preBlockhash) {
        this.preBlockhash = preBlockhash;
    }

    public String getNextBlockhash() {
        return nextBlockhash;
    }

    public void setNextBlockhash(String nextBlockhash) {
        this.nextBlockhash = nextBlockhash;
    }

    public Double getOuputTotal() {
        return ouputTotal;
    }

    public void setOuputTotal(Double ouputTotal) {
        this.ouputTotal = ouputTotal;
    }

    public Double getTranscationFees() {
        return transcationFees;
    }

    public void setTranscationFees(Double transcationFees) {
        this.transcationFees = transcationFees;
    }

    public String getMekleRoot() {
        return mekleRoot;
    }

    public void setMekleRoot(String mekleRoot) {
        this.mekleRoot = mekleRoot;
    }
}

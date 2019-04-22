package com.example.blockchain.service;

public interface MiscService {
    void importFromHeight(Integer blockHeight, Boolean isClean);
    void importFromHash(String blockHash, Boolean isClean) throws Throwable;
}

package com.example.blockchain.dao;

import com.example.blockchain.po.Transaction;
import feign.Param;

import java.util.List;

public interface TransactionMapper {
    int deleteByPrimaryKey(String txid);

    int truncate();

    int insert(Transaction record);

    int insertSelective(Transaction record);

    Transaction selectByPrimaryKey(String txid);

    int updateByPrimaryKeySelective(Transaction record);

    int updateByPrimaryKey(Transaction record);

    List<Transaction> selectransaction();

    List<Transaction> selectByHash(@Param("txhash")String txhash);
}
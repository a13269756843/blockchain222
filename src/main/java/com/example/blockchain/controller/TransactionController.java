package com.example.blockchain.controller;

import com.example.blockchain.dao.TransactionMapper;
import com.example.blockchain.dto.BlockListDTO;
import com.example.blockchain.dto.TransactionInfoDTO;
import com.example.blockchain.dto.TransactionListDTO;
import com.example.blockchain.po.Block;
import com.example.blockchain.po.Transaction;
import com.sun.xml.internal.ws.api.pipe.TransportTubeFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/transaction")
@CrossOrigin
public class TransactionController {
    @Autowired
    private TransactionMapper transactionMapper;

    @GetMapping("/getRecentTransactionsById")

    public List<TransactionListDTO> getRecentTransactionsById(@RequestParam Integer  blockchainId){
        return  null;
    }

    @GetMapping("/getRecentTransactionsByNameType")
    public List<TransactionListDTO> getRecentTransactionsByNameType(@RequestParam String name,
                                                                    @RequestParam String type){
        return null;
    }

    @GetMapping("/getTransactionInfoByTxid")
    public TransactionInfoDTO getTransactionInfoByTxid(@RequestParam String txid){
        return  null;
    }

    @GetMapping("/getTransactionInfoByTxhash")
    public List<TransactionInfoDTO> getTransactionInfoByTxhash(@RequestParam String txhash){
        List<Transaction> selectransaction = transactionMapper.selectByHash(txhash);
        List<TransactionInfoDTO> transactionInfoDTOS = selectransaction.stream().map(transaction -> {
            TransactionInfoDTO transactionInfoDTO = new TransactionInfoDTO();
            transactionInfoDTO.setFees(transaction.getFees());
            transactionInfoDTO.setSize(transaction.getSize());
            transactionInfoDTO.setTime(transaction.getTime());
            transactionInfoDTO.setTotalInput(transaction.getTotalInput());
            transactionInfoDTO.setTotalOutput(transaction.getTotalOutput());
            transactionInfoDTO.setTxhash(transaction.getTxhash());
            transactionInfoDTO.setTxid(transaction.getTxid());
            transactionInfoDTO.setWeight(transaction.getWeight());
            return transactionInfoDTO;
        }).collect(Collectors.toList());

        return transactionInfoDTOS;
    }
    @GetMapping("/getTranscation")
    public List<TransactionListDTO> getTranscation(){
        List<Transaction> transactions = transactionMapper.selectransaction();
        List<TransactionListDTO> transactionListDTOS = transactions.stream().map(transaction -> {
            TransactionListDTO transactionListDTO = new TransactionListDTO();
            transactionListDTO.setTime(transaction.getTime().getTime());
            transactionListDTO.setAmount(0.08);
            transactionListDTO.setTxhash(transaction.getTxhash());
            return transactionListDTO;
        }).collect(Collectors.toList());

        return transactionListDTOS;

    }
}

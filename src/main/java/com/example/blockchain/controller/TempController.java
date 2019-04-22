package com.example.blockchain.controller;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.example.blockchain.api.BitcoinApi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/temp")
@EnableAutoConfiguration
public class TempController {
    @Autowired
    private BitcoinApi bitcoinApi;



    @GetMapping("/test")
    public void test() {
        JSONObject chainInfo = bitcoinApi.getChainInfo();
        String txhash="7c60b8c28d684562b2e372c4a21926e609ca9828a0b907a9fa880eaa29df4f30";
        JSONObject transaction = bitcoinApi.getTransaction(txhash);

        String blockhash = "0000000000083004072b323850448cc9c8dbbef2630df2dd12fa04444acc2d7e";
        JSONObject block = bitcoinApi.getBlock(blockhash);
        JSONObject noTxBlock = bitcoinApi.getNoTxBlock(blockhash);

        String blockhash2 = "000000000005d8ed4a041614010c7d8a85ae0b1111eb1d91f2bca5f56f963549";
        JSONArray blockHeaders = bitcoinApi.getBlockHeaders(10, blockhash2);

        JSONObject mempoolInfo = bitcoinApi.getMempoolInfo();

        JSONObject mempoolContents = bitcoinApi.getMempoolContents();
}
}

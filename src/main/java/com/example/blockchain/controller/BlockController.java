package com.example.blockchain.controller;

import com.example.blockchain.api.BitcoinApi;
import com.example.blockchain.api.BitcoinJsonRpcClient;
import com.example.blockchain.dao.BlockMapper;
import com.example.blockchain.dto.BlockDetailDTO;
import com.example.blockchain.dto.BlockListDTO;
import com.example.blockchain.po.Block;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/block")
@CrossOrigin
public class BlockController {

    @Autowired
    private BitcoinApi bitcoinApi;

    @Autowired
    private BitcoinJsonRpcClient bitcoinJsonRpcClient;

    @Autowired
    private BlockMapper blockMapper;


    @GetMapping("/getRecentBlocks")
    public List<BlockListDTO> getRecentBlocks() throws Throwable {
        List<Block> blocks = blockMapper.selectRecent();
        List<BlockListDTO> blockListDTOS = blocks.stream().map(block -> {
            BlockListDTO blockListDTO = new BlockListDTO();
            blockListDTO.setHeight(block.getHeight());
            blockListDTO.setTime(block.getTime().getTime());
            blockListDTO.setTxSize(block.getTxSize());
            blockListDTO.setSizeOnDisk(block.getSizeOnDisk());
            return blockListDTO;
        }).collect(Collectors.toList());

        return blockListDTOS;

    }

    @GetMapping("/getRecentBlocksByNameType")
    public List<BlockListDTO> getRecentBlocksByNameType(@RequestParam String name,
                                                        @RequestParam String type){
        return null;
    }

    @GetMapping("/getBlockDetailByHash")
    public BlockDetailDTO getBlockDetailByHash(@RequestParam String blockhash){
        return null;
    }

    @GetMapping("/getBlockDetailByHeight")
    public List<BlockDetailDTO> getBlockDetailByHeight(@RequestParam Integer blockheight) {
        List<Block> blocks = blockMapper.selectBlockByHeight(blockheight);
        List<BlockDetailDTO> blockDetailDTOS = blocks.stream().map(block -> {
            BlockDetailDTO blockDetailDTO = new BlockDetailDTO();
            blockDetailDTO.setBlockhash(block.getBlockhash());
            blockDetailDTO.setDifficulty(block.getDifficulty());
            blockDetailDTO.setHeight(block.getHeight());
            blockDetailDTO.setMekleRoot(block.getMerkleRoot());
            blockDetailDTO.setNextBlockhash(block.getNextBlockhash());
            blockDetailDTO.setOuputTotal(block.getOutputTotal());
            blockDetailDTO.setPreBlockhash(block.getPrevBlockhash());
            blockDetailDTO.setSizeOnDisk(block.getSizeOnDisk());
            blockDetailDTO.setTime(block.getTime());
            blockDetailDTO.setTranscationFees(block.getTransactionFees());
            return blockDetailDTO;
        }).collect(Collectors.toList());
        return blockDetailDTOS;


    }


}

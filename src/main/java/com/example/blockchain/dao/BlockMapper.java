package com.example.blockchain.dao;

import com.example.blockchain.dto.BlockDetailDTO;
import com.example.blockchain.po.Block;

import java.util.List;

public interface BlockMapper {
    int deleteByPrimaryKey(String blockhash);

    int truncate();

    int insert(Block record);

    int insertSelective(Block record);

    Block selectByPrimaryKey(String blockhash);

    int updateByPrimaryKeySelective(Block record);

    int updateByPrimaryKey(Block record);

    List<Block> selectRecent();

    List<Block> selectBlockByHeight(Integer blockheight);
}
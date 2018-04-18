package com.tran.mapper;

import java.util.List;

import com.tran.model.Goods;

public interface GoodsMapper {

	public int insert(Goods g);

	public int modify(Goods g);

	public int delete(String id);

	public List<Goods> findAll();

	public Goods findOne(String id);
}

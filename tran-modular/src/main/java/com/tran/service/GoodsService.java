package com.tran.service;

import java.util.List;

import com.tran.model.Goods;

public interface GoodsService {

	public int save(Goods g);

	public int delete(String id);

	public int modify(Goods g);

	public Goods findOne(String id);

	public List<Goods> findAll();
}

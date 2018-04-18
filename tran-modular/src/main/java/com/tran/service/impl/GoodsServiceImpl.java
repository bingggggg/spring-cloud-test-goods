package com.tran.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.tran.mapper.GoodsMapper;
import com.tran.model.Goods;
import com.tran.service.GoodsService;

@Service
public class GoodsServiceImpl implements GoodsService {

	GoodsMapper mapper;

	public GoodsServiceImpl(GoodsMapper mapper) {
		this.mapper = mapper;
	}

	@Override
	public int save(Goods g) {
		return mapper.insert(g);
	}

	@Override
	public int delete(String id) {
		return mapper.delete(id);
	}

	@Override
	public int modify(Goods g) {
		return mapper.modify(g);
	}

	@Override
	public Goods findOne(String id) {
		return mapper.findOne(id);
	}

	@Override
	public List<Goods> findAll() {
		return mapper.findAll();
	}

}

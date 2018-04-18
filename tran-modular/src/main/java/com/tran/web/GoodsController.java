package com.tran.web;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tran.model.Goods;
import com.tran.service.GoodsService;

@RestController
public class GoodsController {

	GoodsService gService;

	public GoodsController(GoodsService gService) {
		this.gService = gService;
	}

	@RequestMapping("/save")
	public int save() {

		Goods g = new Goods();
		g.setGoodsCode(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		g.setGoodsPrice(BigDecimal.valueOf(15.0));
		g.setGoodsType("海鲜");
		g.setGoodsName("鱼");
		g.setGoodsUnit("千克");

		return gService.save(g);
	}

	@RequestMapping("/modify")
	public int modify() {

		Goods g = new Goods();
		g.setGoodsCode(new SimpleDateFormat("yyyyMMdd").format(new Date()));
		g.setGoodsPrice(BigDecimal.valueOf(15.0));
		g.setGoodsType("蔬菜");
		g.setGoodsName("瓜");
		g.setGoodsUnit("千克");

		return gService.modify(g);
	}

	@RequestMapping("/delete")
	public int delete() {

		String id = new SimpleDateFormat("yyyyMMdd").format(new Date());
		return gService.delete(id);
	}

	@RequestMapping("/findAll")
	public List<Goods> findAll() {


		return gService.findAll();
	}

	@RequestMapping("/findOne")
	public Goods findOne() {

		String id = new SimpleDateFormat("yyyyMMdd").format(new Date());

		return gService.findOne(id);
	}
}

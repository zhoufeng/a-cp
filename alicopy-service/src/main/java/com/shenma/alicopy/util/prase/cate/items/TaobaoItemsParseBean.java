package com.shenma.alicopy.util.prase.cate.items;


import com.shenma.alicopy.util.Item;

import java.util.List;

public class TaobaoItemsParseBean {
	private List<Item> items;
	private Integer totals;
	private Integer pageNo;
	private Integer TotalPages;
	
	public List<Item> getItems() {
		return items;
	}
	public void setItems(List<Item> items) {
		this.items = items;
	}
	public Integer getTotals() {
		return totals;
	}
	
	public void setTotals(Integer totals) {
		this.totals = totals;
	}
	public Integer getPageNo() {
		return pageNo;
	}
	public void setPageNo(Integer pageNo) {
		this.pageNo = pageNo;
	}
	public Integer getTotalPages() {
		return TotalPages;
	}
	public void setTotalPages(Integer totalPages) {
		TotalPages = totalPages;
	}
	
	
}

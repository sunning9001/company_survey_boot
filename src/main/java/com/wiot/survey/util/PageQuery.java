package com.wiot.survey.util;

import com.alibaba.fastjson.JSONObject;

/**
 * 分页查询
 * 
 * @author sunning
 *
 * @param <T>
 */
public class PageQuery<T> {
	private int page;
	private int size;
	private T obj;

	public int getPage() {
		return page;
	}

	public void setPage(int page) {
		this.page = page;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	public Object getObj(Class clazz) {
		return  JSONObject.parseObject(String.valueOf(this.obj),clazz);
	}

	public void setObj(T obj) {
		this.obj = obj;
	}

	@Override
	public String toString() {
		return "PageQuery [page=" + page + ", size=" + size + ", obj=" + obj + "]";
	}

}

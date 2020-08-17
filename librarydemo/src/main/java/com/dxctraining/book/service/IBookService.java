package com.dxctraining.book.service;

import com.dxctraining.book.entities.Book;

public interface IBookService {
	Book findById(int id);
	Book update(Book book);

	void add(Book book);

	Book updateCost(int id, double cost);

	void remove(int id);

}
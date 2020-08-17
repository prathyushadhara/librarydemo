package com.dxctraining.itbook.service;


import com.dxctraining.itbook.entities.ITBook;

public interface IITBookService {


    ITBook save(ITBook itBook);

	ITBook findById(int id);


}


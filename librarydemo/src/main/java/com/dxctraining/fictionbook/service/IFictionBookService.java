package com.dxctraining.fictionbook.service;

import com.dxctraining.fictionbook.entities.FictionBook;

public interface IFictionBookService {
       
	 FictionBook save( FictionBook fictionBook);
   
	 FictionBook findById(int id);
   
   
   
}
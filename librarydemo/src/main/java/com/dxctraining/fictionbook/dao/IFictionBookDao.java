package com.dxctraining.fictionbook.dao;

import com.dxctraining.fictionbook.entities.FictionBook;

public interface IFictionBookDao {
       
	 FictionBook save( FictionBook fictionBook);
   
	 FictionBook findById(int id);
   
   
   
}


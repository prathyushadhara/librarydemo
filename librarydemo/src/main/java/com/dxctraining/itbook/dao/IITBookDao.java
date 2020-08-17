package com.dxctraining.itbook.dao;


import com.dxctraining.itbook.entities.ITBook;

public interface IITBookDao {


    ITBook save(ITBook itBook);

      ITBook findById(int id);


}



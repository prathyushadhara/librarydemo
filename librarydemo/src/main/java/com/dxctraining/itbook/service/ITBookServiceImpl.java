package com.dxctraining.itbook.service;

import com.dxctraining.itbook.dao.IITBookDao;
import com.dxctraining.itbook.entities.ITBook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Transactional
@Service
public class ITBookServiceImpl implements IITBookService {

    @Autowired
    private IITBookDao dao;

    @Override
    public ITBook save( ITBook itBook) {
    	itBook= dao.save(itBook);
        return itBook;
    }

    @Override
    public  ITBook findById(int id) {
       ITBook itBook = dao.findById(id);
        return itBook;
    }

	
}

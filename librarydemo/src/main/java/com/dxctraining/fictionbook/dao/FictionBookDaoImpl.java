package com.dxctraining.fictionbook.dao;

import com.dxctraining.fictionbook.entities.FictionBook;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class FictionBookDaoImpl implements IFictionBookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public FictionBook save(FictionBook fictionBook) {
        fictionBook = entityManager.merge(fictionBook);
        return fictionBook;
    }

    @Override
    public FictionBook findById(int id) {
       FictionBook fBook = entityManager.find(FictionBook.class, id);
        return fBook;
    }

	
}


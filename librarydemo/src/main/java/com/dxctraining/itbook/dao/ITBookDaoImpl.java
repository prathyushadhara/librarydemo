package com.dxctraining.itbook.dao;

import com.dxctraining.itbook.entities.ITBook;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Repository
public class ITBookDaoImpl implements IITBookDao {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public ITBook save(ITBook itBook) {
        itBook= entityManager.merge(itBook);
        return itBook;
    }

    @Override
    public ITBook findById(int id) {
        ITBook itBook = entityManager.find(ITBook.class, id);
        return itBook;
    }
}

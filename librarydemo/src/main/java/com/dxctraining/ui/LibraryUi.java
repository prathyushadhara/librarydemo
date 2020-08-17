package com.dxctraining.ui;

import com.dxctraining.book.entities.Author;
import com.dxctraining.exceptions.BookNotFoundException;
import com.dxctraining.exceptions.InvalidArgumentException;
import com.dxctraining.fictionbook.entities.FictionBook;
import com.dxctraining.fictionbook.service.IFictionBookService;
import com.dxctraining.itbook.entities.ITBook;
import com.dxctraining.itbook.service.IITBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;

@Component
public class LibraryUi {
    @Autowired
    private IITBookService itBookService;

    @Autowired
    private IFictionBookService fictionService;


    @PostConstruct
    public void runUi() {
        try {
        	Author author1=new Author("prathyusha");
        	Author author2=new Author("priya");
        	ITBook itBook = new ITBook("java",432.21,author1,2.1);
        	itBook=itBookService.save(itBook);

        	FictionBook fictionBook = new FictionBook("science", 563.21,author2,"junit");
            fictionBook =fictionService.save(fictionBook);

            int itBookId1 = itBook.getId();
            ITBook fetcheitBook1 = itBookService.findById(itBookId1);
            System.out.println("fetcehed book =" + fetcheitBook1.getName() + " " + fetcheitBook1.getCost() + " " + fetcheitBook1.getAuthor());

            System.out.println("version used=" + fetcheitBook1.getVersion());


        } catch (BookNotFoundException e) {
            e.printStackTrace();
        } catch (InvalidArgumentException e) {
            e.printStackTrace();
        }
    }


}

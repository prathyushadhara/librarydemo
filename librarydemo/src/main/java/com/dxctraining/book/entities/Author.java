package com.dxctraining.book.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Author {
	@Id
    @GeneratedValue
	private String id;
	private String name;
	public Author(String name){
		
		this.name=name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public boolean equals(Object arg) {
		if(this==arg) {
			return true;
		}

	   if(arg==null || !(arg instanceof Author) ) {
			return false;
	   }

	    Book that=(Book)arg;	
		boolean isequal=this.getId().equals(that.getId());
		return isequal;
	}

    @Override
    public int hashCode(){
    	int hash=getId().hashCode();
		return hash;
		}
	
	

}
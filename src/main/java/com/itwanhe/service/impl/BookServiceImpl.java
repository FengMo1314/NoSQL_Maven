package com.itwanhe.service.impl;

import com.itwanhe.dao.impl.BookDao;
import com.itwanhe.dao.impl.BookDaoImpl;

public class BookServiceImpl implements BookService {
    private BookDao bookDao;

    public void save() {
        System.out.println("book service save ...");
        bookDao.save();


    }
    //【第二步】提供依赖对象对应的setter方法
    public void setBookDao(BookDaoImpl bookDao) {
        this.bookDao = bookDao;
    }
}


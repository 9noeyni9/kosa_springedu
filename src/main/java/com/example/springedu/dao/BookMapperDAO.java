package com.example.springedu.dao;

import com.example.springedu.domain.BookDTO;
import com.example.springedu.domain.EmpVO;
import com.example.springedu.domain.PageDTO;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.awt.print.Book;
import java.util.List;

@Mapper
public interface BookMapperDAO {
    @Insert("insert into (book, price, kind) values (#{title},#{price},#{kind})")
    public boolean exam0(BookDTO book);

    @Select("select id, title, price, kind from book ")
    public List<BookDTO> exam1();

    @Select("select id, price, title, price,kind from book order by price")
    public List<BookDTO> exam2();

    @Select("select id, title, price, kind from book where price >= 20000")
    public List<BookDTO> exam3();

    @Select("select id,title,price,kind from book where kind='b01'")
    public List<BookDTO> exam4();

    @Select("select id,title,price,kind from book where kind='b01'")
    public List<BookDTO> exam5();

    @Select("select id,title,price,kind from book where title like concat('%',${keyword},'%')")
    public List<BookDTO> exam6(String keyword);


    @Select("select id,title,format(avg(price),0) avg,kind from book where kind is not null group by kind")
    public List<BookDTO> exam7();

}
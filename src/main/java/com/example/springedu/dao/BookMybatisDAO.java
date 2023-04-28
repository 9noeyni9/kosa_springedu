package com.example.springedu.dao;

import com.example.springedu.domain.BookDTO;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.awt.print.Book;
import java.util.List;

@Repository
public class BookMybatisDAO {
    @Autowired
    SqlSession session;

    public boolean insert(BookDTO book){
        boolean result = false;
        try{
            String statement = "lab1.exam0";
            if(session.insert(statement, book) == 1)/*insert의 return값은 int*/
            result=true;
        }catch (Exception e){
            e.printStackTrace();
        }
        return  result;
    }

    public List<BookDTO> b1(){
        List<BookDTO> list = null;
        try{
            String statement = "lab1.exam1";
            list = session.selectList(statement);
        }catch (Exception e){
            e.printStackTrace();
        }
        return list;
    }

    public List<BookDTO> b2(){
        List<BookDTO> listOrder = null;
        try{
            String statement = "lab1.exam2";
            listOrder = session.selectList(statement);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listOrder;
    }

    public List<BookDTO> b3(){
        List<BookDTO> listPart = null;
        try{
            String statement = "lab1.exam3";
            listPart = session.selectList(statement);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listPart;
    }


    public List<BookDTO> b4(){
        List<BookDTO> listPart = null;
        try{
            String statement = "lab1.exam4";
            listPart = session.selectList(statement);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listPart;
    }

    public List<BookDTO> b5(){
        List<BookDTO> listPart = null;
        try{
            String statement = "lab1.exam5";
            listPart = session.selectList(statement);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listPart;
    }

    public List<BookDTO> b6(String keyword){
        List<BookDTO> listPart = null;
        try{
            String statement = "lab1.exam6";
            listPart = session.selectList(statement,"자바");
        }catch (Exception e){
            e.printStackTrace();
        }
        return listPart;
    }

    public List<BookDTO> b7(String keyword){
        List<BookDTO> listPart = null;
        try{
            String statement = "lab1.exam6";
            listPart = session.selectList(statement,"스프링");
        }catch (Exception e){
            e.printStackTrace();
        }
        return listPart;
    }

    public List<BookDTO> b8(){
        List<BookDTO> listPart = null;
        try{
            String statement = "lab1.exam7";
            listPart = session.selectList(statement);
        }catch (Exception e){
            e.printStackTrace();
        }
        return listPart;
    }

}

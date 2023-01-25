package com.ngopidevteam;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ngopidevteam.domain.Author;
import com.ngopidevteam.dto.BookDetailDTO;
import com.ngopidevteam.service.BookService;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
//        Author author = new Author();
        ClassPathXmlApplicationContext appContext = new ClassPathXmlApplicationContext("application-context.xml");
        BookService bookService = (BookService) appContext.getBean("bookService");
        BookDetailDTO bookDetailDTO = bookService.findBookDetailById(1L);
        System.out.println("Book Detail = " + bookDetailDTO);
    }
}

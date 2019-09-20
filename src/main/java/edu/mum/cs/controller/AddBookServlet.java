package edu.mum.cs.controller;

import com.google.gson.Gson;
import edu.mum.cs.model.Book;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addBook")
public class AddBookServlet extends HttpServlet {
   private List<Book> bookList = new ArrayList<>();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        String bookName = req.getParameter("bookTittle");
        String  isbn = req.getParameter("isbn");
        Book book = new Book(bookName, isbn);

        System.out.println("Book from JSP file " + book);


        //List to save the books
        bookList.add(book);
        Gson gson = new Gson();
        String currBook = gson.toJson(book);
        Gson gsonBooks = new Gson();
        String allBooks = gson.toJson(bookList);


        System.out.println("Conversion to a JSON Object" + currBook);
        System.out.println("Conversion to a JSON Object of books " + allBooks);


        resp.setContentType("application/json");
        resp.setCharacterEncoding("UTF-8");
        //Appending
//        resp.getWriter().write(currBook);

        //Looping
        resp.getWriter().write(allBooks);
    }

}

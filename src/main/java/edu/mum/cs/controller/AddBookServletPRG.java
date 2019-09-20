package edu.mum.cs.controller;

import edu.mum.cs.model.Book;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

@WebServlet("/addBookPRG")
public class AddBookServletPRG extends HttpServlet {
    private List<Book> bookList = new ArrayList<>();
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
        req.setAttribute("books", bookList);
        RequestDispatcher sss = req.getRequestDispatcher("displayTable.jsp");
        sss.forward(req, resp);
    }

    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException
    {
       String bookTittle = req.getParameter("bookTittle");
       String isbn = req.getParameter("isbn");
        Book book = new Book(bookTittle, isbn);

        bookList.add(book);

        resp.sendRedirect("addBookPRG");
    }
}

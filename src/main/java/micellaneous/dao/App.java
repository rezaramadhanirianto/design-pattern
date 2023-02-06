package micellaneous.dao;

import micellaneous.dao.dao.BookDao;
import micellaneous.dao.daoimpl.BookDaoImpl;
import micellaneous.dao.model.Books;

public class App {

    public static void main(String[] args) {

        BookDao bookDao = new BookDaoImpl();

        for (Books book : bookDao.getAllBooks()) {
            System.out.println("Book ISBN : " + book.getIsbn());
        }

        //update student
        Books book = bookDao.getAllBooks().get(1);
        book.setBookName("Algorithms");
        bookDao.saveBook(book);
    }
}

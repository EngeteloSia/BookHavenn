package ac.za.mycput.repository;

import ac.za.mycput.domain.Book;
import ac.za.mycput.domain.Loan;

import java.util.List;

public interface IBookRepository extends IRepository<Book, Integer>{

    List<Book> getAll();
}

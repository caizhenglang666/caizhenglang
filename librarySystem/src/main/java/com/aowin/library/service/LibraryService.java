package com.aowin.library.service;
import java.util.List;
import com.aowin.library.model.Book;
import com.aowin.library.model.BookRecord;
import com.aowin.library.model.User;
public interface LibraryService {
	public User checkUser(String username,String password);
    public List<Book>getBooks();
    public List<BookRecord>getOwnBookRecords(String userid);
    public void bookToBack(String recordids);
}

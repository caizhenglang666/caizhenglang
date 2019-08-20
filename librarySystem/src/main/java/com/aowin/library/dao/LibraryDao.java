package com.aowin.library.dao;
import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.aowin.library.model.Book;
import com.aowin.library.model.BookRecord;
import com.aowin.library.model.User;
public interface LibraryDao {
	public User checkAccAndPwd(@Param("username")String username,@Param("password")String password);
    public List<Book> getAllBooks();
    public List<BookRecord> getOwnBooks(Integer id);
    public int bookToBack(@Param("recordids")String []recordids,@Param("returntime")String returntime);
}

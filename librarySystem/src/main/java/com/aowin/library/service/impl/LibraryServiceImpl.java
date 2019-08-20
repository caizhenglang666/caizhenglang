package com.aowin.library.service.impl;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.aowin.library.Util.DataFormat;
import com.aowin.library.dao.LibraryDao;
import com.aowin.library.exception.ServiceException;
import com.aowin.library.model.Book;
import com.aowin.library.model.BookRecord;
import com.aowin.library.model.User;
import com.aowin.library.service.LibraryService;
@Service("libraryService")
public class LibraryServiceImpl implements LibraryService {
	@Autowired
	private LibraryDao dao;
	@Transactional(propagation=Propagation.SUPPORTS)
	public User checkUser(String username, String password) {
		User user=dao.checkAccAndPwd(username, password);
		if(user==null) {
			throw new ServiceException("账号或密码错误");
		}
		return user;
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<Book> getBooks() {
		List<Book>list=null;
		try{
			list=dao.getAllBooks();
		}catch(Exception e) {
			throw new ServiceException(e);
		}
		return list;
	}
	@Transactional(propagation=Propagation.SUPPORTS)
	public List<BookRecord> getOwnBookRecords(String userid) {
	    if(userid!=null&&!"".equals(userid)) {
	    	List<BookRecord>list=dao.getOwnBooks(Integer.parseInt(userid));
	    	return list;
	    }
		return null;
	}
	@Transactional(propagation=Propagation.REQUIRED)
	public void bookToBack(String recordids) {
		SimpleDateFormat sdf=DataFormat.getDataFormat();
		if(!"".equals(recordids)&&recordids!=null) {
			int n=dao.bookToBack(recordids.split(","),sdf.format(new Date()));
			if(n==0) {
				throw new ServiceException("归还失败");
			}
		}else {
			throw new ServiceException("提交记录无效");
		}
		
	}

}

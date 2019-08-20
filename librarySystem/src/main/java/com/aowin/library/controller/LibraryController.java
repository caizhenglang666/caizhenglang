package com.aowin.library.controller;
import java.util.List;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.aowin.library.model.Book;
import com.aowin.library.model.BookRecord;
import com.aowin.library.model.User;
import com.aowin.library.service.LibraryService;
import com.aowin.library.web.JsonResult;
@Controller
@RequestMapping("/indexUI/")
public class LibraryController {
	@Resource
	private LibraryService libraryService;
	@RequestMapping("test")
	public String librUI() {
		return "login";
	}
	@RequestMapping("login.do")
	@ResponseBody
	public JsonResult login(@RequestParam("username")String username,@RequestParam("password")String password,HttpSession session){
		User user=libraryService.checkUser(username, password);
		session.setAttribute("username",user.getU_username());
		return new JsonResult(user);
	}
	@RequestMapping("index.do")
	public String index() {
		return "librarymanager/index";
	}
	@RequestMapping("getAllbooks")
	@ResponseBody
	public JsonResult getAllBooks() {
	     List<Book>list=libraryService.getBooks();
	     return new JsonResult(list);
	}
	@RequestMapping("watchBooksOfOwn")
	@ResponseBody
	public JsonResult getOwnBooks(@RequestParam("userid")String userid) {
		List<BookRecord>list=libraryService.getOwnBookRecords(userid);
	    return new JsonResult(list);
	}
	@RequestMapping("bookToBack")
	@ResponseBody
	public JsonResult toBackBooks(@RequestParam("recordids")String recordids) {
		libraryService.bookToBack(recordids);
		return new JsonResult("¹é»¹³É¹¦");
	}
}

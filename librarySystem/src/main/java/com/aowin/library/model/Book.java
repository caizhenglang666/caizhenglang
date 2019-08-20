package com.aowin.library.model;
import java.io.Serializable;
public class Book implements Serializable{
	private static final long serialVersionUID = 1L;
	private Integer bookid;
	private String bookname;
	private String author;
	private double price;
	private String publisher;
	private Integer status;
	private String bookcode;
	public Book() {
		super();
	}
	public Book(String bookname, String author, double price, String publisher, Integer status, String bookcode) {
		super();
		this.bookname = bookname;
		this.author = author;
		this.price = price;
		this.publisher = publisher;
		this.status = status;
		this.bookcode = bookcode;
	}

	public Integer getBookid() {
		return bookid;
	}

	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}

	public String getBookname() {
		return bookname;
	}

	public void setBookname(String bookname) {
		this.bookname = bookname;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public Integer getStatus() {
		return status;
	}

	public void setStatus(Integer status) {
		this.status = status;
	}

	public String getBookcode() {
		return bookcode;
	}

	public void setBookcode(String bookcode) {
		this.bookcode = bookcode;
	}

	@Override
	public String toString() {
		return "Book [bookid=" + bookid + ", bookname=" + bookname + ", author=" + author + ", price=" + price
				+ ", publisher=" + publisher + ", status=" + status + ", bookcode=" + bookcode + "]";
	}
	

}

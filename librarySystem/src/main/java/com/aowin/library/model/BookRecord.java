package com.aowin.library.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
public class BookRecord implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer recordid;
	private Integer userid;
	private Integer bookid;
	private Date lendtime;//借书时间
	private Date returntime;//实际还书时间
	private Date expiretime;//要求还书时间
	private User user;
	private List<Book> books;
	private String tianshu;//租书剩余天数
	public BookRecord() {
		super();
	}
	public BookRecord(Integer recordid, Integer userid, Integer bookid, Date lendtime, Date returntime, Date expiretime,
			User user, List<Book> books) {
		super();
		this.recordid = recordid;
		this.userid = userid;
		this.bookid = bookid;
		this.lendtime = lendtime;
		this.returntime = returntime;
		this.expiretime = expiretime;
		this.user = user;
		this.books = books;
	}
	public Integer getRecordid() {
		return recordid;
	}
	public void setRecordid(Integer recardid) {
		this.recordid = recardid;
	}
	public Integer getUserid() {
		return userid;
	}
	public void setUserid(Integer userid) {
		this.userid = userid;
	}
	public Integer getBookid() {
		return bookid;
	}
	public void setBookid(Integer bookid) {
		this.bookid = bookid;
	}
	public Date getLendtime() {
		return lendtime;
	}
	public void setLendtime(Date lendtime) {
		this.lendtime = lendtime;
	}
	public Date getReturntime() {
		return returntime;
	}
	public void setReturntime(Date returntime) {
		this.returntime = returntime;
	}
	public Date getExpiretime() {
		return expiretime;
	}
	public void setExpiretime(Date expiretime) {
		this.expiretime = expiretime;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}
	public List<Book> getBooks() {
		return books;
	}
	public void setBooks(List<Book> books) {
		this.books = books;
	}
	public String getTianshu() {
		//如果returntime有值说明该书已经归还,没有租书剩余天数
		if(this.returntime!=null) {
			return "";
		}
		Date now=new Date();
		//归还书的时间
		long t1=this.expiretime.getTime();
		long t2=now.getTime();
		//现在距离书预期归还的时间还剩多少天
		this.tianshu=(int) ((t1-t2)/1000/3600/24)+"天";
		return tianshu;
	}
	public void setTianshu(String tianshu) {
		this.tianshu = tianshu;
	}
	@Override
	public String toString() {
		return "BookRecord [recordid=" + recordid + ", userid=" + userid + ", bookid=" + bookid + ", lendtime="
				+ lendtime + ", returntime=" + returntime + ", expiretime=" + expiretime + ", user=" + user + ", books="
				+ books + ", tianshu=" + getTianshu() + "]";
	}
	

	

	
	

}

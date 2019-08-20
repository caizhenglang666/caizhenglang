package com.aowin.library.model;
import java.io.Serializable;
import java.util.Date;
import java.util.List;
public class BookRecord implements Serializable {
	private static final long serialVersionUID = 1L;
	private Integer recordid;
	private Integer userid;
	private Integer bookid;
	private Date lendtime;//����ʱ��
	private Date returntime;//ʵ�ʻ���ʱ��
	private Date expiretime;//Ҫ����ʱ��
	private User user;
	private List<Book> books;
	private String tianshu;//����ʣ������
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
		//���returntime��ֵ˵�������Ѿ��黹,û������ʣ������
		if(this.returntime!=null) {
			return "";
		}
		Date now=new Date();
		//�黹���ʱ��
		long t1=this.expiretime.getTime();
		long t2=now.getTime();
		//���ھ�����Ԥ�ڹ黹��ʱ�仹ʣ������
		this.tianshu=(int) ((t1-t2)/1000/3600/24)+"��";
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

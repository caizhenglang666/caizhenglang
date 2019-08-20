package com.aowin.library.web;
public class JsonResult {
	private static final int ERROR=0;
	private static final int SUCCESS=1;
	private String message;
	private Object data;
	private int state;
	public JsonResult() {
		this.state=SUCCESS;
		this.message="ok";
	}
	public JsonResult(Object data) {
		this();
		this.data=data;
	}
	public JsonResult(String message) {
		this.state=SUCCESS;
		this.message=message;
	}
	public JsonResult(String message,Object data) {
		this.state=SUCCESS;
		this.message=message;
		this.data=data;
	}
	public JsonResult(Throwable ex) {
		this.message=ex.getMessage();
		this.state=ERROR;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	public int getState() {
		return state;
	}
	public void setState(int state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "JsonResult [message=" + message + ", data=" + data + ", state=" + state + "]";
	}

}

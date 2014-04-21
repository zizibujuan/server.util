package com.zizibujuan.drip.server.util.servlet.validate;

import java.util.ArrayList;
import java.util.List;

/**
 * servlet级别的错误
 * @author jzw
 *
 */
public class ServletError {
	private String type = "servlet";
	private List<String> errors = new ArrayList<String>();
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public List<String> getErrors() {
		return errors;
	}
	public void setErrors(List<String> errors) {
		this.errors = errors;
	}
	
	public void add(String message){
		errors.add(message);
	}
	public boolean hasErrors() {
		return !errors.isEmpty();
	}
}

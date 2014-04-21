package com.zizibujuan.drip.server.util.servlet.validate;

import java.util.ArrayList;
import java.util.List;

/**
 * 字段级别的错误
 * 
 * @author jzw
 * @since 0.0.1
 */
public class FieldError {

	private String type = "field";
	
	private List<ErrorMessage> errors = new ArrayList<ErrorMessage>();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<ErrorMessage> getErrors() {
		return errors;
	}

	public void setErrors(List<ErrorMessage> errors) {
		this.errors = errors;
	}
	
	public boolean hasErrors(){
		return !errors.isEmpty();
	}
	
	public void add(String fieldName, String message){
		ErrorMessage error = new ErrorMessage();
		error.setField(fieldName);
		error.setMessage(message);
		errors.add(error);
	}
}

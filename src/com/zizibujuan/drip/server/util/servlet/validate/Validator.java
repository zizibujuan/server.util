package com.zizibujuan.drip.server.util.servlet.validate;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 服务器端校验器
 * 
 * @author jzw
 * @since 0.0.1
 */
public class Validator {

	// 以下代码借鉴自struts2
	private ServletError servletErrors; // 存储servlet级别的错误信息
	private Collection<String> servletMessages; // 存储servlet级别的提示信息
	private FieldError fieldErrors; // 存储字段级别的错误信息

	public ServletError getServletErrors() {
		if (servletErrors == null) {
			servletErrors = new ServletError();
		}
		return servletErrors;
	}

	public Collection<String> getServletMessages() {
		if (servletMessages == null) {
			servletMessages = new ArrayList<String>();
		}
		return servletMessages;
	}

	public FieldError getFieldErrors() {
		if (fieldErrors == null) {
			fieldErrors = new FieldError();
		}
		return fieldErrors;
	}

	// 判断是否有错误信息
	public boolean hasServletErrors() {
		return servletErrors != null && !servletErrors.hasErrors();
	}

	public boolean hasFieldErrors() {
		return fieldErrors != null && fieldErrors.hasErrors();
	}

	public boolean hasErrors() {
		return hasServletErrors() || hasFieldErrors();
	}

	public boolean hasServletMessages() {
		return servletMessages != null && !servletMessages.isEmpty();
	}

	// 添加错误或提示信息
	public void addServletError(String error) {
		getServletErrors().add(error);
	}

	public void addServletMessage(String message) {
		getServletMessages().add(message);
	}

	public void addFieldError(String fieldName, String message) {
		getFieldErrors().add(fieldName, message);
	}

}

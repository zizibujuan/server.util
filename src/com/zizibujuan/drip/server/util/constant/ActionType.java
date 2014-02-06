package com.zizibujuan.drip.server.util.constant;

/**
 * 活动类型
 * 
 * @author jinzw
 * @since 0.0.1
 */
public abstract class ActionType {
	
	// 要存储对应的label
	
	/**
	 * 新建习题草稿
	 */
	public static final String SAVE_EXERCISE_DRAFT = "0001";
	
	/**
	 * 编辑习题草稿
	 */
	public static final String EDIT_EXERCISE_DRAFT = "0002";
	
	/**
	 * 删除习题草稿
	 */
	public static final String DELETE_EXERCISE_DRAFT = "0003";
	
	/**
	 * 发布习题
	 */
	public static final String PUBLISH_EXERCISE = "0011";
	
	/**
	 * 解答习题
	 */
	public static final String ANSWER_EXERCISE = "0021";
	
	/**
	 * 编辑答案
	 */
	public static final String EDIT_EXERCISE_ANSWER = "0022";
	
	
}

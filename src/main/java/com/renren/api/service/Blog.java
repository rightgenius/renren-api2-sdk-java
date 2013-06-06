/**
 * Autogenerated by renren-api2-generator 2013-06-06 15:02:04
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.renren.api.service;
import java.util.*;
/**
 *
 * 日志
 */
public class Blog {
	
	/**
	 * 日志的ID
	 */
	private long id;
	/**
	 * 日志的标题
	 */
	private String title;
	/**
	 * 日志的内容
	 */
	private String content;
	/**
	 * 日志的创建时间
	 */
	private String createTime;
	/**
	 * 日志的访问控制
	 */
	private AccessControl accessControl;
	/**
	 * 日志被浏览的次数
	 */
	private int viewCount;
	/**
	 * 日志被回复的次数
	 */
	private int commentCount;
	/**
	 * 日志被分享的次数
	 */
	private int shareCount;
	/**
	 * 日志的类型
	 */
	private BlogType type;
	public void setId(long id) {
		this.id = id;
	}
	public long getId() {
		return this.id;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getTitle() {
		return this.title;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getContent() {
		return this.content;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getCreateTime() {
		return this.createTime;
	}
	public void setAccessControl(AccessControl accessControl) {
		this.accessControl = accessControl;
	}
	public AccessControl getAccessControl() {
		return this.accessControl;
	}
	public void setViewCount(int viewCount) {
		this.viewCount = viewCount;
	}
	public int getViewCount() {
		return this.viewCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	public int getCommentCount() {
		return this.commentCount;
	}
	public void setShareCount(int shareCount) {
		this.shareCount = shareCount;
	}
	public int getShareCount() {
		return this.shareCount;
	}
	public void setType(BlogType type) {
		this.type = type;
	}
	public BlogType getType() {
		return this.type;
	}
}

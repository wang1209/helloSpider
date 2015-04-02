/**
 * 
 */
package org.sdgit.spider.domain.model;

import java.util.Date;

/**
 * @author WonderYoung
 *
 */
public class WebInfoEntity implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String name;
	private String url;
	private String path;
	private Date createDate;

	public WebInfoEntity() {
	}

	public WebInfoEntity(int id) {
		this.id = id;
	}

	public int getId() {
		return this.id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}
	public Date getCreateDate() {
		return this.createDate;
	}

	public void setCreateDate(Date date) {
		this.createDate = date;
	}
}

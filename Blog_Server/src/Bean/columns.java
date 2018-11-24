package Bean;

import java.sql.Timestamp;

public class columns implements java.io.Serializable{
	private Long id;
	private String aliasName;
	private String columnName;
	private String createBy;
	private Timestamp createDate;
	private String description ;
	private String keyWords;
	private Long parentId;
	private Long sort;
	private String status;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getAliasName() {
		return aliasName;
	}
	public void setAliasName(String aliasName) {
		this.aliasName = aliasName;
	}
	public String getColumnName() {
		return columnName;
	}
	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}
	public String getCreateBy() {
		return createBy;
	}
	public void setCreateBy(String createBy) {
		this.createBy = createBy;
	}
	public Timestamp getCreateDate() {
		return createDate;
	}
	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public Long getParentId() {
		return parentId;
	}
	public void setParentId(Long parentId) {
		this.parentId = parentId;
	}
	public Long getSort() {
		return sort;
	}
	public void setSort(Long sort) {
		this.sort = sort;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	@Override
	public String toString() {
		return "columns [id=" + id + ", aliasName=" + aliasName + ", columnName=" + columnName + ", createBy="
				+ createBy + ", createDate=" + createDate + ", description=" + description + ", keyWords=" + keyWords
				+ ", parentId=" + parentId + ", sort=" + sort + ", status=" + status + "]";
	}
	
	
}

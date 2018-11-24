package Bean;

import java.sql.Timestamp;

public class Article implements java.io.Serializable{
	private Long id;
	private String title;
	private String content;
	private String keyWords;
	private String description;
	private Long columnId;
	private String label;
	private String titlemgs;
	private String status;
	private String type;
	private Timestamp relaseTime;
	private String author;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getKeyWords() {
		return keyWords;
	}
	public void setKeyWords(String keyWords) {
		this.keyWords = keyWords;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public Long getColumnId() {
		return columnId;
	}
	public void setColumnId(Long columnId) {
		this.columnId = columnId;
	}
	public String getLabel() {
		return label;
	}
	public void setLabel(String label) {
		this.label = label;
	}
	public String getTitlemgs() {
		return titlemgs;
	}
	public void setTitlemgs(String titlemgs) {
		this.titlemgs = titlemgs;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public Timestamp getRelaseTime() {
		return relaseTime;
	}
	public void setRelaseTime(Timestamp relaseTime) {
		this.relaseTime = relaseTime;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	@Override
	public String toString() {
		return "Article [id=" + id + ", title=" + title + ", content=" + content + ", keyWords=" + keyWords
				+ ", description=" + description + ", columnId=" + columnId + ", label=" + label + ", titlemgs="
				+ titlemgs + ", status=" + status + ", type=" + type + ", relaseTime=" + relaseTime + ", author="
				+ author + "]";
	}
	
	

}

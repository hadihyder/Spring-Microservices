package com.spring.eureka;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.Table;

@Entity
@Table(name="CATEGORIES")
public class Category {
	 @Id
     @JoinColumn(name = "category_id", referencedColumnName = "CATEGORYID")

	    private int categoryID; //categoryId -> categoryID

	    @Column(name = "CATEGORYNAME") 

	    private String categoryName;

	    private String description;
	public Category(int categoryId, String categoryName, String description) {
		super();
		this.categoryID = categoryId;
		this.categoryName = categoryName;
		this.description = description;
	}
	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getCategoryId() {
		return categoryID;
	}
	public void setCategoryId(int categoryId) {
		this.categoryID = categoryId;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	@Override
	public String toString() {
		return "Category [categoryId=" + categoryID + ", categoryName=" + categoryName + ", description=" + description
				+ "]";
	}
	
	
}

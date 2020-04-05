package com.ecommerce.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;



@Entity
@Table(name="category")
public class Category {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="category_id")
	private int categoryId;
	
	@Column(name=" name")
	private String categoryName;
	
	@Column(name="parent_category")
	private int parentCategory;
	
	@Column(name="image_url")
	private String imageUrl;
	
	@Column(name="category_dercribtion")
	private String categoryDescribtion;
	
	@javax.persistence.OneToMany(mappedBy="category",
			   cascade= {CascadeType.PERSIST, CascadeType.MERGE,
						 CascadeType.DETACH, CascadeType.REFRESH})

	@Override
	public String toString() {
		return "Category [categoryId=" + categoryId + ", categoryName=" + categoryName + ", parentCategory="
				+ parentCategory + "]";
	}

	public int getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(int categoryId) {
		this.categoryId = categoryId;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}

	public int getParentCategory() {
		return parentCategory;
	}

	public void setParentCategory(int parentCategory) {
		this.parentCategory = parentCategory;
	}

	public String getImageUrl() {
		return imageUrl;
	}

	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}

	public String getCategoryDescribtion() {
		return categoryDescribtion;
	}

	public void setCategoryDescribtion(String categoryDescribtion) {
		this.categoryDescribtion = categoryDescribtion;
	}
	
	

}
	
	
	
	
	

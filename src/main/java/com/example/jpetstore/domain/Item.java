package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Item implements Serializable {
	/* Private Fields */
	private String itemId; // or int
	private String categoryId; // product 사용안함.
	private String image; // ex. /images/artwork/img.jpg
	private String description;
	private String title;
	private int price; // 우리나라는 소수점 없으니 int로
	// private int supplierId;

	private int isSoldout;
	private int likeCnt; // or 구매 횟수 --> 인기순 정렬에 사용할 것.

	private int isInWishlist;
	private int isInCart;

	private Category category;
	private int quantity;
	
	

	public String getItemId() {
		return itemId;
	}

	public void setItemId(String itemId) {
		this.itemId = itemId;
	}

	public String getCategoryId() {
		return categoryId;
	}

	public void setCategoryId(String categoryId) {
		this.categoryId = categoryId;
	}

	public String getImage() {
		return image;
	}

	public void setImage(String image) {
		this.image = image;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public int getIsSoldout() {
		return isSoldout;
	}

	public void setIsSoldout(int isSoldout) {
		this.isSoldout = isSoldout;
	}

	public int getLikeCnt() {
		return likeCnt;
	}

	public void setLikeCnt(int likeCnt) {
		this.likeCnt = likeCnt;
	}

	public int getIsInWishlist() {
		return isInWishlist;
	}

	public void setIsInWishlist(int isInWishlist) {
		this.isInWishlist = isInWishlist;
	}

	public int getIsInCart() {
		return isInCart;
	}

	public void setIsInCart(int isInCart) {
		this.isInCart = isInCart;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String toString() {
		return "(" + getItemId().trim() + "-" + getCategoryId().trim() + ")";
	}
}
package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Item implements Serializable {
  /* Private Fields */
  private String itemId;
  private String productId;
  private double listPrice;
  private double unitCost;
  private int supplierId;
  private String status;
  private String attribute1;
  private String attribute2;
  private String attribute3;
  private String attribute4;
  private String attribute5;
  private Product product;
  private int quantity;

  /* JavaBeans Properties */
  public String getItemId() { return itemId; }
  public void setItemId(String itemId) { this.itemId = itemId.trim(); }

  public int getQuantity() { return quantity; }
  public void setQuantity(int quantity) { this.quantity = quantity; }

  public Product getProduct() { return product; }
  public void setProduct(Product product) { this.product = product; }

  public String getProductId() { return productId; }
  public void setProductId(String productId) { this.productId = productId; }

  public int getSupplierId() { return supplierId; }
  public void setSupplierId(int supplierId) { this.supplierId = supplierId; }

  public double getListPrice() { return listPrice; }
  public void setListPrice(double listPrice) { this.listPrice = listPrice; }

  public double getUnitCost() { return unitCost; }
  public void setUnitCost(double unitCost) { this.unitCost = unitCost; }

  public String getStatus() { return status; }
  public void setStatus(String status) { this.status = status; }

  public String getAttribute1() { return attribute1; }
  public void setAttribute1(String attribute1) { this.attribute1 = attribute1; }
  public String getAttribute2() { return attribute2; }
  public void setAttribute2(String attribute2) { this.attribute2 = attribute2; }
  public String getAttribute3() { return attribute3; }
  public void setAttribute3(String attribute3) { this.attribute3 = attribute3; }
  public String getAttribute4() { return attribute4; }
  public void setAttribute4(String attribute4) { this.attribute4 = attribute4; }
  public String getAttribute5() { return attribute5; }
  public void setAttribute5(String attribute5) { this.attribute5 = attribute5; }

  public String toString() {
    return "(" + getItemId().trim() + "-" + getProductId().trim() + ")";
  }
}


/*package com.example.jpetstore.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Item implements Serializable {

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
}*/
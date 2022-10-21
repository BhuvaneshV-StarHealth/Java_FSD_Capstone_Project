package com.starhealth.digistore.entity;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.IdClass;
import javax.persistence.Table;

@Entity
@Table(name="ProductCart")
public class ProductCart {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int cartID;
	private int productID;
	private String userName;
	private String productName;
	private double productPrice;
	private int productQuantity;
	private String productImage;
	public int getCartID() {
		return cartID;
	}
	public void setCartID(int cartID) {
		this.cartID = cartID;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public double getProductPrice() {
		return productPrice;
	}
	public void setProductPrice(double productPrice) {
		this.productPrice = productPrice;
	}
	public int getProductQuantity() {
		return productQuantity;
	}
	public void setProductQuantity(int productQuantity) {
		this.productQuantity = productQuantity;
	}
	public String getProductImage() {
		return productImage;
	}
	public void setProductImage(String productImage) {
		this.productImage = productImage;
	}
	public ProductCart(int cartID, int productID, String userName, String productName, double productPrice,
			int productQuantity, String productImage) {
		super();
		this.cartID = cartID;
		this.productID = productID;
		this.userName = userName;
		this.productName = productName;
		this.productPrice = productPrice;
		this.productQuantity = productQuantity;
		this.productImage = productImage;
	}
	public ProductCart() {
		super();
	}
}

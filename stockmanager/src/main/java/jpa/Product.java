package jpa;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.ManyToOne;

import org.springframework.data.annotation.Id;

@Entity
public class Product implements Serializable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -1419981165783445017L;
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer productId;
	@Column
	private String productName;
	@Column
	private String productDescription;
	@ManyToOne
	private Stock stock;

	public Product(String productName, String productDescription, Stock stock) {
		super();
		this.productName = productName;
		this.productDescription = productDescription;
		this.stock = stock;
	}

	public Product() {
		super();
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductDescription() {
		return productDescription;
	}

	public void setProductDescription(String productDescription) {
		this.productDescription = productDescription;
	}

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

}

package jpa;

import java.io.Serializable;
import java.util.LinkedList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.OneToMany;

import org.springframework.data.annotation.Id;

@Entity
public class Stock implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 658167462736323780L;
	@Column
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Id
	private Integer stockId;

	@Column
	private String stockName;
	
	@Column
	private String productTypeName;

	@OneToMany
	private List<Product> products = new LinkedList<Product>();

	public Stock(String stockName, String productTypeName, List<Product> products) {
		this.productTypeName=productTypeName;
		this.stockName = stockName;
		this.products = products;
	}

	public Stock() {
	}
	
	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public Integer getStockId() {
		return stockId;
	}

	public void setStockId(Integer stockId) {
		this.stockId = stockId;
	}

}

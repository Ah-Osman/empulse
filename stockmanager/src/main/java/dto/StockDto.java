package dto;

import java.util.List;

public class StockDto {

	int stockId;
	String stockName;
	String productTypeName;
	public String getProductTypeName() {
		return productTypeName;
	}

	public void setProductTypeName(String productTypeName) {
		this.productTypeName = productTypeName;
	}

	List<ProductDto> products;

	public StockDto(int stockId, String stockName,String productTypeName, List<ProductDto> products) {
		super();
		this.stockId = stockId;
		this.stockName = stockName;
		this.productTypeName=productTypeName;
		this.products = products;
	}

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getStockName() {
		return stockName;
	}

	public void setStockName(String stockName) {
		this.stockName = stockName;
	}

	public List<ProductDto> getProducts() {
		return products;
	}

	public void setProducts(List<ProductDto> products) {
		this.products = products;
	}

}

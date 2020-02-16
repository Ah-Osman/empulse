package empulse.de.Entity;

public class ProductStock {
	private int stockId;
	private String productName;
	private long amount;

	public int getStockId() {
		return stockId;
	}

	public void setStockId(int stockId) {
		this.stockId = stockId;
	}

	public String getProductName() {
		return productName;
	}

	@Override
	public String toString() {
		return "ProductStock [stockId=" + stockId + ", productName=" + productName + ", amount=" + amount + "]";
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public long getAmount() {
		return amount;
	}

	public void setAmount(long amount) {
		this.amount = amount;
	}

	public ProductStock(int stockId, String productName, long amount) {
		super();
		this.stockId = stockId;
		this.productName = productName;
		this.amount = amount;
	}

	public ProductStock() {
		super();
	}

}

package empulse.de.Entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class ProductItem {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer id;
	@Column
	private String itemName;
	@Column
	private String itemDescription;
	@ManyToOne
	private Stock stock;

	public Stock getStock() {
		return stock;
	}

	public void setStock(Stock stock) {
		this.stock = stock;
	}

	public long getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getItemDescription() {
		return itemDescription;
	}

	public void setItemDescription(String itemDescription) {
		this.itemDescription = itemDescription;
	}

	public ProductItem() {
		super();
	}

	public ProductItem(String itemName, String itemDescription, Stock stock) {
		super();
		this.stock = stock;
		this.itemName = itemName;
		this.itemDescription = itemDescription;
	}

	@Override
	public String toString() {
		return "ProductItem [id=" + id + ", itemName=" + itemName + ", itemDescription=" + itemDescription + ", stock=" + stock.getId() + "]";
	}

}

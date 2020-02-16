package stockItems.stockmanager;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import dto.ProductService;
import dto.StockDto;
import dto.StockService;
import jpa.Product;

@RequestMapping("/stock")
@RestController
public class StockController {
	@Autowired
	StockService stockService;
	@Autowired
	ProductService productService;

	@RequestMapping("/stockInformation/{stockId}")
	public StockDto getStockInformation(@PathVariable Integer stockId) {
		return stockService.getStockInformation(stockId);
	}

	@RequestMapping("/productInformation/{productId}")
	public Product getProductInformation(@PathVariable Integer productId) {
		return productService.getProductInformation(productId);
	}

	@RequestMapping("/refillStock/{stockId}")
	public void refillStock(@PathVariable Integer stockId) {
		stockService.refillStock(stockId);
	}

	@RequestMapping("/buyProduct/{stockId}")
	public void buyProduct(@PathVariable Integer productId) {
		productService.buyProduct(productId);
	}

	@RequestMapping("/getAllStocks")
	public List<StockDto> getAllStocks() {
		return stockService.getAllStocks();
	}

}

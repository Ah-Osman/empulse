package empulse.de.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import empulse.de.Entity.ProductItem;
import empulse.de.Entity.ProductItemRepository;
import empulse.de.Entity.ProductStock;
import empulse.de.Entity.Stock;
import empulse.de.Entity.StockRepository;

@RestController
public class StockController {
	@Autowired
	ProductItemRepository productItemRepository;
	@Autowired
	StockRepository stockRepository;

	@GetMapping("/stocks")
	public List<Stock> getStocks() {
		List<Stock> stocks = (List<Stock>) stockRepository.findAll();
		return stocks;
	}

	@GetMapping("/stockItems/{stockId}")
	public List<ProductItem> getStockItems(@PathVariable Integer id) throws StockNotFoundEx {
		Stock stock = stockRepository.findById(id).orElseThrow(() -> new StockNotFoundEx(id));
		List<ProductItem> items = stock.getItems();
		return items;
	}

	@PostMapping("/refillStock/{stockId}/{amount}")
	public void refillStock(@PathVariable Integer id, @PathVariable Integer amount,@Param(value = "product") ProductItem product)
			throws StockNotFoundEx {
		Stock stock = stockRepository.findById(id).orElseThrow(() -> new StockNotFoundEx(id));
		List<ProductItem> items = stock.getItems();
		for (int i = 0; i < amount; i++) {
			items.add(product);
		}
		stockRepository.save(stock);
	}

	@GetMapping("/productStock")
	public List<ProductStock> getStockOfProduct() {
		List<ProductStock> prodStocks = productItemRepository.groupBy();
		return prodStocks;
	}

	@PostMapping("/buyProduct/{productId}")
	public void buyProduct(@PathVariable Integer id) {
		productItemRepository.deleteById(id);
	}

}

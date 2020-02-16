package jpa;

import java.util.stream.Collectors;

import dto.StockDto;

public class StockCoverter {

	public static StockDto entityToDto(Stock stock) {
		StockDto stockDto = new StockDto(stock.getStockId(), stock.getStockName(), stock.getProductTypeName(), null);
		stockDto.setProducts(stock.getProducts().stream().map(ProductConverter::entitytoDto).collect(Collectors.toList()));
		return stockDto;
	}
	
	public static Stock dtoToEntity(StockDto stockDto) {
		Stock stock = new Stock(stockDto.getStockName(), stockDto.getProductTypeName(), null);
		stock.setStockId(stockDto.getStockId());
		stock.setProducts(stockDto.getProducts().stream().map(ProductConverter::dtoToEntity).collect(Collectors.toList()));
		return stock;
	}

}

package dto;

import java.util.List;

public interface StockService {
	
	public StockDto getStockInformation(Integer stockId);
	public void refillStock(Integer stockId);
	public List<StockDto> getAllStocks();

}

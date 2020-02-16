package dto;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import jpa.StockCoverter;
import jpa.StockRepository;

@Service
public class StockServiceImpl implements StockService{
	
	@Autowired
	StockRepository stockRepository;

	@Override
	public StockDto getStockInformation(Integer stockId) {
		return StockCoverter.entityToDto(stockRepository.getOne(stockId));
	}

	@Override
	public void refillStock(Integer stockId) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<StockDto> getAllStocks() {
		return stockRepository.findAll().stream().map(StockCoverter::entityToDto).collect(Collectors.toList());
	}

}

package jpa;

import dto.ProductDto;

public class ProductConverter {
	
	public static Product dtoToEntity(ProductDto productDto) {
		Product product = new Product(productDto.getProductName(), productDto.getProductDescription(), null);
		product.setProductId(productDto.getProductId());
		return product;
	}
	
	public static ProductDto entitytoDto(Product product) {
		return new ProductDto(product.getProductId(), product.getProductName(), product.getProductDescription());
	}

}

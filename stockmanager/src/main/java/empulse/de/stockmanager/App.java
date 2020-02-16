package empulse.de.stockmanager;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import empulse.de.Entity.ProductItem;
import empulse.de.Entity.ProductItemRepository;
import empulse.de.Entity.Stock;
import empulse.de.Entity.StockRepository;

@EntityScan("empulse.de.Entity")
@SpringBootApplication
@EnableJpaRepositories(basePackages = { "empulse.de.Entity" })
public class App {
	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	CommandLineRunner init(StockRepository stockRepository, ProductItemRepository productItemRepository) {
		return args -> {
			Stock stck = new Stock("initial Stock", null);
			List<ProductItem> itemsList = new ArrayList<ProductItem>();
			for (int i = 0; i < 100; i++) {
				itemsList.add(new ProductItem("initialProduct", "item-" + i,stck));
			}
			stck.setItems(itemsList);
			stockRepository.save(stck);
//			stockRepository.findAll().forEach(System.out::println);
//			productItemRepository.findAll().forEach(System.out::println);
		};
	}
}
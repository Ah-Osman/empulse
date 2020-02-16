package empulse.de.Entity;

import java.util.List;


import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface ProductItemRepository extends CrudRepository<ProductItem, Integer>{
	
	@Query("select new empulse.de.Entity.ProductStock (p.stock.id as stockId, "
														+"p.itemName as productName, "
														+"count(p.id) as amount) "
														+"from ProductItem p "
														+"group by p.stock.id, p.itemName")
	public List<ProductStock> groupBy();

}

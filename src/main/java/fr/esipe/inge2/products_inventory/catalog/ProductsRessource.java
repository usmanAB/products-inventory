package fr.esipe.inge2.products_inventory.catalog;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductsRessource {

	@Autowired private CatalogService catalogService;
	@GetMapping(value="/products")
	
	public List<ProductCatalog> getProductCatalog(){
	return catalogService.getProductCatalog();
	}

}

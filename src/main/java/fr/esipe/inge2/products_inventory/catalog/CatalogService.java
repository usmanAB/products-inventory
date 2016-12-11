package fr.esipe.inge2.products_inventory.catalog;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CatalogService {
	@Autowired CatalogGateway catalogGateway;
	
	private Map<String, ProductCatalog> products =
			new HashMap<String, ProductCatalog>();
	
	//private List<ProductCatalog> products = new ArrayList<ProductCatalog>();

	

	public List<ProductCatalog> getProductCatalog() {
			
			return new ArrayList<>(products.values());
		}
	
	
	public void loadProductCatalog(){
		catalogGateway.getCatalogFromServer()
				.stream().forEach(
						p-> products.put(p.getId(),p));
	}


	public ProductCatalog getProductById(String id) {
			
			return products.get(id);
		}
}

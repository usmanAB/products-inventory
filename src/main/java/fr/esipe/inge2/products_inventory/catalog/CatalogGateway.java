package fr.esipe.inge2.products_inventory.catalog;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class CatalogGateway {
	private final String wsUrl = "http://95.85.54.70:8080/";
	
	public List<ProductCatalog> getCatalogFromServer(){
		RestTemplate restTemplate = new RestTemplate();
		ProductCatalog[] catalog=
				restTemplate.getForObject(wsUrl+"/products-catalog",ProductCatalog[].class);
	
	List<ProductCatalog> productCatalog=
			new ArrayList<ProductCatalog>(Arrays.asList(catalog));
	
	
	return productCatalog;
	}
	
}

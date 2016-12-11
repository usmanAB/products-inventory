package fr.esipe.inge2.products_inventory.catalog;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;
import org.junit.*;

@RunWith(SpringRunner.class)
//On force le contexte, cad, on ajoute le bean dans le contexte

@SpringBootTest
@ContextConfiguration
//Scan de tous les contexts de bean manager
public class CatalogGatewayTest {
	@Autowired CatalogGateway catalogGatewaySUT;
	
	@Test public void shouldLoadCatalogFromWs(){
		//CatalogGateway cg = new CatalogGateway();
		//List<ProductCatalog> array=catalogGatewaySUT.getCatalogFromServer();
		//System.out.println(catalogGatewaySUT.getCatalogFromServer().size());
		Assert.assertFalse(catalogGatewaySUT.getCatalogFromServer().isEmpty());
		

	}
}

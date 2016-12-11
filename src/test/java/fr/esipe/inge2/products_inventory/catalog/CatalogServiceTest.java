package fr.esipe.inge2.products_inventory.catalog;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import fr.esipe.inge2.products_inventory.ProductsInventoryApplication;

import static org.mockito.Mockito.when;
import java.util.*;

import javax.validation.constraints.AssertTrue;
@RunWith(MockitoJUnitRunner.class)
public class CatalogServiceTest {

	
	@Mock CatalogGateway catalogGateway;
	@InjectMocks CatalogService catalogServiceSUT;
	
	@Before
	public void wedontknowyet(){
		//Arrange
		List<ProductCatalog> listProduitsMocked = new ArrayList<ProductCatalog>();
		ProductCatalog mocked = new ProductCatalog();
		mocked.setId("5");
		mocked.setRef("chiffre");
		listProduitsMocked.add(mocked);
		
		when(catalogGateway.getCatalogFromServer()).thenReturn(listProduitsMocked);//on fixe le comportement du mock
		
		
		//Act
		catalogServiceSUT.loadProductCatalog(); //charger la map
	//	List<ProductCatalog> products = catalogServiceSUT.getProductCatalog();//recuperer le catalgue
		//catalogServiceSUT.getProductCatalog();
	
		//Verify -> faire jouer les tests et vérifier les tests
		
		}
	
	@Test
	public void shouldReturnAlistFrom(){
		List<ProductCatalog> products = catalogServiceSUT.getProductCatalog();//recuperer le catalogue
		Assert.assertTrue(products.get(0).getRef().equals("chiffre"));
	}
	
	@Test
	public void shouldReturnProduct(){
		ProductCatalog myProduct = catalogServiceSUT.getProductById("5");  //recuperer le produit
		Assert.assertTrue(myProduct.getRef().equals("chiffre"));
	}
	
}

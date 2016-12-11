package fr.esipe.inge2.products_inventory.catalog;

import org.junit.Assert;
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
	
	public void wedontknowyet(){
		//Arrange
		List<ProductCatalog> listProduitsMocked = new ArrayList<ProductCatalog>();
		ProductCatalog mocked = new ProductCatalog();
		mocked.setId("MYID");
		mocked.setRef("XYZ");
		listProduitsMocked.add(mocked);
		
		when(catalogGateway.getCatalogFromServer()).thenReturn(listProduitsMocked);
		
		
		//Act
		catalogServiceSUT.loadProductCatalog(); //charger la map
	//	List<ProductCatalog> products = catalogServiceSUT.getProductCatalog();//recuperer le catalgue
		//catalogServiceSUT.getProductCatalog();
	
		//Verify -> faire jouer les tests et vérifier les tests
		
		}
	
	@Test
	public void shouldReturnAlistFrom(){
		List<ProductCatalog> products = catalogServiceSUT.getProductCatalog();
		Assert.assertTrue(products.get(0).getRef().equals("XYZ"));
	}
	
	@Test
	public void shouldReturnProduct(){
		ProductCatalog myProduct = (ProductCatalog) catalogServiceSUT.getProductById("MYID"); //recuperer le produit
		Assert.assertTrue(myProduct.getRef().equals("XYZ"));
	}
	
}

package fr.esipe.inge2.products_inventory.catalog;

import java.math.BigDecimal;

public class ProductCatalog {
	
	private String id;
	private String ref;
	private String manufacturer;
	private String description;
	private BigDecimal unitPrice;
	private String currency;
	private int minimumItemsPerOrder;
	
	public ProductCatalog() {
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getRef() {
		return ref;
	}
	public void setRef(String ref) {
		this.ref = ref;
	}
	public String getManufacturer() {
		return manufacturer;
	}
	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public BigDecimal getUnitPrice() {
		return unitPrice;
	}
	public void setUnitPrice(BigDecimal unitPrice) {
		this.unitPrice = unitPrice;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public int getMinimumItemsPerOrder() {
		return minimumItemsPerOrder;
	}
	public void setMinimumItemsPerOrder(int minimumItemsPerOrder) {
		this.minimumItemsPerOrder = minimumItemsPerOrder;
	}
	
}

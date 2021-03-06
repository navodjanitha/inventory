package inventory.app.InventoryApplication.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import inventory.app.InventoryApplication.model.Product;
import inventory.app.InventoryApplication.service.ProductService;

@RestController
@RequestMapping(path = "api/v1/product")
public class ProductController {
	private final ProductService productService;
	
	@Autowired
	public ProductController(ProductService productService) {
		this.productService = productService;
	}

	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}
	

}

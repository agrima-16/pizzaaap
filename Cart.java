package in.ac.sharda.pizzzza;

import java.util.ArrayList;
import java.util.List;

public class Cart {
	private List<Product> products=new ArrayList<>();
	
	public void addProducts(Product product){
		this.products.add(product);
		
	}

}

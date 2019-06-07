package in.ac.sharda.pizzzza;

import java.util.ArrayList;
import java.util.List;



import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class productlistcontroller {
	public class ProductListController{
		@GetMapping("/product/list")
		public List<Product> product(){
			List<Product>product=new ArrayList<>();
			for(int i = 1;i<20;i++){
				product.add(new Product(i,i*10,"Name"+i,"Desc"+i));
				
			}
		 return product;
		 
		}
	}
}
	
		




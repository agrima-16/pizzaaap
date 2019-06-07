package in.ac.sharda.pizzzza;

public class Product {
	private String name,description;
	private int id;
	private int price;
	
	public Product(int i, int j, String string, String string2) {
		
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name=name;
	}
	public String getDescription(){
		return description;
	}
	public void setdescription(String discription){
		this.description=description;
	}
	public int getId(){
		return id;
	}
	public void setId(){
		this.id=id;
	}
	 public int getPrice(){
		 return price;
	 }
	 @Override
	 public boolean equals(Object obj){
		 if(obj!=null && obj instanceof Product)
			 return ((Product)obj).getId()== id;
		 return false;
		 
	 }
	

}

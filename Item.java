
public class Item {
	//Attributes
	private int id;
	private String name;
	private String ssn; // catalog number
	private int quantity;
	private float cost;
	private float price;
	
	//Constructors
	public Item(int id, String name, String ssn, int quantity, float cost, float price) {
		super();
		this.id = id;
		this.name = name;
		this.ssn = ssn;
		this.quantity = quantity;
		this.cost = cost;
		this.price = price;
	}

	//Default values for quantity, cost, price = ZIRO
	public Item(int id, String name, String ssn) {
		this(id,name,ssn,0,0,0);
	}

	//End of Constructors
	
	//Getters Setters
	
	//id
	public int getId() {
		return id;
	}

	//name
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	//ssn
	public String getSsn() {
		return ssn;
	}
	
	public void getSsn(String ssn) {
		this.ssn = ssn;
	}
	
	//quantity
	public int getQuantity() {
		return quantity;
	}
	
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	//cost
	public float getCost() {
		return cost;
	}
	
	public void setCost(float cost) {
		this.cost = cost;
	}
	
	//price
	public float getPrice() {
		return price;
	}
	
	public void setPrice(float price) {
		this.price = price;
	}
	//End of Getters and Setters
	
	//Methods
	
	
	//+getItemProfit()		price - cost
	public float getItemProfit() {
		return price - cost;
	}//End of getItemProfit
	
	//+getStocklValue() 	quantity * price
	public float getStocklValue() {	
		return quantity * price;
	}//End of getStocklValue
	
	public String toString() {
		return "Item id: " + id + " SSN: " + ssn + " Name: " + name + " Quantity: " + quantity + " Price: " + price + " Cost: " + cost;
	}//End of toString
	
	public boolean equals(int id) {
		return this.id == id;
	}//End of equals
	
	public boolean equals(Item item) {
		if(item == null) return false;
		return equals(item.getId());
	}//End of equals
	
	public String getListDefincies() {
		if( getQuantity() != 0)	return "";
		return toString();
	}//End of getListDefincies
	
}//End of Class

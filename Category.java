import java.util.ArrayList;

public class Category {
	//Attributes
	private int id;
	private String name;
	private ArrayList<Item> items;
	
	
	//Constructors
	public Category(int id, String name, ArrayList<Item> items) {
		super();
		this.id = id;
		this.name = name;
		this.items = items;
	}//End of Constructor

	public Category(int id, String name){
		this(id,name, new ArrayList<Item>());
	}//End of Constructor
	//End of Constructors

	//Getters and Setters

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}	
	
	//End of Getters and Setters
	
	//Methods
	
	//totalCount
	public int getlItemsCount() {
		return items.size();
	}//End of getlItemsCount
	
	public int size() {
		return items.size();
	}//End of size

	public int getItemsStockQuantity() {
		int quantity = 0;
		for(int iindex = 0; iindex < items.size(); iindex++) quantity += items.get(iindex).getQuantity();
		return quantity;
	}//End of getItemsQuantity
	
	public float getStocklValue()	{
		float sum = 0;
		for(int index = 0; index < items.size(); index++) sum += items.get(index).getStocklValue();
		return sum ;
	}//End of getStocklValue
		
	public float averagePrice() {
		return getStocklValue() / getItemsStockQuantity();
	}//End of averagePrice
	
	public boolean addItem(Item item) {
		if(item == null) return false;
		if(findItem(item.getId()) == true) return false;
			items.add(item);
			return true;
	}//End of addItem

	public boolean addItem(int id, String name, String ssn) {
		Item item = new Item(id,name, ssn);
		return this.addItem(item);	
	}//End of addItem

	public boolean addItem(int id, String name, String ssn, int quantity, float cost, float price) {
		Item item = new Item(id,name, ssn, quantity, cost, price);
		return this.addItem(item);	
	}//End of addItem
	
	public boolean removeItem(int id) {
		for(int index = 0; index < items.size(); index++) 
			if(items.get(index).equals(id)) {
				items.remove(index);
				return true;
			}//End of if
		return false;
	}//End of removeItem
	
	public boolean removeItem(Item item) {
		if (item == null) return false;
		return removeItem(item.getId());
	}//End of removeItem
	
	public int getItemIndex(int id) {
		for(int index = 0; index < items.size(); index++)
			if( items.get(index).equals(id) == true) return index;
		return -1;
	}//End of class
	
	public int getItemIndex(Item item) {
		if (item == null) return -1;
		return getItemIndex(item.getId());
	}//End of class
	
	public Item getItemByIndex(int index) {
		if(index < 0 & index >= items.size()) return null;
		return items.get(index);
	}//End of getItemByIndex
	
	public boolean removeItemByIndex(int index) {
		if(index < 0 & index >= items.size()) return false;
		items.remove(index);
		return true;
	}//End of removeItemByIndex 
	
	public String toString() {
		String str = "Category Name: " + getName() + " Id: " + getId();
		for(int index = 0; index < items.size(); index++) str += "\n" + items.get(index);
		return str;
	}//End of toString
	
	public boolean equals(int id) {
		return this.id == id;
	}//End of equals
	
	public boolean equals(Category cat) {
		if(cat == null) return false;
		return equals(cat.getId());
	}//End of equals

	public String getListDefincies() {
		String str = "Category " + getName();
		for(int index = 0; index < items.size(); index++) 
			if(items.get(index).getListDefincies().length() > 0)
				str += "\n" + items.get(index).getListDefincies();
		return str;
	}//End of getListDefincies
	
	public boolean findItem(int id) {
		for(int index = 0; index < items.size(); index++)
			if(items.get(index).equals(id) == true) return true;
		return false;
	}//End of findItem

	public boolean findItem(Item item) {
		if(item == null) return false;
		return findItem(item.getId());
	}//End of findItem
		
	public Item getItem(int id) {
		for(int index = 0; index < items.size(); index++)
			if(items.get(index).equals(id) == true) return items.get(index);
		return null;
	}//End of getItem

	public Item getItem(Item item) {
		if(item == null) return null;
		return getItem(item.getId());
	}//End of getItem

}//End of Class


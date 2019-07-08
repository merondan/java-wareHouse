import java.util.ArrayList;

public class WareHouse {
	//Attributes
	ArrayList<Category> category;
	
	//Singleton
	private static WareHouse instance = null;
	
	public static WareHouse getInstance() {
		if(instance == null) instance = new WareHouse();
		return instance;
	}//End of getInstance

	private WareHouse() {
		super();
		category = new ArrayList<Category>();
	}//End of constructor
	
	//Methods

	public boolean addCategory(Category cat) {
		if(cat == null) return false;
		if(findCategory(cat.getId()) == true) return false; 
		boolean flag = true;
		Category tmpCat = new Category(cat.getId(),cat.getName());
		category.add(tmpCat);
		for(int index =0; index < cat.size(); index++)
			//will add only A unique items from the category cat to the warehouse
			flag = flag & (addItem(tmpCat.getId(), cat.getItemByIndex(index)));
		return flag;
	}//End of addCategory
	
	public boolean removeCategory(int id) {
		for(int iindex = 0; iindex < category.size(); iindex++)
			if(category.get(iindex).equals(id) == true ) return category.remove(iindex) != null;
		return false;
	}//End of removeCategory

	public boolean removeCategory(Category cat) {
		if(cat == null) return false;
		return removeCategory(cat.getId());
	}//End of removeCategory

	public boolean setCategoryName(int id, String name) {
		for(int index =0; index < category.size(); index++)
			if(category.get(index).equals(id) == true) {
				category.get(index).setName(name);
				return true;
			}//End of if
		return false;
	}//End of setCategory

	public Category getCategory(int id) {
		for(int index = 0; index < category.size(); index++)
			if(category.get(index).equals(id) == true) return category.get(index);
		return null;
	}//End of getCategory
	
	public float getStockValue() {
		float stockValue = 0;
		for(int index =0; index < category.size(); index++)
			stockValue += category.get(index).getStocklValue();
		return stockValue;
	}//End of getStocklValue
	
	public int getlItemsCount() {
		int itemsCount = 0;
		for(int index = 0; index < category.size(); index++)
			itemsCount += category.get(index).getlItemsCount();
		return itemsCount;
	}//End of getlItemsCount
	
	public int getItemsStockQuantity() {
		int itemsQuantity = 0;
		for(int index = 0; index < category.size(); index++)
			itemsQuantity += category.get(index).getItemsStockQuantity();
		return itemsQuantity;
	}//End of getItemsStockQuantity
	
	public float getAveragePrice() {		
		return getStockValue() / getItemsStockQuantity();
	}//End of getAveragePrice
	
	//Number of item in stock level zero
	public String getListDefincies() {
		String str = "";
			for(int index = 0; index < category.size(); index++)
				str += category.get(index).getListDefincies();
		return str;
	}//End of getListDefincies
	
	public void printListDefincies() {
		System.out.print(getListDefincies());
	}//End of printListDefincies
	
	boolean addItem(int categoryId,Item item) {
		if(item == null) return false;//no item to add
		if(findItem(item.getId())== true) return false;//if item exist cannot add item with same id
		if(findCategory(categoryId) == false) return false;//Check that category exist
		return getCategory(categoryId).addItem(item);//add the item to the category in warehouse
	}//End of addItem(category,item)
	
	boolean removeItem(int id) {
		for(int index = 0; index < category.size(); index++)
			if(category.get(index).removeItem(id) == true) return true;
		return false;
	}//End of removeItem
	
	boolean findCategory( int id) {
		for(int index = 0; index < category.size(); index++)
			if( category.get(index).equals(id) == true) return true;
		return false;
	}//End of findCategory
	
	boolean findItem( int id) {
		for(int index = 0; index < category.size(); index++)
			if( category.get(index).findItem(id) == true) return true;
		return false;
	}//End of findItem

	boolean findItem( Item item) {
		if(item == null) return false;
		return findItem(item.getId());
	}//End of findItem
	
	public String toString() {
		String str = "WareHouse";
		for(int index = 0; index < category.size(); index++)
			str += "\n" + category.get(index).toString();
		return str;
	}//End of toString
	
}//End of class

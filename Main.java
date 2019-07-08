import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		Item item = new Item(0,"item"+0,"ssn" + 0);
		System.out.println("Print new item" + "\n" + item);

		ArrayList<Item> arrayList = new ArrayList<Item>();	
		ArrayList<Item> arrayList2 = new ArrayList<Item>();	
		ArrayList<Item> arrayList3 = new ArrayList<Item>();	
		//Item(int id, String name, String ssn, int quantity, float cost, float price)

		for(int i = 0; i < 10; i++) {
			arrayList.add(new Item(i,"item" + 1,"ssn"+i ,i ,i ,2*i));
		}//End of for

		for(int i = 0; i < 10; i++) {
			arrayList2.add(new Item(100+i,"item" + 2,"ssn2"+i ,i ,i ,2*i));
		}//End of for

		for(int i = 0; i < 12; i++) {
			arrayList3.add(new Item(100+i,"item" + 2,"ssn3"+i ,i ,i ,2*i));
		}//End of for

		System.out.println("Print new created arrayList");
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i));
		}//End of for

		System.out.println("Print equals");
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).equals(item));
		}//End of for

		System.out.println("Print arrayList contains (default method of ArrayList");
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.contains(item));
		}//End of for

		System.out.println("Print profit");
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getItemProfit());
		}//End of for

		System.out.println("Print getStocklValue");
		for(int i = 0; i < arrayList.size(); i++) {
			System.out.println(arrayList.get(i).getStocklValue());
		}//End of for

		//Category(int id, String name, ArrayList<Item> items)
		Category cat1 = new Category(1, "category1", arrayList);
		Category cat2 = new Category(2, "category2", arrayList2);
		Category cat3 = new Category(3, "category3", arrayList3);

		System.out.println("Print Category");
		System.out.println(cat1);
		
		System.out.println("add item (id = 0) "+ cat1.addItem(item));
		System.out.println("remove item (id = 0) "+ cat1.removeItem(item));
		System.out.println("add item (id = 0) "+ cat1.addItem(item));
		System.out.println("remove item (id = 0) "+ cat1.removeItem(item));
		System.out.println("add item (id = 0) "+ cat1.addItem(item));
		System.out.println("add item (id = 0) "+ cat1.addItem(item));
		System.out.println("remove item (id = 0) "+ cat1.removeItem(item));
		System.out.println("remove item (id = 0) "+ cat1.removeItem(item));
		
		System.out.println("average pricey");
		System.out.println(cat1.averagePrice());

		System.out.println("getItemsStockQuantity");
		System.out.println(cat1.getItemsStockQuantity());

		System.out.println("getStocklValue");
		System.out.println(cat1.getStocklValue());

		//System.out.println("getListDefincies cat1");
		System.out.println(cat1.getListDefincies());
		System.out.println("Set id1,2,3 to quantity to ziro");
		
		cat1.getItem(1).setQuantity(0);
		cat1.getItem(2).setQuantity(0);
		cat1.getItem(3).setQuantity(0);

		System.out.println("getListDefincies");
		System.out.println(cat1.getListDefincies());

		WareHouse war = WareHouse.getInstance();
		System.out.println("wareHouse to string\n" + war.toString());
		System.out.println("wareHouse add category 1 " + war.addCategory(cat1));
		System.out.println("wareHouse to string\n" + war.toString());
		
		System.out.println("wareHouse add item id 0 cat 0 (cat id = 0, not exist) - " + war.addItem(0, item));
		System.out.println("wareHouse to string\n" + war.toString());

		
		System.out.println("wareHouse add item id 0 cat 1 " + war.addItem(1, item));
		System.out.println("wareHouse to string\n" + war.toString());
		
		System.out.println("wareHouse remove item id 0 " + war.removeItem(item.getId()));
		System.out.println("wareHouse to string\n" + war.toString());
		System.out.println("wareHouse remove item id 0 " + war.removeItem(item.getId()));

		
		System.out.println("wareHouse add item id 0 " + war.addItem(1, item));
		System.out.println("wareHouse add category 2 " + war.addCategory(cat2));
		System.out.println("wareHouse add category 2 " + war.addCategory(cat2));
		System.out.println("wareHouse to string\n" + war.toString());

		
		System.out.println("wareHouse remove category 2 " + war.removeCategory(cat2));
		System.out.println("wareHouse remove category 2 " + war.removeCategory(cat2));
		System.out.println("wareHouse add category 2 " + war.addCategory(cat2));
		
		System.out.println("wareHouse add item id 0 " + war.addItem(1, item));
				
		System.out.println("wareHouse add category 2 " + war.addCategory(cat2));
		System.out.println("category 3 " + cat3);
		System.out.println("wareHouse add category 3 " + war.addCategory(cat3));
		System.out.println("wareHouse category 3 " + war.getCategory(3));
		
		
		System.out.println("wareHouse to string\n" + war.toString());

		
		//System.out.println("wareHouse remove category 2 " + war.removeCategory(cat2));
		/*
		System.out.println("wareHouse add item id 0 cat 0 " + war.addItem(0, item));
		System.out.println("wareHouse add item id 0 cat 1 " + war.addItem(1, item));
		System.out.println("wareHouse add item id 0 cat 2 " + war.addItem(2, item));
		System.out.println("wareHouse remove item id 0 " + war.removeItem(item.getId()));
		System.out.println("wareHouse add item id 0 cat 0 " + war.addItem(0, item));
		System.out.println("wareHouse add item id 0 cat 2 " + war.addItem(2, item));
		System.out.println("wareHouse add item id 0 cat 1 " + war.addItem(1, item));
		
		/*
		 * 
		System.out.println("wareHouse add the same cat 1 " + war.addCategory(cat1));
		System.out.println("wareHouse add null category " + war.addCategory(null));
		System.out.println("wareHouse add item id 0 " + war.addItem(0, item));
		System.out.println("wareHouse remove id 0 " + war.removeItem(0));
		System.out.println("wareHouse add item id 0 " + war.addItem(0, item));
		System.out.println("wareHouse get deficincies\n" + war.getListDefincies());
		System.out.println("wareHouse cat to string\n" + war.getCategory(2).toString());
		*/

		
		
	}//End of main

}//End of Class

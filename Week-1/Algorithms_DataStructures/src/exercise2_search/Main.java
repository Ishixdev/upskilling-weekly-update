package exercise2_search;

class Main {
	
	public static void main(String [] args) {
		Product p1 = new Product(101, "Laptop", "Electronics");
		Product p2 = new Product(102, "Mouse", "Electronics");
		Product p3 = new Product(103, "Chair", "Furniture");
		Product p4 = new Product(104, "Keyboard", "Electronics");
		Product[] products = {p1, p2, p3, p4};
		Product result1 = linearSearch(products, "Mouse");

		if (result1 != null)
		    System.out.println("Found using Linear Search: " + result1.productName);
		
		Product result2 = binarySearch(products, "Mouse");

		if (result2 != null)
		    System.out.println("Found using Binary Search: " + result2.productName);
	}
	
	public static Product linearSearch(Product[] products, String name) {
		for (Product product : products) {

	        if (product.productName.equalsIgnoreCase(name)) {
	            return product;
	        }
		}
		
	return null;	
	}
	
	public static Product binarySearch(Product[] products, String name){
		int left = 0;
	    int right = products.length - 1;

	    while (left <= right) {

	        int mid = (left + right) / 2;

	        int comparison = products[mid].productName.compareToIgnoreCase(name);

	        if (comparison == 0) {
	            return products[mid];
	        }
	        else if (comparison < 0) {
	            left = mid + 1;
	        }
	        else {
	            right = mid - 1;
	        }

	    }

	    return null;
	
		
	}

}

package lab8.day1.problem2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;



public class ProductInfo {
	
	
	static enum SortMethod {BYNAME, BYSALARY};
	
	public void sort(List<Product> products, final SortMethod method) {
		class EmployeeComparator implements Comparator<Product> {
			
			@Override
			public int compare(Product p1, Product p2) {
				if(method == SortMethod.BYNAME) {
					return p1.title.compareTo(p2.title);
				} else {
					if(p1.price == p2.price) return 0;
					else if(p1.price < p2.price) return -1;
					else return 1;
				}
			}
		}
		Collections.sort(products, new EmployeeComparator());
	}
	
	
	public void sortLambda(List<Product> products) {
		
		Collections.sort(products, (p1, p2) ->
		{
			int result;
			result = p1.title.compareTo(p2.title);
			if (result == 0) {
				if(p1.model == p2.model) return 0;
				else if(p1.model < p2.model) return -1;
				else return 1;
			}
			return result;
		});
	}
	

	public static void main(String[] args) {
		
		List<Product> products = loadData();
		Collections.sort(products, new ProductComparatorPrice());
		System.out.println(products);
		
		
		List<Product> products1 = loadData();
		Collections.sort(products1, new ProductComparatorTitle());
		System.out.println(products1);	
		
		
		List<Product> products2 = loadData();
		ProductInfo pi = new ProductInfo();
		pi.sort(products2, ProductInfo.SortMethod.BYSALARY);
		System.out.println(products2);

		
		List<Product> products3 = loadData();
		pi.sort(products3, ProductInfo.SortMethod.BYNAME);
		System.out.println(products3);
		
		
		List<Product> products4 = loadData();
		pi.sortLambda(products4);
		System.out.println(products4);

	}
	
	
	private static List<Product> loadData(){
		
		List<Product> products = new ArrayList<>();
		products.add(new Product("Arroz", 100000.0, 3));
		products.add(new Product("Arroz", 34000.0, 56));
		products.add(new Product("Lenteja", 50000.0, 2));
		products.add(new Product("Escoba", 89000.0, 2));
		products.add(new Product("Alverja", 60000.0, 4));
		products.add(new Product("Alverja", 78000.0, 6));
		products.add(new Product("Escoba", 45000.0, 7));
		products.add(new Product("Escoba", 25000.0, 8));
		products.add(new Product("Escoba", 90000.0, 3));
		products.add(new Product("Escoba", 78000.0, 67));
		
		return products;
	}
}

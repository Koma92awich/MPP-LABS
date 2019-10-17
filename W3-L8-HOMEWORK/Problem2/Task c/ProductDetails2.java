package lesson8Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ProductDetails2 {
	static enum SortMethod {
		BYTITLE, BYPRICE
	};

	public void sort(List<Product> pdt, SortMethod method) {

		class ProductComparator implements Comparator<Product> {
			@Override
			public int compare(Product p1, Product p2) {
				if (method == SortMethod.BYTITLE) {
					return p1.title.compareTo(p2.title);
				} else {
					if (p1.price == p2.price)
						return 0;
					else if (p1.price < p2.price)
						return -1;

					else
						return 1;
				}
			}
		}
		Collections.sort(pdt, new ProductComparator());
	}

	public static void main(String[] args) {

		List<Product> pp = new ArrayList<>();

		pp.add(new Product("Benz", 10000.0, 2018));
		pp.add(new Product("Tesla", 50000.0, 2019));
		pp.add(new Product("Ford", 5000.0, 2017));

		ProductDetails2 ppd = new ProductDetails2();
		ppd.sort(pp, SortMethod.BYPRICE);
		System.out.println(pp);
		
		ppd.sort(pp, SortMethod.BYTITLE);
		System.out.println(pp);

	}

}

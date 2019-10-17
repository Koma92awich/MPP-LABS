package lesson8Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDetailsClosures {
	static enum SortMethod {
		BYTITLE, BYPRICE
	};

	public void sort(List<Product> pdt, SortMethod method) {

		Collections.sort(pdt, (p1, p2) -> {

			if (method == SortMethod.BYTITLE) {
				//
				if (!(p1.title.equals(p2.title))) {
					return p1.title.compareTo(p2.title);
				} else {
					if (p1.model == p2.model)
						return 0;
					else if (p1.model < p2.model)
						return -1;
					else
						return 1;
				}
			} else {
				if (p1.price == p2.price)
					return 0;
				else if (p1.price < p2.price)
					return -1;

				else
					return 1;
			}
		});
	}

	public static void main(String[] args) {

		List<Product> pp = new ArrayList<>();

		pp.add(new Product("Benz", 10000.0, 2018));
		pp.add(new Product("Tesla", 150000.0, 2019));
		pp.add(new Product("Benz", 12000.0, 2017));
		pp.add(new Product("Benz", 8000.0, 2010));

		ProductDetailsClosures ppd = new ProductDetailsClosures();
		ppd.sort(pp, SortMethod.BYPRICE);
		System.out.println("Comaparing By Price");
		System.out.println(pp);

		System.out.println();
		System.out.println();
		ppd.sort(pp, SortMethod.BYTITLE);
		System.out.println("Comparing By Title");
		System.out.println(pp);

	}

}

package lesson8Labs;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ProductDetails {
	static enum SortMethod {
		BYTITLE, BYPRICE
	};

	SortMethod method;

	public ProductDetails(SortMethod method) {
		this.method = method;
	}

	public void sort(List<Product> pdt) {

		if (method == SortMethod.BYTITLE) {
			Collections.sort(pdt, new TitleComparator());
		} else if (method == SortMethod.BYPRICE) {
			Collections.sort(pdt, new PriceComparator());
		}
	}

	public static void main(String[] args) {

		List<Product> pp = new ArrayList<>();

		pp.add(new Product("Benz", 10000.0, 2018));
		pp.add(new Product("Tesla", 50000.0, 2019));
		pp.add(new Product("Ford", 5000.0, 2017));

		Collections.sort(pp, new TitleComparator());
		System.out.println(pp);

		Collections.sort(pp, new PriceComparator());

	}

}

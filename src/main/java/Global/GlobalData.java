package Global;

import java.util.ArrayList;
import java.util.List;
import Model.Product;

public class GlobalData {
	public static List<Product> cart ;
	static {
		cart = new ArrayList<Product>();
	}
}

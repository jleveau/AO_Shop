package shop;

import java.util.Iterator;
import java.util.Vector;

public class Stock extends Vector<Product> {

	@Override
	public synchronized String toString() {
		StringBuilder sBuilder = new StringBuilder();
		Iterator<Product> it =this.iterator();
		while (it.hasNext()) {
			Product p = it.next();
			sBuilder.append(p.toString() + "\n");
		}
		return sBuilder.toString();
	}

}

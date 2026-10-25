package product;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Product {
	private int id;
	private String name;
	private double price;
	private boolean isAval;

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @return the price
	 */
	public double getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(double price) {
		this.price = price;
	}

	/**
	 * @return the isAval
	 */
	public boolean isAval() {
		return isAval;
	}

	/**
	 * @param isAval the isAval to set
	 */
	public void setAval(boolean isAval) {
		this.isAval = isAval;
	}
}

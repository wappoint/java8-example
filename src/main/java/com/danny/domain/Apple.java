/**
 * 
 */
package com.danny.domain;

import java.io.Serializable;

/**
 * @author 676002187@qq.com
 * @date 2018-04-27
 */
public class Apple implements Serializable {

	/**
	 * serialVersionUID long
	 */
	private static final long serialVersionUID = 8199576769578886830L;

	private long weight;
	private String color;

	public Apple(long weight, String color) {
		super();
		this.weight = weight;
		this.color = color;
	}
	/**
	 * @return the weight
	 */
	public long getWeight() {
		return weight;
	}
	/**
	 * @param weight
	 *            the weight to set
	 */
	public void setWeight(long weight) {
		this.weight = weight;
	}
	/**
	 * @return the color
	 */
	public String getColor() {
		return color;
	}
	/**
	 * @param color
	 *            the color to set
	 */
	public void setColor(String color) {
		this.color = color;
	}
	/**
	 * @return
	 * @date 2018-04-27
	 */
	@Override
	public String toString() {
		return "Apple [weight=" + weight + ", color=" + color + "]";
	}

}

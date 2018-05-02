/**
 * 
 */
package com.danny.lambda;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.danny.domain.Apple;

/**
 * 描述： parameters list arrow lambda body </br>
 * (o1,o2) -> o1.getColor().compareTo(o2.getColor());
 * 
 * </br>
 * (parameters) -> expression. </br>
 * (parameters) -> {statements;} </br>
 * () -> {} </br>
 * () -> ""
 * 
 * @author 676002187@qq.com
 * @date 2018-04-27
 */
public class HowToDefineLambdaExpression {

	/**
	 * @param args
	 * @date 2018-04-27
	 */
	public static void main(String[] args) {
		Comparator<Apple> compareByColor = new Comparator<Apple>() {

			@Override
			public int compare(Apple o1, Apple o2) {
				return o1.getColor().compareTo(o2.getColor());
			}
		};
		List<Apple> list = Collections.emptyList();
		list.sort(compareByColor);

		compareByColor = (o1, o2) -> o1.getColor().compareTo(o2.getColor());

		// valid lambda expression
		// s -> s.length();

		// valid lambda expression
		// (Apple apple) -> apple.getColor().equals("green");

	}

}

/**
 * 
 */
package com.danny.lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.danny.domain.Apple;

/**
 * 1、找颜色为->"绿色"的苹果 </br>
 * 2、找颜色为->"红色"的苹果 </br>
 * 3、找颜色为->"绿色"的苹果，并且重量小于200的. (加入策略模式来实现)
 * 
 * @author 676002187@qq.com
 * @date 2018-04-27
 */
public class AppleCountOfLambda {

	private static final List<Apple> apples = Arrays.asList(
			new Apple(100, "green"), new Apple(200, "red"),
			new Apple(300, "green"));

	/**
	 * 查找颜色是"绿色"的苹果
	 * 
	 * @param apples
	 * @return
	 * @date 2018-04-27
	 */
	private static List<Apple> findGreenApple(List<Apple> apples) {
		List<Apple> list = new ArrayList<>();
		for (Apple apple : apples) {
			if ("green".equals(apple.getColor()))
				list.add(apple);
		}
		return list;
	}
	/**
	 * 根据color过滤
	 * 
	 * @param apples
	 * @param color
	 * @return
	 * @date 2018-04-27
	 */
	private static List<Apple> findApple(List<Apple> apples, String color) {
		List<Apple> list = new ArrayList<>();
		for (Apple apple : apples) {
			if (color.equals(apple.getColor()))
				list.add(apple);
		}
		return list;
	}
	/**
	 * 根据策略过滤
	 * 
	 * @param apples
	 * @param applePredicate
	 * @return
	 * @date 2018-04-27
	 */
	private static List<Apple> findAppleByPredicate(List<Apple> apples,
			ApplePredicate applePredicate) {
		List<Apple> list = new ArrayList<>();
		for (Apple apple : apples) {
			if (applePredicate.test(apple))
				list.add(apple);
		}
		return list;
	}

	public static void main(String[] args) {
		// 1、
		List<Apple> filterApple = findGreenApple(apples);
		// [Apple [weight=100, color=green], Apple [weight=300, color=green]]
		System.out.println(filterApple);
		// 2、
		filterApple = findApple(apples, "red");
		System.out.println(filterApple);
		// 3、
		filterApple = findAppleByPredicate(apples,
				new AppleGreenColorPredicate());
		System.out.println(filterApple);
	}

	interface ApplePredicate {
		boolean test(Apple apple);
	}

	static class AppleGreenColorPredicate implements ApplePredicate {

		/**
		 * @param apple
		 * @return
		 * @date 2018-04-27
		 */
		@Override
		public boolean test(Apple apple) {
			return "green".equals(apple.getColor()) && apple.getWeight() < 200;
		}
	}

	static class AppleRedColorPredicate implements ApplePredicate {

		/**
		 * @param apple
		 * @return
		 * @date 2018-04-27
		 */
		@Override
		public boolean test(Apple apple) {
			return "red".equals(apple.getColor());
		}

	}
}

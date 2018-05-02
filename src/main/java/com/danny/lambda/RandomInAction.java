/**
 * 
 */
package com.danny.lambda;

import java.util.Random;
import java.util.StringJoiner;

/**
 * @author 676002187@qq.com
 * @date 2018-04-28
 */
public class RandomInAction {

	/**
	 * @param args
	 * @date 2018-04-28
	 */
	public static void main(String[] args) {
		for (int i = 0; i < 10; i++) {
			int result = generateRandom(5, 10);
			System.out.println(result);
		}
		String result = stringJoiner();
		System.out.println(result);
	}

	private static int generateRandom(int min, int max) {
		Random random = new Random();
		return random.ints(min, max + 1).limit(1).findFirst().getAsInt();
	}

	private static String stringJoiner() {
		StringJoiner sj = new StringJoiner(",");
		sj.add("apc").add("ddd").add("xxx");
		return sj.toString();
	}

}

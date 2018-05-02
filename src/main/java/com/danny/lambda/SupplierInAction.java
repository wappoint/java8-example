/**
 * 
 */
package com.danny.lambda;

import java.util.Optional;
import java.util.function.Supplier;
import java.util.stream.Stream;

/**
 * @author 676002187@qq.com
 * @date 2018-04-28
 */
public class SupplierInAction {
	private static final String[] array = {"a", "b", "c", "d", "e"};
	public static void main(String[] args) {
		printStream(array);
	}

	private static void printStream(String[] array) {
		Supplier<Stream<String>> supplier = () -> Stream.of(array);
		supplier.get().peek(e -> System.out.println("peek -> " + e)).forEach(System.out::println);

		Optional<String> result = supplier.get().filter((e) -> "d".equals(e))
				.peek(e -> System.out.println("peek -> " + e)).findFirst();
		System.out.println(result.get());
	}
}

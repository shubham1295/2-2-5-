package test;

import java.lang.reflect.Field;

public class what {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {
		
		Class cache = Integer.class.getDeclaredClasses()[0]; // Create cache object.

		Field c = cache.getDeclaredField("cache"); // Get Declared Field
		c.setAccessible(true);	// Set it's accessibility

		Integer[] array = (Integer[]) c.get(cache); // Getting the array from the cache

		array[132] = array[133]; // Replacing 4 with 5

		System.out.printf("%d", 2 + 2); // what
	}

}

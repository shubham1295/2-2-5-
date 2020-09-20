package test;

import java.lang.reflect.Field;
import java.util.*;

public class what {

	public static void main(String[] args)
			throws NoSuchFieldException, SecurityException, IllegalArgumentException, IllegalAccessException {

		Class cache = Integer.class.getDeclaredClasses()[0];
		Field c = cache.getDeclaredField("cache");
		c.setAccessible(true);
		Integer[] array = (Integer[]) c.get(cache);
		array[132] = array[133];

		System.out.printf("%d",2 + 2);
	}

}

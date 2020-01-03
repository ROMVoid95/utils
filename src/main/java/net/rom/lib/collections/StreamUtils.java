package net.rom.lib.collections;

import java.util.stream.Stream;
import java.util.stream.StreamSupport;

import net.rom.lib.annotations.ExtensionClass;

@ExtensionClass	
public class StreamUtils {

	public static <T> Stream<T> stream(Iterable<T> iterable) {
		return stream(iterable, false);
	}

	public static <T> Stream<T> stream(Iterable<T> iterable, boolean parallel) {
		return StreamSupport.stream(iterable.spliterator(), parallel);
	}
}


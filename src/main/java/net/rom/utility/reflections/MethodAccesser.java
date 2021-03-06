package net.rom.utility.reflections;

public interface MethodAccesser<T, R> {
	MethodFunction<R> access(T object);

	default MethodFunction<R> accessStatic() {
		return access(null);
	}

	default R call(T object, Object... args) {
		return access(object).call(args);
	}

	default R callStatic(Object... args) {
		return accessStatic().call(args);
	}
}


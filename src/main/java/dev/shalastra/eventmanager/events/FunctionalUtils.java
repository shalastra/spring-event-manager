package dev.shalastra.eventmanager.events;

import java.util.function.Consumer;
import java.util.function.Function;

public class FunctionalUtils {

    public static <T, R> Consumer<T> applyAndAccept(Function<? super T, ? extends R> f, Consumer<R> c) {
        return t -> c.accept(f.apply(t));
    }
}

package io.eddie.stream;

import io.eddie.Collection;

public class StackStream<T> extends ListStream<T> {
    public StackStream(Collection<T> collection) {
        super(collection);
    }
}

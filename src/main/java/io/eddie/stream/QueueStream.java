package io.eddie.stream;

import io.eddie.Collection;

public class QueueStream<T> extends ListStream<T> {
    public QueueStream(Collection<T> collection) {
        super(collection);
    }
}

package io.eddie.stream;

import io.eddie.Collection;
import io.eddie.arrayList.ArrayList;
import io.eddie.linkedList.LinkedList;
import io.eddie.queue.Queue;
import io.eddie.stack.Stack;

import java.util.Iterator;
import java.util.function.Consumer;

public abstract class AbstractStream<T> implements Stream<T>{

    protected final Collection<T> collection;
    protected abstract Iterator<T> iterator();

    public AbstractStream(Collection<T> collection) {
        this.collection = collection;
    }

    @Override
    public void forEach(Consumer<? super T> consumer) {

        Iterator<T> iterator = iterator();

        while ( iterator.hasNext() ) {
            consumer.accept(iterator.next());
        }

    }

    protected <R> Collection<R> getCollection() {

        if ( this.collection instanceof LinkedList<?> ) {
            return new LinkedList<>();
        } else if ( this.collection instanceof Stack<?> ) {
            return new Stack<>();
        } else if ( this.collection instanceof Queue<T>) {
            return new Queue<>();
        }

        return new ArrayList<>();
    }


}

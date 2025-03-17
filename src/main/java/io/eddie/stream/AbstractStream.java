package io.eddie.stream;

import io.eddie.Collection;
import io.eddie.arrayList.ArrayList;
import io.eddie.linkedList.LinkedList;

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

        if ( this.collection instanceof LinkedList<T> ) {
            return new LinkedList<>();
        }

        return new ArrayList<>();
    }


}

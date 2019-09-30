package io.smallrye.reactive.adapt.converters;

import io.smallrye.reactive.Uni;
import io.smallrye.reactive.adapt.UniConverter;

import java.util.concurrent.CompletionStage;

public class FromCompletionStage<T> implements UniConverter<CompletionStage<T>, T> {
    @Override
    public Uni<T> from(CompletionStage<T> instance) {
        return Uni.createFrom().completionStage(instance);
    }
}

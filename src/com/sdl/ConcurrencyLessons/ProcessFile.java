package com.sdl.ConcurrencyLessons;

import java.util.List;
import java.util.stream.Collectors;

public class ProcessFile {
    public List<String> getValueLength(List<String> dataset) {
        return dataset.parallelStream().map(this::transform).collect(Collectors.toList());
    }

    private String transform(String name) {
        return name.length() + "-"+ name;
    }
}

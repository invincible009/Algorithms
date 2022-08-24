package com.sdl.ConcurrencyLessons;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ProcessFile {
    public List<String> getValueLength(List<String> dataset) {
//        List<String> list = new ArrayList<>();
//         dataset.forEach(name-> list.add(addLengthToValue(name)));
//         return list;

        return dataset.parallelStream().map(this::transform).sequential().collect(Collectors.toList());
    }

    private String transform(String name) {
        return name.length() + "-"+ name;
    }
}

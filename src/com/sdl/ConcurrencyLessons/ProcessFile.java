package com.sdl.ConcurrencyLessons;

import java.util.ArrayList;
import java.util.List;

public class ProcessFile {
    public List<String> getValueLength(List<String> dataset) {
        List<String> list = new ArrayList<>();
         dataset.forEach(name-> list.add(addLengthToValue(name)));
         return list;
    }

    private String addLengthToValue(String name) {
        return name.length() + "-"+ name;
    }
}

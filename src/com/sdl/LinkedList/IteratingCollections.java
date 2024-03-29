package com.sdl.LinkedList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IteratingCollections {
    public static void main(String[] args) {
        List<String> notes = new ArrayList<>();
        notes.add("note1");
        notes.add("note2");
        notes.add("note3");
        notes.add("note4");
        notes.add("note5");


        notes.forEach(note->System.out.println(note));

        //Output : note3
        notes.forEach(note->{
            if("note3".equals(note)){
                System.out.println(note);
            }
        });

        //Using Stream and filter
        //Output : note2
        notes.stream()
                .filter(s->s.contains("note2"))
                .forEach(System.out::println);

        //Using method reference
        //Output : note1,note2,note3,note4,note5
        notes.forEach(System.out::println);



        List<String> names = Arrays.asList("aa", "bb", "cc", "dd");

        List<String> uppercaseNames = new ArrayList<>();
        for (String name : names) {
            uppercaseNames.add(name.toUpperCase());
        }

        // In Java 8
        List<String> nameLst = names.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(nameLst); //output- [AA, BB, CC, DD]
    }
}

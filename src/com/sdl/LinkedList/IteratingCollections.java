package com.sdl.LinkedList;

import java.util.ArrayList;
import java.util.List;

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
    }
}

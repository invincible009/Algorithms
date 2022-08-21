package com.sdl.ConcurrencyLessons;


import org.junit.jupiter.api.Test;

import java.io.File;
import java.nio.file.Path;
import java.nio.file.Paths;

import static org.junit.jupiter.api.Assertions.*;
class ReadFromFileTest {


    @Test
    public void isFile(){
        Path path = Paths.get("D:\\path\\fileadded.txt");
        ReadFromFile fileToRead = new ReadFromFile();
        boolean readableFile = fileToRead.isReadableFile(path);
        assertEquals(true,readableFile );
    }
}
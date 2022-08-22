package com.sdl.ConcurrencyLessons;


import org.apache.commons.lang.time.StopWatch;
import org.junit.jupiter.api.Test;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.concurrent.ExecutionException;

import static org.junit.jupiter.api.Assertions.assertEquals;
class ReadFromFileTest {

    List<String> dataset = List.of("Gabriel", "Rahila", "Dorcas", "Ibrahim", "Saidu");
     public static StopWatch watch = new StopWatch();

    @Test
    public void isFile() throws InterruptedException, ExecutionException {

        Path path = Paths.get("D:\\path\\fileadded.txt");
        ReadFromFile fileToRead = new ReadFromFile();
        boolean readableFile = fileToRead.isReadableFile(path);

        assertEquals(true,readableFile );
    }

    @Test
    public void renameAndGetValueLength(){
        List<String> expected = List.of("7-Gabrile", "6-Rahila", "6-Dorcas", "7-Ibrahim", "5-Saidu");
        ProcessFile file = new ProcessFile();
        List<String> actual = file.getValueLength(dataset);

        assertEquals(expected,actual );
    }
}
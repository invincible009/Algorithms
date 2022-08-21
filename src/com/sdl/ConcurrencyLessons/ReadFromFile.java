package com.sdl.ConcurrencyLessons;

import java.nio.file.Files;
import java.nio.file.Path;

public class ReadFromFile {
    public boolean isReadableFile(Path path) {
        return Files.isReadable(path);
    }
}

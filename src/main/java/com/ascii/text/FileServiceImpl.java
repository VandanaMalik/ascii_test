package com.ascii.text;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class FileServiceImpl implements FileService {

    @Override
    public String readFile(String path) throws IOException {
        return new String(Files.readAllBytes(Paths.get(path)));
    }

    @Override
    public void writeFile(String path, String content) throws IOException {
        Files.write(Paths.get(path), content.getBytes());
    }
}
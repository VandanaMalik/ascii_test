package com.ascii.text;

import java.io.IOException;

public interface FileService {
    String readFile(String path) throws IOException;
    void writeFile(String path, String content) throws IOException;
}

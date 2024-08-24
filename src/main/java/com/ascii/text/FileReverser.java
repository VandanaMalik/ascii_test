package com.ascii.text;

import java.io.IOException;

public class FileReverser {

    private final FileService fileService;

    public FileReverser(FileService fileService) {
        this.fileService = fileService;
    }

    public void reverseFileContents(String inputPath, String outputPath) throws IOException {
        // Read the contents of the input file
        String fileContent = fileService.readFile(inputPath);

        // Reverse the file contents
        String reversedFileContent = new StringBuilder(fileContent).reverse().toString();

        // Write the reversed contents to the output file
        fileService.writeFile(outputPath, reversedFileContent);
    }
}


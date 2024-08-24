package com.ascii.text;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.io.IOException;

public class FileReverserTest {

    @Mock
    private FileService fileService;

    @InjectMocks
    private FileReverser fileReverser;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testReverseFileContents() throws IOException {
        // Define input and expected output
        String inputPath = "input.txt";
        String outputPath = "output.txt";
        String inputContent = "ABC";
        String reversedContent = "CBA";

        // Mock the behavior of fileService
        when(fileService.readFile(inputPath)).thenReturn(inputContent);

        // Call the method to test
        fileReverser.reverseFileContents(inputPath, outputPath);

        // Verify interactions and expected outcomes
        verify(fileService).readFile(inputPath);
        verify(fileService).writeFile(outputPath, reversedContent);
    }
}

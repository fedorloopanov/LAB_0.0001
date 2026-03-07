package org.example;

import java.io.IOException;

public interface PeopleReader {
    PeopleWrapper read(String filePath) throws IOException;
}
package org.example;

import org.yaml.snakeyaml.LoaderOptions;
import org.yaml.snakeyaml.Yaml;
import org.yaml.snakeyaml.constructor.Constructor;

import java.io.IOException;
import java.io.InputStream;

public class YamlPeopleReader implements PeopleReader {

    @Override
    public PeopleWrapper read(String resourceName) throws IOException {
        LoaderOptions loaderOptions = new LoaderOptions();
        Yaml yaml = new Yaml(new Constructor(PeopleWrapper.class, loaderOptions));

        try (InputStream inputStream = YamlPeopleReader.class
                .getClassLoader()
                .getResourceAsStream(resourceName)) {

            if (inputStream == null) {
                throw new IOException("Ресурс не найден в JAR: " + resourceName);
            }

            PeopleWrapper data = yaml.load(inputStream);
            return data == null ? new PeopleWrapper() : data;
        }
    }
}
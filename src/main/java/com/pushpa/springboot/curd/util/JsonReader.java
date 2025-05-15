package com.pushpa.springboot.curd.util;

import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.core.io.ClassPathResource;

import java.io.IOException;
import java.io.InputStream;

public class JsonReader {

    public static <T> T readJson(String path, Class<T> clazz) throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        InputStream inputStream = new ClassPathResource(path).getInputStream();
        return mapper.readValue(inputStream, clazz);
    }
}

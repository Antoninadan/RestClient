package ua.i.mail100.service;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.IOException;

public class Parser<T> {
    public T parse(String str, Class<T> tClass){
        ObjectMapper objectMapper = new ObjectMapper();
        try {
            return objectMapper.readValue(str, tClass);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return null;
    }
}

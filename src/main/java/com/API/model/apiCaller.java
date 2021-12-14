package com.API.model;

import java.io.IOException;

public interface apiCaller<T> {
    T getApiData(String destination) throws IOException, InterruptedException;
}

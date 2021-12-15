package com.API.controller;

import java.io.IOException;

public interface apiCaller<T> {
    T getApiData(String destination);
}

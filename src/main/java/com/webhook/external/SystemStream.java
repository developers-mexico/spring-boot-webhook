package com.webhook.external;

import lombok.AllArgsConstructor;

import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.function.Consumer;

@AllArgsConstructor
public class SystemStream implements Runnable{

    private InputStream inputStream;
    private Consumer<String> consumer;

    @Override
    public void run() {
        new BufferedReader(new InputStreamReader(inputStream)).lines()
                .forEach(consumer);
    }

}

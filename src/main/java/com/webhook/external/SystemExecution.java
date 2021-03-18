package com.webhook.external;

import lombok.extern.log4j.Log4j2;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.Executors;

@Log4j2
public abstract class SystemExecution<T extends SystemCommonProperties> {

    public void build(T project)  {
        try {
            ProcessBuilder processBuilder = new ProcessBuilder();

            processBuilder.command(project.getCommand());
            processBuilder.directory(new File(project.getPath()));

            Process process = processBuilder.start();

            if(project.getLogMethod() != LogMethod.NONE) {
                SystemStream systemStream = new SystemStream(process.getInputStream(),
                        project.getLogMethod() == LogMethod.STD ? System.out::println : s -> log.info(s));
                Executors.newSingleThreadExecutor().submit(systemStream);
            }

            assert process.waitFor() == 0;
        }catch (InterruptedException  | IOException ex) {
            throw new RuntimeException(ex);
        }
    }
}

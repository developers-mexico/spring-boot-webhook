package com.webhook.external;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import static java.util.Arrays.stream;

@RequiredArgsConstructor
@Component
public class SystemCall {

    private final SystemProject systemProject;
    private final SystemExecution systemExecution;

    public void build() {
        stream(systemProject.getProjects()).forEach(systemExecution::build);
    }
}

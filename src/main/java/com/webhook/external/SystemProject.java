package com.webhook.external;

public interface SystemProject<T extends SystemCommonProperties> {

    T[] getProjects();
}

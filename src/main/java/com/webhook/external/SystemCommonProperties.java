package com.webhook.external;

import lombok.Data;

@Data
public class SystemCommonProperties {

    private String name;
    private String path;
    private String[] command;
    private LogMethod logMethod = LogMethod.STD;

}

enum LogMethod {
    STD,LOG,NONE
}

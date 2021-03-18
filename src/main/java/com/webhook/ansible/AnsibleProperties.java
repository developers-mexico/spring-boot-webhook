package com.webhook.ansible;

import com.webhook.external.SystemProject;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;

@Data
@ConfigurationProperties(prefix = "ansible")
public class AnsibleProperties  implements SystemProject<AnsibleProject>{

    private AnsibleProject[] projects;

}

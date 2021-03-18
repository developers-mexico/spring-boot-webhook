
package com.webhook.github;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class Repository {

    private long id;
    @JsonProperty("node_id")
    private String nodeId;
    private String name;
    @JsonProperty("full_name")
    private String fullName;
    @JsonProperty("private")
    private Boolean privateRepo;
    private String url;
    @JsonProperty("git_url")
    private String gitUrl;
    @JsonProperty("default_branch")
    private String defaultBranch;
}

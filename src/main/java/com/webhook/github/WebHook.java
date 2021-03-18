
package com.webhook.github;

import lombok.Data;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Data
public class WebHook {

    private Repository repository;
    private Sender sender;

}

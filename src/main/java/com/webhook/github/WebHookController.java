package com.webhook.github;

import com.webhook.external.SystemCall;
import lombok.AllArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@Log4j2
@AllArgsConstructor
@RequestMapping("/api/github")
@RestController
public class WebHookController {

    private SystemCall systemCall;

    @PostMapping("/event")
    @ResponseStatus(HttpStatus.OK)
    public void eventLog(@RequestBody WebHook webHook) {
       log.info("WebHook received: {}", webHook);
       systemCall.build();
    }

}



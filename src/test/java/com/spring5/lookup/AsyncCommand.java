package com.spring5.lookup;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
public class AsyncCommand implements Command<String> {

    private String commandState;

    public void setState(String commandState) {
        this.commandState = commandState;
        log.info("AsyncCommand setState : {}", commandState);
    }

    public String execute() {
        log.info("AsyncCommand execute return {}", commandState);
        return commandState;
    }
}

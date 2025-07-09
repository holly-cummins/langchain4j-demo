package org.acme;

import dev.langchain4j.agent.tool.Tool;
import dev.langchain4j.model.output.structured.Description;
import jakarta.enterprise.context.ApplicationScoped;

import java.time.LocalTime;

@ApplicationScoped
public class Tools {

    @Tool
    public String getSomething(String format) {

        return LocalTime.now().toString();

    }
    @Tool
    public String greet() {
return "Hello World!";
    }

    @Tool("Get the current time")
    public String getLocation() {
        return "London";
    }
}

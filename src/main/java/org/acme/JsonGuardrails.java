package org.acme;

import io.quarkiverse.langchain4j.guardrails.AbstractJsonExtractorOutputGuardrail;
import jakarta.enterprise.context.ApplicationScoped;
import org.acme.Pet;

@ApplicationScoped
public class JsonGuardrails extends AbstractJsonExtractorOutputGuardrail {

    @Override
    protected Class<?> getOutputClass() {
        return Pet.class;
    }
}
package io.advantageous.qbit.meta;

import java.util.List;
import java.util.Map;

public class Operation {

    //TODO add parameters

    private final String operationId;
    private final String summary;
    private final String description;
    private final List<String> tags;
    private final ExternalDocumentation externalDocs;
    private final List<String> consumes;
    private final List<String> produces;
    private final Map<Integer, Response> responses;

    public Operation(String operationId, String summary, String description, List<String> tags,
                     ExternalDocumentation externalDocs, List<String> consumes,
                     List<String> produces, Map<Integer, Response> responses) {
        this.operationId = operationId;
        this.summary = summary;
        this.description = description;
        this.tags = tags;
        this.externalDocs = externalDocs;
        this.consumes = consumes;
        this.produces = produces;
        this.responses = responses;
    }

    public String getOperationId() {
        return operationId;
    }

    public String getSummary() {
        return summary;
    }

    public String getDescription() {
        return description;
    }

    public List<String> getTags() {
        return tags;
    }

    public ExternalDocumentation getExternalDocs() {
        return externalDocs;
    }

    public List<String> getConsumes() {
        return consumes;
    }

    public List<String> getProduces() {
        return produces;
    }

    public Map<Integer, Response> getResponses() {
        return responses;
    }
}

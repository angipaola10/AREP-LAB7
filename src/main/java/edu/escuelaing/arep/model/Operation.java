package edu.escuelaing.arep.model;

/**
 * The type Operation.
 */
public class Operation {

    private String operation;
    private Double input;
    private Double output;

    /**
     * Instantiates a new Operation.
     */
    public Operation() {}

    /**
     * Instantiates a new Operation.
     *
     * @param operation the operation
     * @param input     the input
     * @param output    the output
     */
    public Operation(String operation, Double input, Double output) {
        this.operation = operation;
        this.input = input;
        this.output = output;
    }

    /**
     * Gets operation.
     *
     * @return the operation
     */
    public String getOperation() {
        return operation;
    }

    /**
     * Sets operation.
     *
     * @param operation the operation
     */
    public void setOperation(String operation) {
        this.operation = operation;
    }

    /**
     * Gets input.
     *
     * @return the input
     */
    public Double getInput() {
        return input;
    }

    /**
     * Sets input.
     *
     * @param input the input
     */
    public void setInput(Double input) {
        this.input = input;
    }

    /**
     * Gets output.
     *
     * @return the output
     */
    public Double getOutput() {
        return output;
    }

    /**
     * Sets output.
     *
     * @param output the output
     */
    public void setOutput(Double output) {
        this.output = output;
    }
}
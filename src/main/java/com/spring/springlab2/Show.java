package com.spring.springlab2;

public class Show {
    private final TelevisionProgram program;
    private String name;
    private String host;

    public Show(TelevisionProgram program, String name, String host) {
        this.program = program;
        this.name = name;
        this.host = host;
    }

    public TelevisionProgram getProgram() {
        return program;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }
}
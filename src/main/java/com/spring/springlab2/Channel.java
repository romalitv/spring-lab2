package com.spring.springlab2;

import java.util.ArrayList;
import java.util.List;

public class Channel {
    private String name;
    private final List<TelevisionProgram> programs = new ArrayList<>();

    public Channel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<TelevisionProgram> getPrograms() {
        return programs;
    }

    public void addProgram(TelevisionProgram program) {
        this.programs.add(program);
    }
}

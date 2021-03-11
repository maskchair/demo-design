package com.design.command.demo;


import com.beust.jcommander.JCommander;
import com.beust.jcommander.Parameter;

import java.util.List;

/**
 * @author Jack House
 * @date 2021年03月11日 20:36:24
 */
public class Cmd {

    @Parameter(names = {"-?", "-help"}, description = "print help message", order = 3, help = true)
    public boolean helpFlag = false;

    @Parameter(names = "-version", description = "print version and exit", order = 2)
    public boolean versionFlag = false;

    @Parameter(names = {"-cp","-classpath"}, description = "classpath", order = 1)
    public String classpath;

    @Parameter(description = "main class and args")
    public List<String> mainClassAndArgs;

    public boolean ok;

    public String  getMainClass() {
        return mainClassAndArgs != null && !mainClassAndArgs.isEmpty() ? mainClassAndArgs.get(0):null;
    }

    public List<String> getAppArgs() {
        return mainClassAndArgs != null && mainClassAndArgs.size() > 1 ? mainClassAndArgs.subList(1, mainClassAndArgs.size()) : null;
    }

    public static Cmd parse(String[] args) {
        Cmd argv = new Cmd();
        JCommander cmd = JCommander.newBuilder().addObject(argv).build();
        cmd.parse(args);
        argv.ok = true;
        return argv;

    }
}

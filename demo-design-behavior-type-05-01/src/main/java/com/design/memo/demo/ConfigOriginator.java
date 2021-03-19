package com.design.memo.demo;

/**
 * @author Jack House
 * @date 2021年03月19日 11:09:12
 */
public class ConfigOriginator {

    private ConfigFile configFile;

    public ConfigFile getConfigFile() {
        return configFile;
    }

    public void setConfigFile(ConfigFile configFile) {
        this.configFile = configFile;
    }

    public ConfigMemento saveMemento() {
        return new ConfigMemento(configFile);
    }

    public void getMemento(ConfigMemento memento) {
        this.configFile = memento.getConfigFile();
    }
}

package com.rainple.framework.Constant;

public enum ConfigEnum {
    DISPATCHER_PREFIX("com.rainple.dispatcher.prefix"),
    DISPATCHER_SUBFIX("com.rainple.dispatcher.subfix"),
    SCANPACKAGE("com.rainple.scanPack"),
    SCAN("com.rainple.scanPack");
    private String name;
    ConfigEnum(String name){
        this.name = name;
    }
    public String getName() {
        return name;
    }
}
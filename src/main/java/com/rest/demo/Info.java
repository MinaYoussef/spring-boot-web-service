package com.rest.demo;

public class Info {
    private int id;
    private String value;
    
    public Info(int id, String value){
        this.id = id;
        this.value = value;
    }
    
    public int getId(){
        return this.id;
    }
    public void setId(int id){
        this.id = id;
    }
    
    public String getValue(){
        return this.value;
    }
    public void setValue(String value){
        this.value = value;
    }
}

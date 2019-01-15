package com.ui.common;

import org.openqa.selenium.By;
import org.yaml.snakeyaml.Yaml;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Map;

public class Util {
    public static Map readFile(String filepath)  {
        File file = new File(filepath);
        Yaml yaml = new Yaml();
        Map load = null;
        try {
            load = yaml.load(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return load;
    }

    public static By getValue(String key) {
        Map<String, String> map = readFile("src\\test\\resources\\element.yaml");
        String type = map.get(key).split(":")[0];
        String value = map.get(key).split(":")[1];
        if(type.equals("id")){
            return By.id(value);
        }else if(type.equals("name")){
            return By.name(value);
        }else if(type.equals("tagName")){
            return By.tagName(value);
        }else if(type.equals("linkText")){
            return By.linkText(value);
        }else if(type.equals("className")){
            return By.className(value);
        }else{
            return By.xpath(value);
        }
    }
}

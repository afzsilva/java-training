package org.example.collections.map;

import java.util.HashMap;
import java.util.Map;

public class MainMap {

    public static void main(String[] args) {
        String domainName = "www.meudominio.com"; //key
        String ip = "192.168.1.10"; //value

        Map<String, String> map = new HashMap<>();
        map.put(domainName, ip);

        String str = map.get(domainName);
        System.out.println("result "+str);
    }
}

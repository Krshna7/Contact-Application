package com.easetrack.utils;

import org.codehaus.jackson.map.ObjectMapper;

public class JsonHelper {
	
	public static String objectToJson(Response obj) {
        String result = "null";
        ObjectMapper objectMapper = new ObjectMapper();
        try {
                result = objectMapper.writerWithDefaultPrettyPrinter().writeValueAsString(obj);
        } catch (Exception e) {
                e.printStackTrace();
        }
        return result;
}
}

package com.res.adapter.create;

import org.json.JSONException;
import org.json.JSONObject;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 * Created on restaurant project V001R001.
 * Descriptions:
 * User: haoguanghao
 * Date: 8/13/12 10:15 AM
 * Modifier:
 * Modify Date: 8/13/12 10:15 AM
 * Modify:
 */
public class JsonCreator {

    /**
     * create json map by bean getter methods
     *
     * @param object
     * @return
     */
    public Map createJsonMap(Object object) {
        Map<String,String> jsonMap = new HashMap<String, String>();
        Method[] methods = object.getClass().getMethods();
        for (Method method : methods) {
            String methodName = method.getName();
            if ("get".equalsIgnoreCase(methodName.substring(0, 2))) {
                try {
                    jsonMap.put(methodName.substring(3, methodName.length()), String.valueOf(method.invoke(object)));
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            }
        }
        return jsonMap;
    }
}

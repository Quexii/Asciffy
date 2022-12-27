package dev.shoroa.asciffy;

import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.io.*;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.HashMap;
import java.util.Map;

public class Asciffycator {
    static HashMap<Integer, String> charMap = new HashMap<>();
    public static void load() {
        try {
            Gson gson = new Gson();
            URL url = Asciffycator.class.getClassLoader().getResource("ascii.json");
            Reader reader = new BufferedReader(new FileReader(new File(url.toURI())));
            JsonObject obj = gson.fromJson(reader, JsonObject.class);
            JsonArray array =((JsonArray)obj.get("ascii"));
            array.iterator().forEachRemaining(jsonElement -> {
                Integer decimal = ((JsonObject) jsonElement).get("decimal").getAsInt();
                String hexa =((JsonObject) jsonElement).get("hexa").getAsString();
                charMap.put(decimal, hexa);
            });
            reader.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }

    public static String getAsciiString(String input) {
        StringBuilder sb = new StringBuilder();
        for (char c : input.toCharArray()) {
            int decimalIndex = c;
            String fromMap = charMap.get(decimalIndex);
            sb.append("\\u00"+fromMap);
        }

        return sb.toString();
    }
}

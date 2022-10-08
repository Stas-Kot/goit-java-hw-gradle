package ua.goit;

import com.google.gson.Gson;

public class Convert {
    public String toJson(User user) {
        Gson gson = new Gson();
        return gson.toJson(user);
    }
}

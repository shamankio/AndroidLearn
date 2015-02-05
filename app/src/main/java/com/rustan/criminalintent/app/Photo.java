package com.rustan.criminalintent.app;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

public class Photo implements Serializable {
    private static final long serialVersionUID = 1L;

    private static final String JSON_FILENAME = "filename";

    private String mFilename;


    public Photo(String filename) {
        mFilename = filename;
    }

    public Photo(JSONObject json) throws JSONException {
        mFilename = json.getString(JSON_FILENAME);
    }

    public JSONObject toJSON() throws JSONException {
        JSONObject json = new JSONObject();
        json.put(JSON_FILENAME, mFilename);
        return json;
    }

    public String getFilename() {
        return mFilename;
    }

}

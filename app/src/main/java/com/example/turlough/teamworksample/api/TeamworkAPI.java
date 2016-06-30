package com.example.turlough.teamworksample.api;

import android.support.annotation.NonNull;

import org.jetbrains.annotations.NotNull;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;

import okhttp3.OkHttpClient;
import okhttp3.Request;

public class TeamworkAPI {

    String key, baseEndpoint;
    OkHttpClient client = new OkHttpClient();
    String authHeader;

    public TeamworkAPI(String key, String baseEndpoint) {

        this.key = key;
        this.baseEndpoint = baseEndpoint;

        String encoded = Base64Coder.encodeString(key + ":");
        authHeader = "Basic " + encoded;
    }

    @NonNull
    public String get(@NotNull String endpoint) throws IOException {

        Request request = new Request.Builder()
                .url(baseEndpoint + endpoint)
                .addHeader("Authorization", authHeader)
                .build();

        return client.newCall(request)
                .execute()
                .body()
                .string();


    }

    public void post(@NotNull String endpoint, @NonNull String json) throws IOException {

        HttpURLConnection connection = null;

        URL url = new URL(baseEndpoint + endpoint);
        connection = (HttpURLConnection) url.openConnection();
        connection.setRequestMethod("POST");
        connection.setDoOutput(true);
        connection.setRequestProperty("Content-Type", "application/json");

        String userpassword = key + ":" + "";
        String encodedAuthorization = Base64Coder.encodeString(userpassword);
        connection.setRequestProperty("Authorization", "Basic " + encodedAuthorization);

        OutputStream os = connection.getOutputStream();
        os.write(json.getBytes());
        os.flush();
    }

    @NotNull
    private String streamToString(@NotNull InputStream in) throws IOException {

        StringBuilder out = new StringBuilder();
        BufferedReader br = new BufferedReader(new InputStreamReader(in));
        for (String line = br.readLine(); line != null; line = br.readLine())
            out.append(line);
        br.close();
        return out.toString();
    }

}

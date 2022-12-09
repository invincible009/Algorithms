package com.sdl.LinkedList;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;
import java.util.stream.Collectors;

public class countAge {
    public static void main(String[] args) {
        System.setProperty("http.agent", "chrome");
        try{
            URL url = new URL("https://coderbyte.com/api/challenges/json/age-counting");
            try{
                URLConnection connection = url.openConnection();
                InputStream inputStream = connection.getInputStream();
                int result = parseData(getData(inputStream));
                String lines = getData(inputStream);
                System.out.println("Lines here "+ lines);
                System.out.println(result);
            }catch (IOException exception){
                System.out.println(exception);
            }

        }catch (MalformedURLException urlException){
            System.out.println(urlException);
        }
    }


    private static void writer(URLConnection conn) {
        BufferedReader rd;
        OutputStreamWriter wr;
        try
        {
            conn.setDoOutput(true);
            wr = new OutputStreamWriter(conn.getOutputStream());
            wr.flush();
            // Get the response
            rd = new BufferedReader(new InputStreamReader(conn.getInputStream()));
            String line;
            while ((line = rd.readLine()) != null) {
                System.out.println(line);
            }
        }
        catch (Exception e) {
            System.out.println(" Thrown Exception here:  "+ e);
        }
    }


    private static int parseData(String data) {
        int count = 0;
        for (String part : data.split(",")) {
            String[] subparts = part.split("=", 2);
            if ("age".equals(subparts[0]) && Integer.valueOf(subparts[1]) > 50) {
                count++;
            }
        }
        return count;
    }

    private static String getData(InputStream inputStream) {
        return  new BufferedReader(new InputStreamReader(inputStream))
                .lines().collect(Collectors.joining("\n"));
    }

}

package com.codiodes.retrofitexample.entity;

/**
 * Created by Salman on 4/30/2016.
 */
public class Info {

    private String seed;
    private int results;
    private int page;
    private String version;

    public Info(String seed, int results, int page, String version) {
        this.seed = seed;
        this.results = results;
        this.page = page;
        this.version = version;
    }

    public String getSeed() {
        return seed;
    }

    public int getResults() {
        return results;
    }

    public int getPage() {
        return page;
    }

    public String getVersion() {
        return version;
    }
}

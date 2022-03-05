package io.swagger.petstore.models;

import com.github.javafaker.Faker;

import java.util.Locale;

public class DataInyection {
    Faker faker = new Faker(new Locale("en-US"));

    private String urlPetPost, urlPetGetDel, headers, bodyPetPost, bodyPetGetDel;
    private String urlOrderPost, urlOrderGet, bodyOrder, bodyOrderGet;
    private String urlUserPost, urlUserGetDel, bodyUserPost, bodyUserGet;
    private final int STATUSCODE;

    public DataInyection() {
        this.headers = "application/json";
        this.urlPetPost = "https://petstore.swagger.io/v2/pet";
        this.bodyPetPost = "{\n" +
                "  \"id\": 2,\n" +
                "  \"category\": {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"Coco\"\n" +
                "  },\n" +
                "  \"name\": \"doggie\",\n" +
                "  \"photoUrls\": [\n" +
                "    \"string\"\n" +
                "  ],\n" +
                "  \"tags\": [\n" +
                "    {\n" +
                "      \"id\": 2,\n" +
                "      \"name\": \"dorado\"\n" +
                "    }\n" +
                "  ],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        this.urlPetGetDel = "https://petstore.swagger.io/v2/pet/2";
        this.bodyPetGetDel = "{\n" +
                "  \"id\": 2,\n" +
                "  \"category\": {\n" +
                "    \"id\": 2,\n" +
                "    \"name\": \"asd\"\n" +
                "  },\n" +
                "  \"name\": \"asd\",\n" +
                "  \"photoUrls\": [],\n" +
                "  \"tags\": [],\n" +
                "  \"status\": \"available\"\n" +
                "}";
        this.urlOrderPost = "https://petstore.swagger.io/v2/store/order";
        this.bodyOrder = "{\n" +
                "  \"id\": 2,\n" +
                "  \"petId\": 1,\n" +
                "  \"quantity\": 10,\n" +
                "  \"shipDate\": \"2022-03-05T20:40:21.980Z\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";
        this.urlOrderGet = "https://petstore.swagger.io/v2/store/order/2";
        this.bodyOrderGet = "{\n" +
                "  \"id\": 2,\n" +
                "  \"petId\": 2,\n" +
                "  \"quantity\": 0,\n" +
                "  \"shipDate\": \"2022-03-05T00:00:00.000+0000\",\n" +
                "  \"status\": \"placed\",\n" +
                "  \"complete\": true\n" +
                "}";
        this.urlUserPost = "https://petstore.swagger.io/v2/user/createWithArray";
        this.bodyUserPost = "[\n" +
                "  {\n" +
                "    \"id\": 1,\n" +
                "    \"username\": \"EliV\",\n" +
                "    \"firstName\": \"Eliana\",\n" +
                "    \"lastName\": \"Valderrama\",\n" +
                "    \"email\": \"eli@gmail.com\",\n" +
                "    \"password\": \"abc123\",\n" +
                "    \"phone\": \"1122334455\",\n" +
                "    \"userStatus\": 1\n" +
                "  }\n" +
                "]";
        this.urlUserGetDel = "https://petstore.swagger.io/v2/user/EliV";
        this.bodyUserGet = "{\n" +
                "  \"id\": 1,\n" +
                "  \"username\": \"EliV\",\n" +
                "  \"firstName\": \"Eliana\",\n" +
                "  \"lastName\": \"Valderrama\",\n" +
                "  \"email\": \"eli@gmail.com\",\n" +
                "  \"password\": \"abc123\",\n" +
                "  \"phone\": \"1122334455\",\n" +
                "  \"userStatus\": 1\n" +
                "}";
        this.STATUSCODE = 200;
    }

    public String getUrlPetPost() {
        return urlPetPost;
    }

    public String getUrlPetGetDel() {
        return urlPetGetDel;
    }

    public String getHeaders() {
        return headers;
    }

    public String getBodyPetPost() {
        return bodyPetPost;
    }

    public String getUrlOrderPost() {
        return urlOrderPost;
    }

    public String getUrlOrderGet() {
        return urlOrderGet;
    }

    public String getBodyOrder() {
        return bodyOrder;
    }

    public String getBodyPetGetDel() {
        return bodyPetGetDel;
    }

    public String getUrlUserPost() {
        return urlUserPost;
    }

    public String getUrlUserGetDel() {
        return urlUserGetDel;
    }

    public String getBodyUserPost() {
        return bodyUserPost;
    }

    public String getBodyUserGet() {
        return bodyUserGet;
    }

    public int getSTATUSCODE() {
        return STATUSCODE;
    }
}

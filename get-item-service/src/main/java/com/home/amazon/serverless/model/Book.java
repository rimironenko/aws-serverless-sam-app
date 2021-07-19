package com.home.amazon.serverless.model;

import com.google.gson.annotations.SerializedName;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbBean;
import software.amazon.awssdk.enhanced.dynamodb.mapper.annotations.DynamoDbPartitionKey;

@DynamoDbBean
public class Book {

    public static final String PARTITION_KEY = "isbn";

    @SerializedName(PARTITION_KEY)
    private String isbn;

    @SerializedName("author")
    private String author;

    @SerializedName("name")
    private String name;

    @DynamoDbPartitionKey
    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}

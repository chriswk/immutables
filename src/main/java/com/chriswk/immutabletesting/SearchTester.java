package com.chriswk.immutabletesting;

public class SearchTester {

    public static void main(String... args) {
        System.out.println(ImmutableSearchConfig.builder()
                .searchKey("Key")
                .description("Description")
                .build());
    }
}

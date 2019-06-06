package com.jackie.myapp.util;

import java.util.UUID;

public class UUIDUitls {
    public static void main(String[] args) {
        String id= UUID.randomUUID().toString().replace("-","");
        System.out.println(id);

    }
}

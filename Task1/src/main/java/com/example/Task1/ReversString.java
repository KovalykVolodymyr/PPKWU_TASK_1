package com.example.Task1;
public class ReversString {


    StringBuilder stringBuilder;

    public ReversString(StringBuilder stringBuilder) {
        this.stringBuilder = stringBuilder;
    }

    String revers(){
        return stringBuilder.reverse().toString();
    }
}


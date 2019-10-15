package com.example.Validacja;

import java.util.List;
import java.util.Set;

public class CheckType {
    Object value;

    public CheckType(Object value) {
        this.value = value;
    }




    public <T extends Object> Object checkType() {



        if (value instanceof Integer)
            return "Integer ";
        else if(value instanceof Double)
            return "Double ";
        else if(value instanceof Float)
            return "Float : ";
        else if(value instanceof List)
            return "List! ";
        else if(value instanceof Set)
            return "Set! ";
        else if(value instanceof String)
            return "String! ";
        return value;
    }
}

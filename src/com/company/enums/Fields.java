package com.company.enums;

public enum Fields {
    NAME,
    SALARY,
    POSITION,
    PERSONALITY;

    public static String[] getFields()
    {
        String[] fields = new String[Fields.values().length];
        Fields[] fieldsEnum = values();
        for (int i = 0; i < Fields.values().length; i++) {
            fields[i] = fieldsEnum[i].toString();
        }
        return fields;
    }

    public static Fields findEnum(String s){
        s = s.toUpperCase();
        Fields field = null;
        for (int i = 0; i < values().length; i++) {
            if (s.equals(Fields.values()[i].toString())){
                field = Fields.values()[i];
            }
        }
        return field;
    }

    public static boolean isEnum(String s){
        s = s.toUpperCase();
        for (int i = 0; i < values().length; i++) {
            if (s.equals(Fields.values()[i].toString())){
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return super.toString().toUpperCase();
    }
}
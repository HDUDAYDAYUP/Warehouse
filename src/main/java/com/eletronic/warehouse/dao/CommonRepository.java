package com.eletronic.warehouse.dao;

import com.eletronic.warehouse.pojo.Enter;

import java.lang.reflect.Field;

public class CommonRepository<T> {
    public StringBuffer getFiledValues(T t, int pagenum) throws IllegalAccessException {
        String table = t.getClass().toString().substring(t.getClass().toString().lastIndexOf(".") + 1);
        StringBuffer stringBuffer = new StringBuffer("SELECT * FROM " + table + " WHERE ");
        StringBuffer sql = new StringBuffer();
        if (t != null) {
            Class tClass = t.getClass();
            Field[] fields = tClass.getDeclaredFields();
            int count = 0;
            for (int i = 0; i < fields.length; i++) {
                String buf = "";
                fields[i].setAccessible(true);
                if (fields[i].get(t) != null) {
                    if (fields[i].getType().toString().equals("int") && fields[i].getInt(t) != 0) {
                        if (count == 0) {
                            buf = fields[i].getName() + " LIKE " + "'%" + fields[i].get(t) + "%'";
                        } else {
                            buf += " AND ";
                            buf += fields[i].getName() + " LIKE " + "'%" + fields[i].get(t) + "%'";
                        }
                        sql.append(buf);
                        count++;
                    } else if (fields[i].getType().toString().equals("class java.lang.String")) {
                        if (count == 0) {
                            buf = fields[i].getName() + " LIKE " + "'%" + fields[i].get(t) + "%'";
                        } else {
                            buf += " AND ";
                            buf += fields[i].getName() + " LIKE " + "'%" + fields[i].get(t) + "%'";
                        }
                        sql.append(buf);
                        count++;
                    }
                }
            }
            stringBuffer.append(sql);
        } else {
            return new StringBuffer("");
        }
        return stringBuffer;
    }

    public static void main(String args[]) {
        CommonRepository<Enter> commonRepository = new CommonRepository();
        Enter enter = new Enter();
        /**
         * add function
         */
        try {
            System.out.println(commonRepository.getFiledValues(enter, 2));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
    }
}

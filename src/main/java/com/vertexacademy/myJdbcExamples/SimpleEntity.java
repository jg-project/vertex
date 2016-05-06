package com.vertexacademy.myJdbcExamples;

import java.util.Objects;

/**
 * Created by user on 02.05.2016.
 */
public class SimpleEntity {
    public  int id;
    public  String name;
    public  long ts;

    public SimpleEntity(int id, String name, long ts) {
        this.id = id;
        this.name = name;
        this.ts = ts;
           }

    public SimpleEntity(){}

    @Override
      public String toString() {
               return "SimpleEntity{" +
               "id=" + id +
                ", name='" + name + '\'' +
                ", ts=" + ts +
                 '}';
           }

    @Override
       public boolean equals(Object o) {
             if (this == o) return true;
              if (o == null || getClass() != o.getClass()) return false;
               SimpleEntity that = (SimpleEntity) o;
              return id == that.id && ts == that.ts &&
                      Objects.equals(name, that.name);
           }

    @Override
      public int hashCode() {
               return Objects.hash(id, name, ts);
           }

    public int getId(){
        return id;
    }
    public String getName() {
        return name;
    }

    public long getTs(){
        return ts;
    }

    public void setId(int id) {
        this.id=id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setTs(long ts) {
        this.ts = ts;
    }
}

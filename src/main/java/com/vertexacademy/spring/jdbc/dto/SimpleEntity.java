package com.vertexacademy.spring.jdbc.dto;

import java.util.Objects;

/**
 * Created by user_2 on 29.04.2016.
 */
public class SimpleEntity {
    public final int id;
    public final String name;
    public final long ts;

    public SimpleEntity(int id, String name, long ts) {
        this.id = id;
        this.name = name;
        this.ts = ts;
    }

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
        return id == that.id &&
                ts == that.ts &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ts);
    }
}

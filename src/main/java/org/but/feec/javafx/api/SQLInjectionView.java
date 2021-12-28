package org.but.feec.javafx.api;

public class SQLInjectionView {
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    private Long id;
    private String data;

    @Override
    public String toString() {
        return "SQLInjectionView{" +
                "id=" + id +
                ", data='" + data + '\'' +
                '}';
    }

}

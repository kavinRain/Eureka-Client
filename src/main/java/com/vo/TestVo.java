package com.vo;

import lombok.Data;

@Data
public class TestVo {

    private String key;

    private String value;

    public TestVo(String key, String value) {
        this.key = key;
        this.value = value;
    }

    public TestVo() {
    }
}

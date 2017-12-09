package com.service;

import com.manager.TestManager;
import com.ro.TestRo;
import com.vo.TestVo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class TestService {

    @Autowired
    private TestManager testManager;

    public Integer testInteger(Integer a, Integer b) {
        return testManager.testInteger(a,b);
    }

    public Map<String, String> testMap(Map<String, Integer> paramMap) {
        return testManager.testMap(paramMap);
    }

    public TestRo testVo(TestVo vo) {
        return testManager.testVo(vo);
    }

    public List<String> testList(List<String> paramList) {
        return testManager.testList(paramList);
    }
}

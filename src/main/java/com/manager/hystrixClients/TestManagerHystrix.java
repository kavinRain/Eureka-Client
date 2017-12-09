package com.manager.hystrixClients;

import com.manager.TestManager;
import com.ro.TestRo;
import com.vo.TestVo;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
public class TestManagerHystrix implements TestManager {

    @Override
    public Integer testInteger(Integer a, Integer b) {
        return 0;
    }

    @Override
    public Map<String, String> testMap(Map<String, Integer> paramMap) {
        return null;
    }

    @Override
    public TestRo testVo(TestVo vo) {
        return null;
    }

    @Override
    public List<String> testList(List<String> paramList) {
        return null;
    }
}

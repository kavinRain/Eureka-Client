package com.web;

import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Lists;
import com.google.common.collect.Maps;
import com.ro.TestRo;
import com.service.TestService;
import com.vo.TestVo;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
public class TestController {

    private final Logger logger = LoggerFactory.getLogger(getClass());

    @Autowired
    private TestService testService;

    @PostMapping("testInteger")
    public String testInteger(Integer a, Integer b) {
        logger.info("进入主接口:{}", "testInteger");
        Integer result = testService.testInteger(a, b);
        return result.equals(0) ? "FAIL" : "SUCCESS";
    }

    @PostMapping("testMap")
    public String testMap() {
        logger.info("进入主接口:{}", "testMap");
        Map<String, Integer> paramMap = Maps.newHashMap();
        paramMap.put("1",1);
        paramMap.put("2",2);
        Map<String, String> result = testService.testMap(paramMap);
        return ObjectUtils.isEmpty(result) ? "FAIL" : String.format("result:%s", result);
    }

    @PostMapping("testVo")
    public String testVo() {
        logger.info("进入主接口:{}", "testVo");
        TestVo vo = new TestVo("1","1");
        TestRo result = testService.testVo(vo);
        return ObjectUtils.isEmpty(result) ? "FAIL" : String.format("result:%s", result);
    }


    @PostMapping("testList")
    public String testList() {
        logger.info("进入主接口:{}", "testVo");
        List<String> paramList = Lists.newArrayList();
        paramList.add("spring cloud test list");
        List<String> result = testService.testList(paramList);
        return ObjectUtils.isEmpty(result) ? "FAIL" : String.format("result:%s", result);
    }


}

package com.manager;

import com.manager.hystrixClients.TestManagerHystrix;
import com.ro.TestRo;
import com.vo.TestVo;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;
import java.util.Map;

@FeignClient(name = "CommonClientService", fallback = TestManagerHystrix.class)
public interface TestManager {

    @PostMapping(value = "testInteger", consumes = "application/json")
    Integer testInteger(@RequestParam("a") Integer a, @RequestParam("b") Integer b);

    @PostMapping(value = "testMap")
    Map<String, String> testMap(@RequestParam Map<String, Integer> paramMap);

    @PostMapping(value = "testVo")
    TestRo testVo(@RequestBody TestVo vo);

    @PostMapping(value = "testList")
    List<String> testList(@RequestParam("paramList") List<String> paramList);
}

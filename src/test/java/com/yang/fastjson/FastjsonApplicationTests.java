package com.yang.fastjson;

import com.alibaba.fastjson.JSON;
import com.yang.fastjson.entity.TestUser;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class FastjsonApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("转化:" + JSON.toJSONString(new TestUser(1, "yang")));
	}

}

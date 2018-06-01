package com.ssm.test;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import com.ssm.util.APIMethod;

public class APITest {
	
	@Test
	public void apiTest() {
		Map<String, String> map = new HashMap<String, String>();
		map.put("uid", "991");
		String str = APIMethod.jsonPost("http://wechat.yihuan100.com/api/NewWX_GetProdInfo",map);
		System.out.println(str);
	}

}

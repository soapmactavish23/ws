package com.hkprogrammer.ws.providers;

import java.util.Map;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class JsonWebTokenProviderTest {

	@Autowired
	private TokenProvider tokenProvider;

	@Test
	void test() {
		Map<String, String> decoded = tokenProvider.decode(
				"eyJhbGciOiJSUzI1NiIsInR5cCI6IkpXVCIsImtpZCI6Ilo5Y2h6Yzg2aWRxZmVBVEZRTENFciJ9.eyJnaXZlbl9uYW1lIjoiSGVucmljayIsImZhbWlseV9uYW1lIjoiTm9ndWVpcmEiLCJuaWNrbmFtZSI6InJpY2tub2d1ZWlyYTEyMzEiLCJuYW1lIjoiSGVucmljayBOb2d1ZWlyYSIsInBpY3R1cmUiOiJodHRwczovL2xoMy5nb29nbGV1c2VyY29udGVudC5jb20vYS9BQWNIVHRkNjFaUzh2akFzNkJBSzlLcm8zbEhBSHNNOWpxNlFiZzZiakNTWWlnPXM5Ni1jIiwibG9jYWxlIjoicHQtQlIiLCJ1cGRhdGVkX2F0IjoiMjAyMy0wNi0xM1QxODowMToxNi44NzNaIiwiZW1haWwiOiJyaWNrbm9ndWVpcmExMjMxQGdtYWlsLmNvbSIsImVtYWlsX3ZlcmlmaWVkIjp0cnVlLCJpc3MiOiJodHRwczovL2Rldi0wcnVzYWt4dHVoMXJzMXUwLnVzLmF1dGgwLmNvbS8iLCJhdWQiOiI0aGJkS3FNaHR0bUlOYjZvRjdOSFlocExCWlRCTWNjTiIsImlhdCI6MTY4NjY3OTI4MSwiZXhwIjoxNjg2NzE1MjgxLCJzdWIiOiJnb29nbGUtb2F1dGgyfDEwMDQ2ODUxOTUzOTcyMzM0NjM2OSIsInNpZCI6ImU0bllVRGwzUGI0blRHbi1aWTVpc1gyam0xWHU5a2o4Iiwibm9uY2UiOiJVMzVGZWxsTVFXdE5la1k0YkZwRGIzNHlRbDlzTlhveU1rdDNjWFZ0TVRCZldUTmlSWGhCTWkxVldnPT0ifQ.TIT5uxjHX8fzYNn9e61RPawBhq_Kb7dckBmdnKTN5edhiHSQj-xZcd8L1AXJiCzxNR8ZZ7sOzpt7IS-Q__eGPKshi48soOQWZqrukJfIoTwTwy1_6Z0a5uzIKWIBtC1Bvt5hnfNiK8L54etucUGOe46ZQEMBj8thLE1n-L9Z5yT5NV4z-L_XKAilgnOxfuihUfXu6-QCjTlqLA_9eua1DbAHfkhoRdgiMmqNzVJQKm1nWQzBYi_SZIywi0FBQ7b8hasE8UyzIH-y7NomijG8hnkoZmOv4rE1rRM5wBj_NjMn3Vh4PAQgDRUkCmw6OHrXLSBNllWcQtvy2nQCDyUjkA");
		System.out.println(decoded);
	}

}
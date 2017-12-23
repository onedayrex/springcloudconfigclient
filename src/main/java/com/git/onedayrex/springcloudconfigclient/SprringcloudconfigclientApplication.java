package com.git.onedayrex.springcloudconfigclient;

import org.apache.http.client.utils.DateUtils;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@SpringBootApplication
@RestController
public class SprringcloudconfigclientApplication {

	@Value("${db.host}")
	private String host;


	public static void main(String[] args) {
		SpringApplication.run(SprringcloudconfigclientApplication.class, args);
	}

	@RequestMapping("/")
	public Object index() {
		String s = DateUtils.formatDate(new Date(), "yyyy-MM-dd HH:mm:ss");
		return host + s;
	}
}

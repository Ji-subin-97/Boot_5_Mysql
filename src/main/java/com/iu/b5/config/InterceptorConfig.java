package com.iu.b5.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import com.iu.b5.interceptor.NoticeInterCeptor;
import com.iu.b5.interceptor.TestInterCeptor;
import com.iu.b5.interceptor.UpdateInterCeptor;

@Configuration
public class InterceptorConfig implements WebMvcConfigurer{
	
	@Autowired
	private TestInterCeptor testInterCeptor;
	
	@Autowired
	private NoticeInterCeptor noticeInterCeptor;
	
	@Autowired
	private	UpdateInterCeptor updateInterCeptor;
	
	@Override
	public void addInterceptors(InterceptorRegistry registry) {
		
		//1. 적용할 Interceptor 등록
		//registry.addInterceptor(testInterCeptor)
		//2. Interceptor를 사용할 url
		//	.addPathPatterns("/notice/*")
		//	.addPathPatterns("/member/*")
		//3. Interceptor를 제외할 url
		//	.excludePathPatterns("/qna/*")
		//	.excludePathPatterns("/notice/selectOne");
		
		registry.addInterceptor(noticeInterCeptor)
			.addPathPatterns("/notice/*")
			.excludePathPatterns("/notice/selectList")
			.excludePathPatterns("/notice/selectOne")
			.excludePathPatterns("/notice/update");
		
		registry.addInterceptor(updateInterCeptor)
			.addPathPatterns("/notice/update")
			.addPathPatterns("/qna/update");
	}
	
}

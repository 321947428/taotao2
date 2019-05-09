package test;

import java.io.IOException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.bdqn.entity.Music;
import cn.bdqn.service.MusicService;


public class Test01 {
	public static void main(String[] args) throws IOException {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("classpath:applicationContext.xml");
		
		MusicService musicService=context.getBean("musicService",MusicService.class);
		java.util.List<Music> list= musicService.MusicAll();
		System.out.println(list);
	}
}

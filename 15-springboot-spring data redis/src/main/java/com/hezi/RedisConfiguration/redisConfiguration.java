package com.hezi.RedisConfiguration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.StringRedisSerializer;

import redis.clients.jedis.JedisPoolConfig;

@Configuration
public class redisConfiguration {
	/**
	 * 设置连接池配置
	 * @return
	 */
	@Bean
	public JedisPoolConfig jedisPoolConfig() {
		JedisPoolConfig config=new JedisPoolConfig();
		 //最大空限量
		config.setMaxIdle(10);
		//最小空限量
		config.setMinIdle(5);
		//最大连接数
		config.setMaxTotal(20);
		
		return config;
	}
   /**
    * 链接redis的配置
    * @param config
    * @return
    */
	@Bean
	public JedisConnectionFactory jedisConnectionFactory(JedisPoolConfig config) {
		JedisConnectionFactory factory=new JedisConnectionFactory();
		//关联连接池的配置对象
		factory.setPoolConfig(config);
		//链接主机ip 
		factory.setHostName("127.0.0.1");
		//链接主机端口
		factory.setPort(6379);
		return factory;
	}
	/*
	 * redis模板类
	 */
	@Bean
	public RedisTemplate<String, Object> redisTemplate(JedisConnectionFactory factory){
		   RedisTemplate<String, Object> template=new RedisTemplate<>();
		   //设置与与redis配置的关联
		   template.setConnectionFactory(factory);
		   //设置key值得序列化
		   template.setKeySerializer(new StringRedisSerializer());
		   //设置value值得序列化
		   template.setValueSerializer(new StringRedisSerializer());
		   return template;
	}
}

package com.hezi.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.serializer.Jackson2JsonRedisSerializer;
import org.springframework.data.redis.serializer.JdkSerializationRedisSerializer;
import org.springframework.http.converter.json.Jackson2ObjectMapperBuilder;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.hezi.controller.App;
import com.hezi.pojo.User;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes= {App.class})
public class test {
    @Autowired 
	private RedisTemplate<String, Object> redisTemplate;
	/*
	 * 测试添加数据
	 */
    @Test
     public void addTest() {
    	 this.redisTemplate.opsForValue().set("key", "value");
     }
    /*
	 * 测试获取数据
	 */
	@Test
    public void getTest() {
   	 String key=(String)this.redisTemplate.opsForValue().get("key");
    }
	/*
	 * 测试添加一个对象(这种方法添加的对象会先转化成字节流，然后以字符串形式存入，这样在数据库中会以看不懂的字节码显示)
	 */
	@Test
    public void addUserTest() {
		User user=new User();
		user.setAge(12);
		user.setId(1);
		user.setName("张三");
		/*
		 * 这里需要给一个转换的模板，将这个类进行序列化，然后存入redis
		 */
      this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
      this.redisTemplate.opsForValue().set("user", user);

	}
	/*
	 * 测试获取一个对象
	 */
	@Test
    public void getUserTest() {
		/*
		 * 这里需要给一个转换的模板，将这个类进行反序列化，然后取出redis里存的key对应的值
		 */
      this.redisTemplate.setValueSerializer(new JdkSerializationRedisSerializer());
      this.redisTemplate.opsForValue().get("user");
	}
	/*
	 * 测试添加一个对象（以jackson的方式，这个就以字符串的形式讲对象存入redis）
	 */
	@Test
    public void addUserTestJackson() {
		User user=new User();
		user.setAge(12);
		user.setId(1);
		user.setName("张三");
		/*
		 * 这里需要给一个转换的模板，将这个类转换成字符串存入redis
		 */
      this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(User.class));
      this.redisTemplate.opsForValue().set("user", user);
	}
	/*
	 * 测试获取一个对象
	 */
	@Test
    public void getUserTestJackson() {
		/*
		 * 这里需要给一个转换的模板，将这个类取出来
		 */
      this.redisTemplate.setValueSerializer(new Jackson2JsonRedisSerializer<>(User.class));
      this.redisTemplate.opsForValue().get("user");
	}
}

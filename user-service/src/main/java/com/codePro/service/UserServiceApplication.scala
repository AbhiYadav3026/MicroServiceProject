package com.codePro.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
class UserServiceApplication
object UserServiceApplication extends App {
  SpringApplication.run(classOf[UserServiceApplication]);

  @Bean
  def restTemplate(): RestTemplate ={
      new RestTemplate()
  }
}
package com.codePro.service

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.client.loadbalancer.LoadBalanced
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.context.annotation.Bean
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
@EnableEurekaClient
class UserServiceApplication
object UserServiceApplication extends App {
  SpringApplication.run(classOf[UserServiceApplication]);

  @Bean
  @LoadBalanced
  def restTemplate(): RestTemplate ={
      new RestTemplate()
  }
}
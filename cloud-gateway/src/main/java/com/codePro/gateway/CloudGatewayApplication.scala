package com.codePro.gateway

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient

@SpringBootApplication
@EnableEurekaClient
class CloudGatewayApplication
object CloudGatewayApplication extends App {
  SpringApplication.run(classOf[CloudGatewayApplication]);
}
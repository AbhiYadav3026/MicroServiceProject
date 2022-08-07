package com.codePro.registry

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.cloud.netflix.eureka.EnableEurekaClient
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer

@SpringBootApplication
@EnableEurekaServer
class ServiceRegistryApplication
object ServiceRegistryApplication extends App {
  SpringApplication.run(classOf[ServiceRegistryApplication]);
}
package com.codePro.service.controller

import com.codePro.service.VO.ResponseTemplateVO
import com.codePro.service.entity.User
import com.codePro.service.service.UserService
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.{GetMapping, PathVariable, PostMapping, RequestBody, RequestMapping, RestController}

@RestController
@RequestMapping(Array("/users"))
@Slf4j
class UserController {

  private val log = org.slf4j.LoggerFactory.getLogger(classOf[UserController])

  @Autowired
  var userService: UserService = _

  @PostMapping(Array("/"))
  def saveUser(@RequestBody user: User): User = {
    log.info("inside saveUser in controller....")
    userService.saveUser(user)
  }

  @GetMapping(Array("/{id}"))
  def getUserWithDepartment(@PathVariable("id") userId: Long): ResponseTemplateVO = {
    log.info("inside getUserWithDepartment in userController...."+userId)
    userService.getUserWithDepartment(userId)
  }
}

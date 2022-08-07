package com.codePro.service.service

import com.codePro.service.VO.{Department, ResponseTemplateVO}
import com.codePro.service.entity.User
import com.codePro.service.repository.UserRepository
import lombok.extern.slf4j.Slf4j
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service
import org.springframework.web.client.RestTemplate

@Service
@Slf4j
class UserService {

  @Autowired
  var userRepository: UserRepository = _

  @Autowired
  var restTemplate: RestTemplate =_

  private val log = org.slf4j.LoggerFactory.getLogger(classOf[UserService])

  def saveUser(user: User): User = {
    log.info("inside saveUser in UserService....")
    userRepository.save(user)
  }

  def getUserWithDepartment(userId: Long): ResponseTemplateVO = {
    log.info("inside getUserWithDepartment in UserService...."+userId)
    var responseTemplateVO = new ResponseTemplateVO()
    var user = userRepository.findById(userId).get()
    var department = restTemplate.getForObject("http://DEPARTMENT-SERVICE/departments/"+user.getDepartmentId,classOf[Department])
    log.info("inside getUserWithDepartment in UserService department id found ...."+department.departmentId)
    responseTemplateVO.setUser(user)
    responseTemplateVO.setDepartment(department)
    responseTemplateVO
  }
}

package com.codePro.service.VO

import lombok.{AllArgsConstructor, Data, NoArgsConstructor}

import scala.beans.BeanProperty

@Data
@AllArgsConstructor
@NoArgsConstructor
class Department {
  @BeanProperty var departmentId: Long =_
  @BeanProperty var departmentName: String =_
  @BeanProperty var departmentAddress: String =_
  @BeanProperty var departmentCode: Long =_
}

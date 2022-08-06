package com.codePro.service.VO

import com.codePro.service.entity.User
import lombok.{AllArgsConstructor, Data, NoArgsConstructor}

import scala.beans.BeanProperty

@Data
@AllArgsConstructor
@NoArgsConstructor
class ResponseTemplateVO {

    @BeanProperty
    var user: User =_

    @BeanProperty
    var department: Department =_
}

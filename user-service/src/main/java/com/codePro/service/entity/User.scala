package com.codePro.service.entity

import lombok.{AllArgsConstructor, Data, NoArgsConstructor}

import javax.persistence.{Column, Entity, GeneratedValue, GenerationType, Id, Table}
import scala.beans.BeanProperty

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "user_table")
class User {
  @Id
  @Column(name = "id", nullable = false)
  @GeneratedValue(strategy = GenerationType.AUTO)
  @BeanProperty
  var userId: Long = _

  @BeanProperty
  var firstName: String = _

  @BeanProperty
  var lastName: String = _

  @BeanProperty
  var email: String = _

  @BeanProperty
  var departmentId: Long = _
}

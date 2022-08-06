package com.codePro.service.repository

import com.codePro.service.entity.User
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
trait UserRepository extends JpaRepository[User, java.lang.Long]{

}

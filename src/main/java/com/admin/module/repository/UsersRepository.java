
package com.admin.module.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.admin.module.model.user.Users;

import java.util.Optional;

//@NoRepositoryBean
@Repository("real_db")
public interface UsersRepository extends JpaRepository<Users, Integer> {
    Optional<Users> findByUserName(String userName);

}



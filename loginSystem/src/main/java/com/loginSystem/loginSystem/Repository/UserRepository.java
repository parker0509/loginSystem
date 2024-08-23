package com.loginSystem.loginSystem.Repository;

import com.loginSystem.loginSystem.Entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface UserRepository extends JpaRepository<User,Integer> {


    Boolean existsByUsername(String username);


             //username 받아온 뒤 DB테이블에서 회원을 조회하는 기능
    User findByUsername(String username);

}

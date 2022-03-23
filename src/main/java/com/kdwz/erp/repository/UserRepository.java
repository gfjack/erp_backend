package com.kdwz.erp.repository;

import com.kdwz.erp.entity.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserRepository extends JpaRepository<User, String> {

    User findByUserName(String userName);

    @Query(nativeQuery = true, value = "SELECT * FROM t_user WHERE user_name LIKE %?1%")
    List<User> fuzzyByUserName(String userName);

}

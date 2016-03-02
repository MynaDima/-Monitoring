package com.university.diploma.repository;

import com.university.diploma.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 * Created by dima on 3/2/16.
 */
@Repository
public interface UserRepository extends JpaRepository<User,Integer> {

    @Query(value = "select * from users where username = ?1" ,nativeQuery = true)
    User getUserIdByName(String name);

}

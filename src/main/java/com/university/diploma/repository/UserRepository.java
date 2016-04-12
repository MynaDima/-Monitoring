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

    @Query(value = "select * from users where username = ?1" , nativeQuery = true)
    User getUserIdByName(String name);

    @Query(value = "select users from users where id_social =?1", nativeQuery = true)
    User getUserBySocialId(String id);

    @Query(value = "INSERT INTO users (name, email, id_social) VALUES (?1 as TEXT,?2 as TEXT,?3 as TEXT)", nativeQuery = true)
    User addSocialUser(String name, String email, String socialId);

}

package org.jenkins.mysql.test.repository;

import org.jenkins.mysql.test.model.User;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

public interface UserRepository extends PagingAndSortingRepository<User, Long> {
    User findByName(String name);
}

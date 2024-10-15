package com.crisishub_api.domain.user.repository;

import com.crisishub_api.domain.user.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
}

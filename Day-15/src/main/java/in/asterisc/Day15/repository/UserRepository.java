package in.asterisc.Day15.repository;


import org.springframework.data.jpa.repository.JpaRepository;

import in.asterisc.Day15.model.User;

public interface UserRepository extends JpaRepository<User, Integer> {
User findByUname(String username);
}

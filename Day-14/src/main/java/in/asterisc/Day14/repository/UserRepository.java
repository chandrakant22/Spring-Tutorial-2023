package in.asterisc.Day14.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.asterisc.Day14.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	User findByUname(String username);

}

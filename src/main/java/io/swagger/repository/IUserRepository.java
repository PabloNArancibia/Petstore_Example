package io.swagger.repository;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import io.swagger.bo.*;

public interface IUserRepository extends JpaRepository<User, Long>{
	
	
	
	
	  @Qualifier
	  
	  @Query(value =
	  "SELECT * FROM user ", nativeQuery = true)
	  public List<User> FindAllUser();
	 
	

	
	
}
                                                                                                                                                     
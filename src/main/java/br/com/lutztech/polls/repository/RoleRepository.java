package br.com.lutztech.polls.repository;

import java.util.Optional;

import org.springframework.stereotype.Repository;

import br.com.lutztech.polls.model.Role;
import br.com.lutztech.polls.model.RoleName;

@Repository
public interface RoleRepository {

	Optional<Role> findByName(RoleName roleName);
	
}

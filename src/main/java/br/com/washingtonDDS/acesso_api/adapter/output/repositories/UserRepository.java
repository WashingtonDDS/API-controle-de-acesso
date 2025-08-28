package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.output.entity.UserEntity;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
}

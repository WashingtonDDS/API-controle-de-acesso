package br.com.washingtonDDS.acesso_api.adapter.output.repositories;

import br.com.washingtonDDS.acesso_api.adapter.output.entity.UserEntity;
import br.com.washingtonDDS.acesso_api.core.domain.model.User;
import org.springframework.data.jpa.repository.JpaRepository;


public interface UserRepository extends JpaRepository<UserEntity, Long> {
    UserEntity findByEmail(String email);
}

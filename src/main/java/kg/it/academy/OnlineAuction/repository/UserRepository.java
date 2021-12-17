package kg.it.academy.OnlineAuction.repository;

import kg.it.academy.OnlineAuction.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
    @Query(nativeQuery = true, value = "SELECT t.* FROM users t WHERE t.login = :login")
    User findByLogin(String login);
}

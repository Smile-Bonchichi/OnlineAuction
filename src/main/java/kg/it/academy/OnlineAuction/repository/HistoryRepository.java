package kg.it.academy.OnlineAuction.repository;

import kg.it.academy.OnlineAuction.entity.History;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface HistoryRepository extends JpaRepository<History, Long> {
}

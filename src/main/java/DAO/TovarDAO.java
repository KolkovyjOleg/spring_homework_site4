package DAO;

import models.Tovar;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TovarDAO extends JpaRepository<Tovar, Integer> {

}

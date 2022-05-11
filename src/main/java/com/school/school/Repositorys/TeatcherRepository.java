package com.school.school.Repositorys;

import com.school.school.Models.Teatcher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TeatcherRepository  extends JpaRepository<Teatcher,Long> {
}

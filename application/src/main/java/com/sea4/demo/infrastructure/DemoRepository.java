package com.sea4.demo.infrastructure;

import com.sea4.demo.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface DemoRepository extends JpaRepository<Demo, Long> {

}

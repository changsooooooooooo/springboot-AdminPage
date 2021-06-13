package com.adminpage.repository;

import com.adminpage.domain.Block;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
//자동등록 된다.
public interface BlockRepository extends JpaRepository<Block, Long> {
}

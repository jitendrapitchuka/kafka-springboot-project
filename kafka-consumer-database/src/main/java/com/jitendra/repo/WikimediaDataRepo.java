package com.jitendra.repo;

import com.jitendra.entity.WikimediaDataEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface WikimediaDataRepo extends JpaRepository<WikimediaDataEntity,Long> {

}

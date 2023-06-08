package com.com.FileUpload.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.com.FileUpload.Entity.FileEntity;


@Repository
public interface FileRepository extends JpaRepository<FileEntity, Long> {

}

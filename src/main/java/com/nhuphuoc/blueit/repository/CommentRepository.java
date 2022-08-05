package com.nhuphuoc.blueit.repository;

import com.nhuphuoc.blueit.entity.Link;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CommentRepository extends JpaRepository<Link,Long> {
}

package com.springprojects.jwtimplementation.repository;

import com.springprojects.jwtimplementation.entity.OurUsers;
import org.aspectj.apache.bcel.classfile.Module;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.User;

import java.util.Optional;

public interface OurUserRepo  extends JpaRepository<OurUsers, Integer> {


    Optional<OurUsers> findByEmail(String email);
}

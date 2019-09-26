package com.qf.dao;

import com.qf.entity.Emp;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;


public interface IEmpDao extends JpaRepository<Emp,Integer> {

    List<Emp> findAll();
}

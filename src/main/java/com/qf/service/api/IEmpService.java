package com.qf.service.api;

import com.qf.entity.Emp;
import org.springframework.stereotype.Service;

import java.util.List;

public interface IEmpService {
    public List<Emp> getEmpList();
}

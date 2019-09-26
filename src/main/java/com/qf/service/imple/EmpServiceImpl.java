package com.qf.service.imple;

import com.qf.dao.IEmpDao;
import com.qf.entity.Emp;
import com.qf.service.api.IEmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements IEmpService{

    @Autowired
    private IEmpDao empDao;

    public List<Emp> getEmpList(){
        List<Emp> empList = empDao.findAll();
        return empList;
    }
}

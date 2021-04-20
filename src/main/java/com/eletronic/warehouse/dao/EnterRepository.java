package com.eletronic.warehouse.dao;

import com.eletronic.warehouse.pojo.Enter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface EnterRepository extends JpaRepository<Enter,Long> {
    Enter findEnterByTag(Integer tag);


}

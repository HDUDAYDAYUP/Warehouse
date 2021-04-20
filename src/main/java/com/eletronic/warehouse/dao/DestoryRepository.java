package com.eletronic.warehouse.dao;

import com.eletronic.warehouse.pojo.Destory;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.Date;
import java.util.List;

public interface DestoryRepository extends JpaRepository<Destory, Long> {
    Page<Destory> findDestoryByStatusNot(Integer status, Pageable pageable);//查询状态不是已确认的销毁单
    Page<Destory> findDestoryByStatus(Integer status, Pageable pageable);//查询状态是已确认的销毁单
    Destory findDestoryById(Integer id);//查看单个销毁单

    @Query("SELECT destory FROM Destory destory where destory.destoryDate <= :destoryDate and status = 0")
    List<Destory> findBeforeDate(@Param("destoryDate")Date date);
}

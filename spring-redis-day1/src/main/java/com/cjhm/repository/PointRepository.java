package com.cjhm.repository;

import org.springframework.data.repository.CrudRepository;

import com.cjhm.entity.Point;

public interface PointRepository extends CrudRepository<Point, String> {

}

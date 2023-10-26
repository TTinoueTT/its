package com.example.its.domain.issue;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper // MyBatis を利用して、DBに接続できるようになる @Repository の代わり、Bean 登録の役割をしてくれる
public interface IssueRepository {
    @Select("select * from issues")
    List<IssueEntity> findAll();
}

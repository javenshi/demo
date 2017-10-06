package com.syj.demo.dao;

import com.syj.demo.entity.Blogs;

import java.util.List;

public interface BlogsDao {
    public List<Blogs> findAllBlogs();
}

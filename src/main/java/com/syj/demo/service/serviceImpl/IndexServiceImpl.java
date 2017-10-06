package com.syj.demo.service.serviceImpl;

import com.syj.demo.dao.BlogsDao;
import com.syj.demo.entity.Blogs;
import com.syj.demo.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class IndexServiceImpl implements IndexService {
    @Autowired
    BlogsDao blogsDao;
    @Override
    public List<Blogs> findAllBlogs() {
        return blogsDao.findAllBlogs();
    }
}

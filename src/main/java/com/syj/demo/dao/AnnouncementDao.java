package com.syj.demo.dao;

import com.syj.demo.entity.Announcement;

import java.util.List;

public interface AnnouncementDao {

    public List<Announcement> findAll();
}

package com.taolyn.service;

import com.taolyn.pojo.Stu;

/**
 * Created by 陶Lyn
 * on 2020/11/25.
 */
public interface StuService {
     Stu getStuInfo(int id);
     void saveStu();
     void updateStu(int id);
     void deleteStu(int id);
}

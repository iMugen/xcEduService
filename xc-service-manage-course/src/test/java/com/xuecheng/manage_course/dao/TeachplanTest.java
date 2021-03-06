package com.xuecheng.manage_course.dao;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import lombok.extern.log4j.Log4j2;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.stream.Stream;

/**
 * @author Daniel Liu 2019/12/17 20:32
 */

@RunWith( SpringRunner.class )
@SpringBootTest
@Log4j2
public class TeachplanTest {

    @Autowired
    private TeachplanMapper teachPlanMapper;
    @Autowired
    private CourseMapper courseMapper;

    @Test
    public void t(){
        TeachplanNode teachPlanById = teachPlanMapper.findTeachPlanById("4028e581617f945f01617f9dabc40000");
    }

    @Test
    public void findCourseListPage() {
        PageHelper.startPage(1, 2);
        CourseListRequest courseListRequest = new CourseListRequest();
//        courseListRequest.setCompanyId("1");
        Page<CourseInfo> courseListPage = courseMapper.findCourseListPage(courseListRequest);
        Stream.of(courseListPage.getResult()).forEach(System.out::println);
    }
}
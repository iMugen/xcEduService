package com.xuecheng.api;

import com.xuecheng.framework.domain.cms.response.CourseResult;
import com.xuecheng.framework.domain.course.CourseBase;
import com.xuecheng.framework.domain.course.CoursePublishResult;
import com.xuecheng.framework.domain.course.CourseView;
import com.xuecheng.framework.domain.course.Teachplan;
import com.xuecheng.framework.domain.course.ext.CourseInfo;
import com.xuecheng.framework.domain.course.ext.TeachplanNode;
import com.xuecheng.framework.domain.course.request.CourseListRequest;
import com.xuecheng.framework.model.response.QueryResponseResult;
import com.xuecheng.framework.model.response.ResponseResult;
import io.swagger.annotations.ApiOperation;

/**
 * 课程api
 *
 * @author Daniel Liu 2019/12/18 9:25
 */
public interface CourseControllerApi {
    @ApiOperation( "教学计划查询" )
    TeachplanNode findTeachPlanList(String courseId);

    @ApiOperation( "添加教学计划" )
    ResponseResult addTeachPlan(Teachplan teachplan);

    @ApiOperation( "查询我的课程列表" )
    QueryResponseResult<CourseInfo> findCourseList(int page, int size, CourseListRequest courseListRequest);

    @ApiOperation( "新增课程" )
    CourseResult save(CourseBase courseBase);

    @ApiOperation( "根据Id查询课程基本信息" )
    CourseBase getCourseBaseById(String courseId);

    @ApiOperation( "更新课程信息" )
    ResponseResult updateCourseBase(String courseId, CourseBase courseBase);

    @ApiOperation( "课程视图查询" )
    CourseView getCourseViewById(String id);
    //TODO 课程营销功能实现

    @ApiOperation( "课程预览" )
    CoursePublishResult preview(String courseId);

    @ApiOperation( "发布课程" )
    CoursePublishResult publish(String id);
}

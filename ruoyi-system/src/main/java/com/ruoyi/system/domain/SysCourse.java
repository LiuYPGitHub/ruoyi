package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.Date;

/**
 * 课程表 course
 */
@Getter
@Setter
public class SysCourse extends BaseEntity {

    private static final long serialVersionUID = 1L;

    private Long courseId;
    private String courseName;
    private Date courseTime;
    private String courseCategory;
    private String courseIntroduction;
    private String courseImage;

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.MULTI_LINE_STYLE)
                .append("courseId",getCourseId())
                .append("courseName",getCourseName())
                .append("courseTime",getCourseTime())
                .append("courseCategory",getCourseCategory())
                .append("courseIntroduction",getCourseIntroduction())
                .append("courseImage",getCourseImage())
                .append("createBy", getCreateBy())
                .append("createTime", getCreateTime())
                .append("updateBy", getUpdateBy())
                .append("updateTime", getUpdateTime())
                .append("remark", getRemark())
                .toString();
    }
}

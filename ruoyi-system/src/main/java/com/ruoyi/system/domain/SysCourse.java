package com.ruoyi.system.domain;

import com.ruoyi.common.core.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

/**
 * 课程表 course
 */
@Getter
@Setter
public class SysCourse extends BaseEntity {

    private static final long serialVersionUID = 4618504395006388064L;

    private Long courseId;
    private String courseName;
    private Date courseTime;
    private String courseCategory;
    private String courseIntroduction;
    private String courseImage;

    @Override
    public String toString() {
        return "SysCourse{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", courseTime=" + courseTime +
                ", courseCategory='" + courseCategory + '\'' +
                ", courseIntroduction='" + courseIntroduction + '\'' +
                ", courseImage='" + courseImage + '\'' +
                '}';
    }
}

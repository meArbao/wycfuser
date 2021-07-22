package com.zybaiyou.wycfuser.mapper;

import com.zybaiyou.wycfuser.pojo.Wy_user_feedback;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface Wy_user_feedbackMapper {
    int addFeedback(Wy_user_feedback wy_user_feedback);
}

package com.zybaiyou.wycfuser.service;

import com.zybaiyou.wycfuser.pojo.Wy_user_feedback;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public interface Wy_user_feedbackService {

    //添加用户的留言
    int addFeedback(Wy_user_feedback wy_user_feedback);
}

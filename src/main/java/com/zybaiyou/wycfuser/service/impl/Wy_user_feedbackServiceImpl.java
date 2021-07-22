package com.zybaiyou.wycfuser.service.impl;

import com.zybaiyou.wycfuser.mapper.Wy_user_feedbackMapper;
import com.zybaiyou.wycfuser.pojo.Wy_user_feedback;
import com.zybaiyou.wycfuser.service.Wy_user_feedbackService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

@Service
@Repository
public class Wy_user_feedbackServiceImpl implements Wy_user_feedbackService {
    @Autowired
    Wy_user_feedbackMapper wy_user_feedbackMapper;
    public int addFeedback(Wy_user_feedback wy_user_feedback){
        return wy_user_feedbackMapper.addFeedback(wy_user_feedback);
    }

}

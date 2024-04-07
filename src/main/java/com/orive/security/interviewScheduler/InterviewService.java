package com.orive.security.interviewScheduler;


import java.util.List;

public interface InterviewService {

    InterviewDto scheduleInterview(InterviewDto interviewDto);

    List<InterviewDto> getInterview(String schedulerEmail);
    
    List<InterviewDto> getAllInterviews();
}

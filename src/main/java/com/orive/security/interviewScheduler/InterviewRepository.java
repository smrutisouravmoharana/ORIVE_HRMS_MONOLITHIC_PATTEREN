package com.orive.security.interviewScheduler;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface InterviewRepository extends JpaRepository<Interview, Long> {

    List<Interview> getInterviewByScheduler_EmailId(String schedulerEmail);
}

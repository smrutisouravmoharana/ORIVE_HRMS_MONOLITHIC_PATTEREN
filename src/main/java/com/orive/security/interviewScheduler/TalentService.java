package com.orive.security.interviewScheduler;

import java.util.List;

public interface TalentService {

    TalentDto createTalent(TalentDto talentDto);

    Talent getTalent(Long talentId);

    List<TalentDto> findAll();
}

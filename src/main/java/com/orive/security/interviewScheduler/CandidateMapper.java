package com.orive.security.interviewScheduler;


import java.util.List;

import org.mapstruct.Mapper;


@Mapper
public interface CandidateMapper {

    CandidateDto toCandidateDto(Candidate candidate);

    Candidate toCandidate(CandidateDto candidateDto);
    
    List<CandidateDto> toCandidateDtoList(List<Candidate> candidates);
   }



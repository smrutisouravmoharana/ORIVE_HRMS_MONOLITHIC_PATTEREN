package com.orive.security.interviewScheduler;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TalentServiceImpl implements TalentService {

    @Autowired
    private TalentRepository talentRepository;
    @Autowired
    private TalentMapper talentMapper;

    @Override
    public TalentDto createTalent(TalentDto talentDto) {
        Talent talent = talentMapper.toTalent(talentDto);
        talent = talentRepository.save(talent);
        talentDto = talentMapper.toTalentDto(talent);
        return talentDto;
    }

    @Override
    public Talent getTalent(Long talentId) {
        Talent talent = talentRepository.findById(talentId).orElseThrow(() -> new ResourceNotFoundException("Talent not found", HttpStatus.NOT_FOUND));
        return talent;
    }
    
    @Override
    public List<TalentDto> findAll() {
        List<Talent> talents = talentRepository.findAll();
        List<TalentDto> talentDtos = talentMapper.toTalentDtos(talents);
        return talentDtos;
    }
}

package com.orive.security.interviewScheduler;

import java.util.List;
import org.springframework.web.multipart.MultipartFile;


public interface CandidateService {

//    CandidateDto saveCandidate(CandidateDto candidateDto);
	
	String saveCandidate(String name, String address, String email, String mobile, Integer ctc, Integer ectc,
			String location, String notice, MultipartFile file);

    CandidateDto getCandidate(String email);

    Candidate findCandidateByEmail(String email);

	byte[] downloadPdf(Long id);
	
	 List<CandidateDto> getAllCandidates();

    


}

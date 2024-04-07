package com.orive.security.payroll;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;




public interface PaySlipGenerateRepository extends JpaRepository<PaySlipGenerateEntity, String> {

	@Query("SELECT p.department, SUM(p.netSalary) FROM PaySlipGenerateEntity p " +
            "WHERE YEAR(p.createdDate) = :year " +
            "AND MONTH(p.createdDate) = :month " +
            "GROUP BY p.department")
    List<Object[]> getTotalNetSalaryForDepartmentsInMonth(@Param("year") int year, @Param("month") int month);
    
    List<PaySlipGenerateEntity> findByUsername(String username);
}
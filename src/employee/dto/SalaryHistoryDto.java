package employee.dto;

import lombok.Data;

@Data
public class SalaryHistoryDto {
    private Integer eno;
    private String name;
    private Integer oldSalary;
    private Integer newSalary;
}

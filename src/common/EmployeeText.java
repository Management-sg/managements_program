package common;

/**
 * 직원 관련 메시지 텍스트 Enum
 */
public enum EmployeeText {
    MENU_HEADER("\n====================================\n[직원 관리 시스템]\n===================================="),
    MENU_BORDER("------------------------------------"),
    MENU_OPTIONS("1. 직원 생성\n2. 직원 삭제\n3. 직원 조회\n4. 직원 수정\n5. 급여 인상\n6. 종료"),
    ENTER_EMPLOYEE_NUMBER("수정할 직원의 번호를 입력하세요: "),
    UPDATE_PROMPT("직원 정보를 업데이트합니다."),
    CHOOSE_UPDATE_OPTION("변경할 정보를 선택하세요:\n1. 이름 | 2. 직급 | 3. 급여 | 4. 입사연도 | 5. 입사월 | 6. 입사일 | 7. 부서 번호 | 8. 업데이트 종료"),
    ENTER_CHOICE("선택: "),
    ENTER_NAME("이름을 입력하세요: "),
    ENTER_ROLE("직급을 입력하세요: "),
    ENTER_SALARY("급여를 입력하세요: "),
    ENTER_ENTRY_YEAR("입사 연도를 입력하세요: "),
    ENTER_ENTRY_MONTH("입사 월을 입력하세요: "),
    ENTER_ENTRY_DAY("입사 일을 입력하세요: "),
    ENTER_SECTION_NUMBER("부서 번호를 입력하세요: "),
    UPDATE_CANCELLED("업데이트가 종료되었습니다."),
    INVALID_CHOICE("잘못된 선택입니다. 업데이트가 취소되었습니다."),
    UPDATE_SUCCESS("직원 정보가 성공적으로 업데이트되었습니다."),
    READ_ALL("전체 임직원 정보를 검색 합니다."),
    READ_ALL_NULL("저장된 직원 정보가 없습니다."),
    READ_ONE_CHOICE("1. 전체 검색 2. 사번 검색"),
    READ_ONE_INPUT_ENO("검색할 임직원 사번을 입력하세요"),
    INVALID_CHOICE_MAIN("잘못된 선택입니다."),
    DELETE_PROMPT("직원 정보를 삭제합니다."),
    DELETE_SUCCESS("직원 정보가 성공적으로 삭제되었습니다."),
    DELETE_CANCELLED("직원 정보 삭제가 취소되었습니다."),
    DELETE_EMPLOYEE_NUMBER("삭제할 직원의 번호를 입력하세요: "),
    SALARY_UPDATE_SUCCESS("직원 급여가 성공적으로 인상되었습니다."),
    EXIT_MESSAGE("직원 관리 시스템을 종료합니다."),
    ENTER_INPUT_EMPLOYEE("직원 정보를 입력합니다."),
    EMPLOYEE_CREATE_SUCCESS("직원 정보 생성 성공!"),
    EMPLOYEE_CREATE_FAIL("직원 정보 생성 실패!");


    private final String text;

    EmployeeText(String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }
}


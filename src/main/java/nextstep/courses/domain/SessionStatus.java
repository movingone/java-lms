package nextstep.courses.domain;

public class SessionStatus {

    private Status status;

    public SessionStatus(String status) {
        statusCheck(status);
        this.status = Status;
    }

    private void statusCheck(String status) {
        if (!(status.equals(prepare) || status.equals(end) || status.equals(recruit)))
            throw new IllegalArgumentException("잘못된 강의 상태 입니다");
    }

    public boolean check() {
        return status.equals(recruit);
    }
}

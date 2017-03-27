package univ.sm.board;

import java.sql.Time;

/**
 * Created by SooJeong on 2017-03-24.
 */

public class Board {
    private String board_no;    //게시글 번호 CALL_BOARD_NO
    private String write_name;            //작성자 명
    private String passwd;                //비밀번호
    private String department;            //학과
    private String student_no;        //학번
    private String departure;            //출발지
    private String departure_detail;    //출발지 설명
    private String destination;        //목적지
    private String destination_detail;  //목적지설명
    private String reg_id;               //gcm(push) 기기값
    private Boolean use_flag;            //사용flag Y/N
    private int passenger_num;        //총 인원
    private Time wait_time;          //대기시간  남은시간 표현하려면 현재시간 - 대기시간 = 남은시간.  이렇게 해도되고... return value에 추가를 해줄까 ...
    private String insert_time;     //등록시간
    private String insert_date;        //등록날짜

    public Board(String board_no, String write_name, String passwd, String department,
                 String student_no, String departure, String departure_detail, String destination,
                 String destination_detail, String reg_id, Boolean use_flag, int passenger_num,
                 Time wait_time, String insert_time, String insert_date) {

        this.board_no = board_no;
        this.write_name = write_name;
        this.passwd = passwd;
        this.department = department;
        this.student_no = student_no;
        this.departure = departure;
        this.departure_detail = departure_detail;
        this.destination = destination;
        this.destination_detail = destination_detail;
        this.reg_id = reg_id;
        this.use_flag = use_flag;
        this.passenger_num = passenger_num;
        this.wait_time = wait_time;
        this.insert_time = insert_time;
        this.insert_date = insert_date;
    }

    public String getBoard_no() {
        return board_no;
    }

    public void setBoard_no(String board_no) {
        this.board_no = board_no;
    }

    public String getWrite_name() {
        return write_name;
    }

    public void setWrite_name(String write_name) {
        this.write_name = write_name;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getStudent_no() {
        return student_no;
    }

    public void setStudent_no(String student_no) {
        this.student_no = student_no;
    }

    public String getDeparture() {
        return departure;
    }

    public void setDeparture(String departure) {
        this.departure = departure;
    }

    public String getDeparture_detail() {
        return departure_detail;
    }

    public void setDeparture_detail(String departure_detail) {
        this.departure_detail = departure_detail;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getDestination_detail() {
        return destination_detail;
    }

    public void setDestination_detail(String destination_detail) {
        this.destination_detail = destination_detail;
    }

    public String getReg_id() {
        return reg_id;
    }

    public void setReg_id(String reg_id) {
        this.reg_id = reg_id;
    }

    public Boolean getUse_flag() {
        return use_flag;
    }

    public void setUse_flag(Boolean use_flag) {
        this.use_flag = use_flag;
    }

    public int getPassenger_num() {
        return passenger_num;
    }

    public void setPassenger_num(int passenger_num) {
        this.passenger_num = passenger_num;
    }

    public Time getWait_time() {
        return wait_time;
    }

    public void setWait_time(Time wait_time) {
        this.wait_time = wait_time;
    }

    public String getInsert_time() {
        return insert_time;
    }

    public void setInsert_time(String insert_time) {
        this.insert_time = insert_time;
    }

    public String getInsert_date() {
        return insert_date;
    }

    public void setInsert_date(String insert_date) {
        this.insert_date = insert_date;
    }
}